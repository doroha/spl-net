package bgu.spl.net.impl.Commands;

import bgu.spl.net.api.Visitor;

public class Stat extends CommandCS {

    private static final short Opcode=8;
    private String username;
    public Stat (String username){
        super("Stat");
        this.username=username;
    }

    @Override
    public void accept(Visitor visitor) {

    }
}
