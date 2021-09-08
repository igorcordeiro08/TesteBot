package igor.testebot.core;

import igor.testebot.utils.UTILS;
import net.dv8tion.jda.api.entities.ChannelType;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class messageListener extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent event){
        if (event.getAuthor().isBot()){
            return;
        }
        if (event.getChannelType()== ChannelType.PRIVATE){
            event.getAuthor().openPrivateChannel().complete().
                    sendMessage(""+event.getAuthor().getName()+"**,Nao é aceito mensagens privadas").
                    queue();
            return;
        }
        String message= event.getMessage().getContentDisplay();
        if(message.startsWith(UTILS.getPrefix)&& event.getAuthor().getId() != event.getJDA().getSelfUser().getId()){
            //caso o comando comece com o prefix e seja != do bot
            commandHandler.handleCommand(commandHandler.parser.parse(message,event));
        }
    }
}
