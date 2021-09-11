package igor.testebot.main;

import igor.testebot.commands.CmdHelp;
import igor.testebot.commands.CmdPing;
import igor.testebot.commands.CmdPlay;
import igor.testebot.commands.CmdRemove;
import igor.testebot.core.commandHandler;
import igor.testebot.core.messageListener;
import igor.testebot.listeners.readyListener;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

import javax.security.auth.login.LoginException;
import java.util.EnumSet;


public class Main {
    public static JDA jda;


    public static void main(String[] args) throws LoginException {
        String token="ODc4Njc2MDIwNjA0MDU5Njg4.YSEo0A.5H90d-gSsU88GT-nRcaGQiVhKCg";
        jda= JDABuilder.create(token, EnumSet.allOf(GatewayIntent.class)).build();

        jda.addEventListener(new readyListener());
        jda.addEventListener(new messageListener());

        commandHandler.commands.put("help", new CmdHelp());
        commandHandler.commands.put("ping", new CmdPing());
        commandHandler.commands.put("play", new CmdPlay());
        commandHandler.commands.put("remove", new CmdRemove());

    }
}
