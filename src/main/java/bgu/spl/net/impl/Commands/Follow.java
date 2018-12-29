package bgu.spl.net.impl.Commands;

import bgu.spl.net.api.Visitor;

import java.util.List;

public class Follow extends CommandCS {


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
    public void accept(Visitor visitor) {

    }
}
