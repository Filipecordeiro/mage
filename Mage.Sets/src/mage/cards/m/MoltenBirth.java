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
package mage.cards.m;

import java.util.Random;
import java.util.UUID;
import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.effects.OneShotEffect;
import mage.cards.Card;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Outcome;
import mage.constants.Zone;
import mage.game.Game;
import mage.game.permanent.token.Token;
import mage.players.Player;
import mage.util.RandomUtil;

/**
 *
 * @author jeffwadsworth
 */
public class MoltenBirth extends CardImpl {

    public MoltenBirth(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.SORCERY},"{1}{R}{R}");


        // Create two 1/1 red Elemental creature tokens. Then flip a coin. If you win the flip, return Molten Birth to its owner's hand.
        this.getSpellAbility().addEffect(new MoltenBirthEffect());
        
    }

    public MoltenBirth(final MoltenBirth card) {
        super(card);
    }

    @Override
    public MoltenBirth copy() {
        return new MoltenBirth(this);
    }
}

class MoltenBirthEffect extends OneShotEffect {

    public MoltenBirthEffect() {
        super(Outcome.PutCreatureInPlay);
        staticText = "Create two 1/1 red Elemental creature tokens. Then flip a coin. If you win the flip, return {this} to its owner's hand";
    }

    public MoltenBirthEffect(final MoltenBirthEffect effect) {
        super(effect);
    }

    @Override
    public MoltenBirthEffect copy() {
        return new MoltenBirthEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player controller = game.getPlayer(source.getControllerId());
        Card molten = game.getCard(source.getSourceId());
        if (controller != null) {
            ElementalToken token = new ElementalToken();
            token.putOntoBattlefield(2, game, source.getSourceId(), source.getControllerId());
            if (controller.flipCoin(game)) {
                molten.moveToZone(Zone.HAND, source.getSourceId(), game, true);
                game.informPlayers(controller.getLogName() + " won the flip.  " + molten.getLogName() +" is returned to "+ controller.getLogName() + "'s hand.");
            }
            return true;
        }
        return false;
    }

    class ElementalToken extends Token {

        public ElementalToken() {
            super("Elemental", "1/1 red Elemental creature");
            this.setOriginalExpansionSetCode("M14");
            this.setTokenType(RandomUtil.nextInt(2) + 1);
            cardType.add(CardType.CREATURE);
            color.setRed(true);
            subtype.add("Elemental");
            power = new MageInt(1);
            toughness = new MageInt(1);
        }
    }
}
