/*
 *  Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without modification, are
 *  permitted provided that the following conditions are met:
 *
 *     1. Redistributions of source code must retain the above copyright notice, this list of
 *        conditions and the following disclaimer.
 *
 *     2. Redistributions in binary form must reproduce the above copyright notice, this list
 *        of conditions and the following disclaimer in the documentation and/or other materials
 *        provided with the distribution.
 *
 *  THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 *  WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 *  FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 *  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 *  ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 *  ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *  The views and conclusions contained in the software and documentation are those of the
 *  authors and should not be interpreted as representing official policies, either expressed
 *  or implied, of BetaSteward_at_googlemail.com.
 */
package mage.cards.q;

import java.util.UUID;
import mage.abilities.TriggeredAbilityImpl;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.common.RemoveCountersSourceCost;
import mage.abilities.costs.common.SacrificeSourceCost;
import mage.abilities.effects.common.counter.AddCountersSourceEffect;
import mage.abilities.effects.common.counter.AddCountersTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Zone;
import mage.counters.CounterType;
import mage.game.Game;
import mage.game.events.DamagedCreatureEvent;
import mage.game.events.GameEvent;
import mage.game.events.GameEvent.EventType;
import mage.game.permanent.Permanent;
import mage.target.common.TargetCreaturePermanent;

/**
 *
 * @author North
 */
public class QuestForTheGemblades extends CardImpl {

    public QuestForTheGemblades(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.ENCHANTMENT},"{1}{G}");


        // Whenever a creature you control deals combat damage to a creature, you may put a quest counter on Quest for the Gemblades.
        this.addAbility(new QuestForTheGembladesTriggeredAbility());
        // Remove a quest counter from Quest for the Gemblades and sacrifice it: Put four +1/+1 counters on target creature.
        SimpleActivatedAbility ability = new SimpleActivatedAbility(Zone.BATTLEFIELD,
                new AddCountersTargetEffect(CounterType.P1P1.createInstance(4)),
                new RemoveCountersSourceCost(CounterType.QUEST.createInstance()));
        ability.addCost(new SacrificeSourceCost());
        ability.addTarget(new TargetCreaturePermanent());
        this.addAbility(ability);
    }

    public QuestForTheGemblades(final QuestForTheGemblades card) {
        super(card);
    }

    @Override
    public QuestForTheGemblades copy() {
        return new QuestForTheGemblades(this);
    }
}

class QuestForTheGembladesTriggeredAbility extends TriggeredAbilityImpl {

    public QuestForTheGembladesTriggeredAbility() {
        super(Zone.BATTLEFIELD, new AddCountersSourceEffect(CounterType.QUEST.createInstance()), true);
    }

    public QuestForTheGembladesTriggeredAbility(final QuestForTheGembladesTriggeredAbility ability) {
        super(ability);
    }

    @Override
    public QuestForTheGembladesTriggeredAbility copy() {
        return new QuestForTheGembladesTriggeredAbility(this);
    }

    @Override
    public boolean checkEventType(GameEvent event, Game game) {
        return event.getType() == EventType.DAMAGED_CREATURE;
    }

    @Override
    public boolean checkTrigger(GameEvent event, Game game) {
        if (((DamagedCreatureEvent) event).isCombatDamage()) {
            Permanent permanent = game.getPermanent(event.getSourceId());
            if (permanent == null) {
                permanent = (Permanent) game.getLastKnownInformation(event.getSourceId(), Zone.BATTLEFIELD);
            }
            if (permanent != null && permanent.getCardType().contains(CardType.CREATURE) && permanent.getControllerId().equals(this.getControllerId())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getRule() {
        return "Whenever a creature you control deals combat damage to a creature, " + super.getRule();
    }
}
