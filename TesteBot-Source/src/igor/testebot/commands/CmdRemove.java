package igor.testebot.commands;

import igor.testebot.core.Command;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.util.ArrayList;
import java.util.Arrays;

public class CmdRemove implements Command {

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        String msg = event.getMessage().getContentRaw();
        ArrayList<String> MsgContent = new ArrayList<>(Arrays.asList(msg.split(" ")));
        MsgContent.remove(0);
        String Title = String.join(" ", MsgContent);
        event.getTextChannel().sendMessage("A música **"+
                Title+
                "** Foi removida da fila"
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
