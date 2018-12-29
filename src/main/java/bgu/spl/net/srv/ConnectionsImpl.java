package bgu.spl.net.srv;

import bgu.spl.net.api.bidi.Connections;
import bgu.spl.net.srv.bidi.ConnectionHandler;

import java.util.HashMap;

public class ConnectionsImpl<T> implements Connections<T>  {

    private HashMap<Integer,ConnectionHandler> connectionData;  //All clients that registerd to the App

    private static class SingletonHolder {
        private static ConnectionsImpl instance = new ConnectionsImpl();
    }

    public static ConnectionsImpl getInstance() {
        return SingletonHolder.instance;
    }

    private ConnectionsImpl() {
        this.connectionData = new HashMap<>();
    }

    @Override
    public boolean send(int connectionId, T msg) {  //send msg to specific client. (for PM).
        Integer id=new Integer(connectionId);
        if (!connectionData.containsKey(id)) return false;
        connectionData.get(id).send(msg);
        return true;
    }

    @Override
    public void broadcast(T msg) {

        for (Integer id:connectionData.keySet()){  //send broadcast to all active clients
             connectionData.get(id).send(msg);
        }
    }

    @Override
    public void disconnect(int connectionId) { // TODO - removes the client from the hashmap
        Integer id=new Integer(connectionId);
        if (connectionData.containsKey(id))
        connectionData.remove(id);
    }
}
