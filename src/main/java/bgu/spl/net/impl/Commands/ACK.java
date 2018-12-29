package bgu.spl.net.impl.Commands;

public class ACK extends Command {


    private static final short Opcode=10;
    public ACK(){
        super("ACK");
    }

    @Override
    public void process() {

    }
}
