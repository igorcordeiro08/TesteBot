package igor.testebot.core;

import java.util.HashMap;

public class commandHandler {
    public static HashMap<String,Command> commands =new HashMap<>();
    public static final commandParser parser=new commandParser();
    public static void handleCommand(commandParser.commandContainer cmd)
    {
        if (commands.containsKey(cmd.invoke)){//checar se o comando existe
            boolean safe=commands.get(cmd.invoke).called(cmd.args,cmd.event);

            if(!safe){
                commands.get(cmd.invoke).action(cmd.args,cmd.event);
                commands.get(cmd.invoke).executed(safe,cmd.event);
            }
            else{
                commands.get(cmd.invoke).executed(safe,cmd.event);

            }
        }
    }
}
