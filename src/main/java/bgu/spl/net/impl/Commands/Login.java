package bgu.spl.net.impl.Commands;

import bgu.spl.net.api.Visitor;

public class Login extends CommandCS {

        private static final short Opcode=2;
        private String username;
        private String password;

        public Login(String username, String password){
            super("Login");
            this.username=username;
            this.password=password;

        }

    @Override
    public void accept(Visitor visitor) {

    }
}
