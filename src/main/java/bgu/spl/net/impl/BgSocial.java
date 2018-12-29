package bgu.spl.net.impl;

import bgu.spl.net.api.bidi.BidiMessagingProtocol;
import bgu.spl.net.api.bidi.Connections;
import bgu.spl.net.impl.Commands.*;

import java.util.List;

public class BgSocial<T> implements BidiMessagingProtocol<T> {

  private int opCode;

   public BgSocial(){}
    /**
     * Used to initiate the current client protocol with it's personal connection ID and the connections implementation
     *
     * @param connectionId
     * @param connections
     */
    @Override
    public void start(int connectionId, Connections connections) {

    }

    @Override
    public void process(T message) {

     String result=executeCommand(message);

    }

    private String executeCommand(T message) {  //get bytes array

     List<String> params = getMsgAsList(message);

     //we get a command and we need to separate it by the char 0
     String commandName = "";
     if(params.size() > 0){
      commandName = params.remove(0);
     }

     return "str";
    }

 private List<String> getMsgAsList(T message) { //return list of string from stream of Bytes

  Byte[] bytes = (Byte[]) message;

  opCode = bytes[1];
  int i=2;
  String username= getParam(i, bytes);
  i+=username.length() +1;
  String password= getParam(i, bytes);
  String content= getParam(i, bytes);



  switch (opCode) {
    case 1: //Register case
    new Register(username, password);
    break;
    case 2://login case
    new Login(username,password);
    break;
    case 3://logout case
    new Logout();
    break;
    case 4: //follow
    int follow= bytes[3].intValue();

    new Follow(follow,);
    case 5: //Post

     new Post( <username, content>);
  }



 return null;
 }

 private String getParam(int index,Byte [] bytes){

  String userName="";
  while (bytes[index]!=0){
   userName+=bytes[index];
   index++;
  }
 }

 /**
     * @return true if the connection should be terminated
     */
    @Override
    public boolean shouldTerminate() {
        return false;
    }






}

