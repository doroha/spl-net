package bgu.spl.net.impl.Commands;

import java.util.List;

public class Follow extends Command {


    private static final short Opcode=4;
    private short followOrUnfollow;
    private int numOfUsers;
    private List<String> userNameList;
    public Follow(short followOrUnfollow, int numOfUsers, List userNameList){
        super("Follow");
        this.followOrUnfollow=followOrUnfollow;
        this.numOfUsers=numOfUsers;
        this.userNameList=userNameList;
    }
    @Override
    public void process() {

    }
}
