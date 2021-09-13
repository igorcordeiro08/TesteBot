package igor.testebot.commands;

import igor.testebot.core.Command;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.util.ArrayList;

public class CmdRemove implements Command {


    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        String MsgContent = event.getMessage().getContentRaw();
        ArrayList<String> Title = MsgContent.split(" ");
        Title.remove(0);
        MsgContent = String.join(", ", Title);
        event.getTextChannel().sendMessage("A música "+
                MsgContent+
                " Foi removida da fila"
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
