package bgu.spl.net.impl.Commands;

import javafx.util.Pair;

public class Post extends Command {

    private static final short Opcode=5;
    private Pair<String, String> content;
    public Post(Pair content){
        super("Post");
        this.content=content;
    }
    @Override
    public void process() {

    }
}
