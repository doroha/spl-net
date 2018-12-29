package bgu.spl.net.impl.Commands;

public class Register extends Command {
    private static final short Opcode=1;
    private String username;
    private String password;

    public Register(String username, String password){
        super("Register");
        this.username=username;
        this.password=password;
    }
    @Override
    public void process() {

    }
}
