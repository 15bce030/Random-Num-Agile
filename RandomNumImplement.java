import java.rmi.*;
import java.rmi.server.*;
import java.util.Random;

public class RandomNumImplement extends UnicastRemoteObject implements RandomNum {
    public RandomNumImplement() throws RemoteException
    {
        super();
    }

    @Override
    public String generateNumber(int maxNum) throws RemoteException {
        Random r = new Random();
        return String.valueOf(r.nextInt(maxNum));
    }



}