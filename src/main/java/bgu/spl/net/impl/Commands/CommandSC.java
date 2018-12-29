package bgu.spl.net.impl.Commands;

public class CommandSC {  //Abstract Class for Server-Client Commands

    private String name;

    public CommandSC(String name){
        this.name=name;
    }
    public String getName(){return this.name;}
}
