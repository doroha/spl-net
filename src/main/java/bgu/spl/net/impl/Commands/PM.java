package bgu.spl.net.impl.Commands;

public class PM extends Command {
    private static final short Opcode=6;
    private String username;
    private String content;

    public PM(String username, String content){
        super("Command");
        this.content=content;
        this.username=username;


    }
    @Override
    public void process() {

    }
}
