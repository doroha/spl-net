package bgu.spl.net.impl.Commands;

public class Login extends Command {

        private static final short Opcode=2;
        private String username;
        private String password;

        public Login(String username, String password){
            super("Login");
            this.username=username;
            this.password=password;

        }
    @Override
    public void process() {

    }
    }
