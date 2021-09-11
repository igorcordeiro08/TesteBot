package igor.testebot.commands;

import igor.testebot.core.Command;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class CmdPlay implements Command {


    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        String MsgContent = event.getMessage().getContentRaw();
        event.getTextChannel().sendMessage("A música"+
                MsgContent+
                "Foi adicionada à fila"
        ).queue();;
        return false;
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
