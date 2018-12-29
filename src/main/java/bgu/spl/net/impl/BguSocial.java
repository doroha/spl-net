package bgu.spl.net.impl;

import bgu.spl.net.api.bidi.BidiMessagingProtocol;
import bgu.spl.net.api.bidi.Connections;
import bgu.spl.net.impl.Commands.*;

import java.util.List;

public class BguSocial<CommandCS> implements BidiMessagingProtocol<CommandCS> {

  private int opCode;

   public BguSocial(){}
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
    public void process(CommandCS message) {

    }


 /**
     * @return true if the connection should be terminated
     */
    @Override
    public boolean shouldTerminate() {
        return false;
    }
}

