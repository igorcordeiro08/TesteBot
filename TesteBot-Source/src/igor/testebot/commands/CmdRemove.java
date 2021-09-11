package igor.testebot.commands;

import igor.testebot.core.Command;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class CmdRemove implements Command {


    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        String MsgContent = event.getMessage().getContentBeheaded();
        event.getTextChannel().sendMessage("A música "+
                MsgContent+
                " Foi adicionada à fila"
        ).queue();;
        return false;
        // TODO: This command should take the song name and remove it from the array of songs along with it's info from the API
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {

    }

    @Override
    public void executed(boolean success, MessageReceivedEvent event) {

    }

    @Override
    public String help() {
        return null;
    }
}
