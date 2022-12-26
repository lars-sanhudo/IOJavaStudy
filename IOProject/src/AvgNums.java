import java.io.*;

public class AvgNums {
    public static void main(String[] args) 
    throws IOException
    {
        //create a BufferedReader using System.in.
        BufferedReader br = new BufferedReader(
        new InputStreamReader(System.in, System.console().charset())
        );

        String str;
        int n;
        double sum = 0.0;
        double avg, t;

        System.out.println("How many numbers will you enter: ");
        str = br.readLine();
        try{
            n = Integer.parseInt(str);
        }
        catch(NumberFormatException exc) {
            System.out.println("Invalid format.");
            n = 0;
        }

        System.out.println("Enter "+ n  +" values.");
        for(int i = 0; i < n; i++){
            System.out.print(": ");
            str = br.readLine();
            try{
                t = Double.parseDouble(str);
            }
            catch(NumberFormatException exc) {
                System.out.println("Invalid Format.");
                t = 0.0;
            }
            sum +=t;
        }

        avg = sum/n;
        System.out.println("Average is: " + avg);
    }
}
