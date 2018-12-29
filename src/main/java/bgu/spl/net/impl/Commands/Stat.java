package bgu.spl.net.impl.Commands;

public class Stat extends Command {

    private static final short Opcode=8;
    private String username;
    public Stat (String username){
        super("Stat");
        this.username=username;
    }
    @Override
    public void process() {

    }

}
