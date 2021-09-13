package igor.testebot.commands;

import igor.testebot.core.Command;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.util.ArrayList;

public class CmdPlay implements Command {


    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        String msg = event.getMessage().getContentRaw();
        ArrayList<String> MsgContent = msg.split(" ");
        MsgContent.remove(0);
        Title = String.join(",", Title);
        event.getTextChannel().sendMessage("A música "+
                Title+
                " Foi adicionada à fila"
        ).queue();;
        return false;
        // TODO: This command should take the song name and add it to the array of songs along with it's info from the API
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
