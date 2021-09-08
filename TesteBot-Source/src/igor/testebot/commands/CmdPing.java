package igor.testebot.commands;

import igor.testebot.core.Command;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class CmdPing implements Command {


    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        event.getTextChannel().sendMessage(":ping_pong: Pong! "+event.getJDA().getGatewayPing()+" ms!"
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
