package bgu.spl.net.impl.EncoderDecoder;


import bgu.spl.net.api.MessageEncoderDecoder;
import bgu.spl.net.impl.Commands.ClientServer.*;
import bgu.spl.net.impl.Commands.Commands;
import bgu.spl.net.impl.Commands.ServerClient.Notification;

public class EncoderDecoder implements MessageEncoderDecoder<Commands> {

    private byte[] bytes = new byte[1024]; //start with 1k
    private int len = 0;
    private short opcode;
    private Commands comm=null;
    @Override
    public Commands decodeNextByte(byte nextByte) {
        if (len==0) {
            opcode += (short)((bytes[0] & 0xff) << 8);
            len++;
            return null;
        }
        if( len== 1){
            opcode += (short)(bytes[1] & 0xff);
            len++;
            return null;
        }
        if (len==2){
            comm= get();
            len= 0;
            opcode=0;
        }
        return ((Commands)comm).decodeNextByte(nextByte);//TODO need to call function decode next byte!!!
    }

    private Commands  get(){

        Commands Commands= null;
        switch (opcode) {
            case 1: //Register case
                Commands =(Commands) new Register();
                break;
            case 2://login case
                Commands = (Commands) new Login();
                break;
            case 3://logout case
                Commands = (Commands) new Logout();
                break;
            case 4: //follow
                Commands= (Commands) new Follow();
                break;
            case 5: //Post
                Commands=(Commands) new Post();
                break;
            case 6:
                Commands=(Commands)new PM();
                break;
            case 7:
                Commands= (Commands)new Userlist();
                break;
            case 8:
                Commands= (Commands) new Stat();
                break;
            case 9:
                Commands =(Commands) new Notification();
                break;
        }
        return Commands;
    }

    public short bytesToShort(byte[] byteArr)
    {
        short result = (short)((byteArr[0] & 0xff) << 8);
        result += (short)(byteArr[1] & 0xff);
        return result;
    }

    public byte[] shortToBytes(short num)
    {
        byte[] bytesArr = new byte[2];
        bytesArr[0] = (byte)((num >> 8) & 0xFF);
        bytesArr[1] = (byte)(num & 0xFF);
        return bytesArr;
    }

    @Override
    public byte[] encode(Commands message) {
        return new byte[0];
    }
}
