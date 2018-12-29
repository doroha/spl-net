package bgu.spl.net.impl.Commands;

public class Notification extends CommandSC {

    private static final short Opcode=9;

    private int type;
    private String postingUser;
    private String content;
    public Notification(int type, String postingUser, String content){
        super("Notification");
        this.type=type;
        this.postingUser=postingUser;
        this.content=content;
    }

}
