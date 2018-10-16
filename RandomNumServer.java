import java.rmi.*;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class RandomNumServer
{
    public static void main(String args[])
    {
        try
        {
            int port= 7000;
            startRegistry(port);
            RandomNumImplement rni = new RandomNumImplement();
            String url = "rmi://localhost:" + port + "/RandomNumberService";
            Naming.rebind(url,rni);
            System.out.println("Random Number Service is Ready and  running on port Number : "+port);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }

    private static void startRegistry(int portNumber) throws RemoteException
    {
        try
        {
            Registry registry = LocateRegistry.getRegistry(portNumber);
            registry.list();
        }
        catch(Exception ex)
        {
            System.out.println("Registry could not be found on port number " +portNumber);
            Registry registry = LocateRegistry.createRegistry(portNumber);
            System.out.println("Registry created on port no. : " + portNumber);

        }
    }

}
