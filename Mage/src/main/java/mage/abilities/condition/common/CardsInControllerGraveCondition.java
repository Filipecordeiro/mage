package mage.abilities.condition.common;

import mage.abilities.Ability;
import mage.abilities.condition.Condition;
import mage.filter.FilterCard;
import mage.game.Game;
import mage.players.Player;
import mage.util.CardUtil;

/**
 * Condition for - Controller has X or more cards in his or her graveyard
 *
 * @author LevelX2
 */
public class CardsInControllerGraveCondition implements Condition {

    private final int value;
    private final FilterCard filter;

    public CardsInControllerGraveCondition(int value) {
        this(value, null);
    }

    public CardsInControllerGraveCondition(int value, FilterCard filter) {
        this.value = value;
        this.filter = filter;
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player player = game.getPlayer(source.getControllerId());
        if (filter != null) {
            return player != null && player.getGraveyard().count(filter, source.getSourceId(), source.getControllerId(), game) >= value;
        }
        return player != null && player.getGraveyard().size() >= value;
    }

    @Override
    public String toString() {
        return "there are " + CardUtil.numberToText(value, "one") + " or more "
                + (filter == null ? "cards" : filter.getMessage())
                + " in your graveyard";
    }

}
