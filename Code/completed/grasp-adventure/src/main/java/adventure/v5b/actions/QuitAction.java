package adventure.v5b.actions;

import adventure.v5b.Action;
import adventure.v5b.ActionTag;
import adventure.v5b.Player;

import java.util.EnumSet;

public class QuitAction implements Action {
    @Override
    public String getDescription() {
        return "Exit the game.";
    }

    @Override
    public EnumSet<ActionTag> getTags() {
        return EnumSet.of(ActionTag.QUIT);
    }

    @Override
    public void perform(Player instigator) {

    }
}
