package bgu.spl.net.impl.Commands;

import bgu.spl.net.api.Visitor;

public class PM extends CommandCS {
    private static final short Opcode=6;
    private String username;
    private String content;

    public PM(String username, String content){
        super("CommandCS");
        this.content=content;
        this.username=username;


    }

    @Override
    public void accept(Visitor visitor) {

    }
}
