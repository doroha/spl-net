package bgu.spl.net.impl.Commands;

import bgu.spl.net.api.Visitor;

public class Userlist extends CommandCS {

    private static final short Opcode=7;
    public Userlist(){
        super("Userlist");
    }

    @Override
    public void accept(Visitor visitor) {

    }
}
