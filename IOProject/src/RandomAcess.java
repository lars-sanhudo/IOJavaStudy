import java.io.*;


public class RandomAcess {
    public static void main(String[] args){
        double [] data = {10.4, 10.1, 123.54, 33.0, 87.9, 74.25 };
        double d;

        //Open and use a random acess file.
        try (RandomAccessFile raf = new RandomAccessFile("IOProject/src/files/random.dat", "rw") ) {
            //Write values to the file.
            for(int i=0; i < data.length;i++){
                raf.writeDouble(data[i]);
            }

            // Now, read back specific values.
            raf.seek(0); // seek to first double.
            d = raf.readDouble();
            System.out.println("First value is " +d);

            raf.seek(8); // seek to sencond double.
            d = raf.readDouble();
            System.out.println("Second value is " +d);

            raf.seek(8 * 3); // seek to fourth double.
            d = raf.readDouble();
            System.out.println("Fourth value is " +d);

            System.out.println();

            //Now, read every other value.
            System.out.println("Here is every other value: ");
            for(int i = 2; i< data.length; i+=2){
                raf.seek(8*i); // seek to ith double.
                d = raf.readDouble();
                System.out.print(d + " ");
            }


        } catch (IOException e) {
            System.out.println("I/O Error: " +e);
        }
    }
}
