import java.io.*;

// Write and then read back binary data.
public class RWData2 {
    public static void main(String[] args){
        int i = 10;
        double d = 1024.15;
        boolean b = true;

        try(DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("IOProject/src/dataoutputstream"))) {
            
            System.out.println("Writing: " +i);
            dataOut.writeInt(i);

            System.out.println("Writing: " +d);
            dataOut.writeDouble(d);

            System.out.println("Writing: " +b);
            dataOut.writeBoolean(b);
        } catch (IOException exc) {
            System.out.println("Write error.");
            return;
        }

        // Now, read then back;

        try (DataInputStream dataIn = new DataInputStream(new FileInputStream("IOProject/src/dataoutputstream"))){
            i = dataIn.readInt();
            System.out.println("Reading: "+i);

            d = dataIn.readDouble();
            System.out.println("Reading: " +d);

            b = dataIn.readBoolean();
            System.out.println("Reading:" +b);
        } catch (IOException exc) {
            System.out.println("Read error");
            return;
        }

    }
}
