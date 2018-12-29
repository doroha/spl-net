package bgu.spl.net.impl.Commands;

import bgu.spl.net.api.Visited;

public abstract class CommandCS implements Visited {  //Abstract Class for Client-Server Commands - every client - server command is the visited in our Visitor design pattern.

    private String name;

    public CommandCS(String name){
        this.name=name;
    }
    public String getName(){return this.name;}
}
