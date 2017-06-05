package Test.КлиентЧата.Logic;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Ромчи on 02.06.2017.
 */
public abstract class Constant {
    public static Socket              connection;
    public static ServerSocket        server;
    public static ObjectInputStream   input;
    public static ObjectOutputStream  output;
    public static final int           PORT = 1234;
    public static String              IP;
    public static String              LOGIN;
    public static boolean             online = false;
}
