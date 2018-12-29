package bgu.spl.net.impl;

import bgu.spl.net.impl.Commands.Command;

import java.util.HashMap;
import java.util.Vector;

public class DataBase {

    private HashMap<String,Vector<Command>> userData;



    public DataBase(){
        this.userData=new HashMap<>();
    }

    public void addMesage(String user,Command m){
        userData.putIfAbsent(user,new Vector<>());
        userData.get(user).add(m);
    }




}
