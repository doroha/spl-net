package bgu.spl.net.impl.Commands;

import bgu.spl.net.api.Visitor;

public class Register extends CommandCS {
    private static final short Opcode=1;
    private String username;
    private String password;

    public Register(String username, String password){
        super("Register");
        this.username=username;
        this.password=password;
    }

    @Override
    public void accept(Visitor visitor) {

    }
}
