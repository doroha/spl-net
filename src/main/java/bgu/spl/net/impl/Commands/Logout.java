package bgu.spl.net.impl.Commands;

import bgu.spl.net.api.Visitor;

public class Logout extends CommandCS {

    private static final short Opcode= 3;

    public Logout(){
        super("Logout");
    }

    @Override
    public void accept(Visitor visitor) {

    }
}
