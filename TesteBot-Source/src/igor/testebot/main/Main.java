package igor.testebot.main;

import igor.testebot.commands.readyListener;
import igor.testebot.core.messageListener;
import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

import javax.security.auth.login.LoginException;
import java.util.EnumSet;


public class Main {
    public static JDA jda;


    public static void main(String[] args) throws LoginException {
        String token="ODc4Njc2MDIwNjA0MDU5Njg4.YSEo0A.Bzw9tsc58ocb5D34MViXA-C2DTA";
        jda= JDABuilder.create(token, EnumSet.allOf(GatewayIntent.class)).build();

        jda.addEventListener(new readyListener());
        jda.addEventListener(new messageListener());



    }
}
