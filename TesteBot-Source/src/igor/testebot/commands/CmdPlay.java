package igor.testebot.commands;

import igor.testebot.core.Command;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class CmdPlay implements Command {


    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        Message M = event.getMessage();
        event.getTextChannel().sendMessage("A música"+
                M+
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
