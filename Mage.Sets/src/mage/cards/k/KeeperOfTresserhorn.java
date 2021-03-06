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
package mage.cards.k;

import java.util.UUID;
import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.AttacksAndIsNotBlockedTriggeredAbility;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.LoseLifeTargetEffect;
import mage.abilities.effects.common.continuous.AssignNoCombatDamageSourceEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;

/**
 *
 * @author LoneFox
 */
public class KeeperOfTresserhorn extends CardImpl {

    public KeeperOfTresserhorn(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.CREATURE},"{5}{B}");
        this.subtype.add("Avatar");
        this.power = new MageInt(6);
        this.toughness = new MageInt(6);

        // Whenever Keeper of Tresserhorn attacks and isn't blocked, it assigns no combat damage this turn and defending player loses 2 life.
        Effect effect = new AssignNoCombatDamageSourceEffect(Duration.EndOfTurn);
        effect.setText("it assigns no combat damage this turn");
        Ability ability = new AttacksAndIsNotBlockedTriggeredAbility(effect, false, true);
        effect = new LoseLifeTargetEffect(2);
        effect.setText("and defending player loses 2 life");
        ability.addEffect(effect);
        this.addAbility(ability);
    }

    public KeeperOfTresserhorn(final KeeperOfTresserhorn card) {
        super(card);
    }

    @Override
    public KeeperOfTresserhorn copy() {
        return new KeeperOfTresserhorn(this);
    }
}
