package bgu.spl.net.impl.Commands;

public abstract class Command {

    private String name;

    public Command(String name){
        this.name=name;
    }
    public abstract void process();
    public String getName(){return this.name;}
}
