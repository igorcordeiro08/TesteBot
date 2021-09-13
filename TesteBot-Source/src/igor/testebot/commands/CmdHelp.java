package igor.testebot.commands;

import igor.testebot.core.Command;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class CmdHelp implements Command {


    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        event.getTextChannel().sendMessage("**Comandos**"+
                "\n '!help'- Mostra isso"+
                "\n '!ping'- Mostra o ping do bot"+
                "\n '!play'- toca a musica"+
                "\n '!remove'- remove a musica"
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
