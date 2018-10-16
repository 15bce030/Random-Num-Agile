import java.net.MalformedURLException;
import java.rmi.*;

public class RandomNumClient
{
    public static void main(String args[])
    {
        int port=7000;
        try
        {
            String lookup_url = "rmi://localhost:"+port + "/RandomNumberService";
            RandomNum rn = (RandomNum) Naming.lookup(lookup_url);
            int maxNum=10;
            String result = rn.generateNumber(maxNum);
            System.out.println("Random Generator number is "+result);
        }
        catch(Exception ex){

        }
    }
}