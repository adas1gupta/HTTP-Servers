// This file handles http requests and responses

//HTTP servers use network sockets and data streams (hence the I/O devices)
import java.net.*;
import java.io.*;

import java.util.HashMap;
import java.util.Map;

class Server {
    private ServerSocket serverSocket;
    public int port; 
    private boolean running;

    private Socket[] pool;
    private Map<String, RequestHandler> routeMap = new HashMap<>();
    
    private int maxConnections = 50;
    private int connectionTimeout = 30000; // 30 seconds
    
    public Server(int port) {
        this.port = port;
        this.connectionPool = new Socket[maxConnections]; 
    }
}

class Main {
    public static void main() {

    }
}
