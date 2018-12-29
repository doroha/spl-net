package bgu.spl.net.impl.Commands;

import bgu.spl.net.api.Visitor;
import javafx.util.Pair;

public class Post extends CommandCS {

    private static final short Opcode=5;
    private Pair<String, String> content;
    public Post(Pair content){
        super("Post");
        this.content=content;
    }

    @Override
    public void accept(Visitor visitor) {

    }
}
