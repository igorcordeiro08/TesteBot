package igor.testebot.commands;


import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;


public class readyListener extends ListenerAdapter {
    public void onReady(ReadyEvent event ){
        event.getJDA().getTextChannelById("878689825807552586").sendMessage("Olá voltei").queue();



    }
}
