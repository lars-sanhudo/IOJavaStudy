import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile2 {
    public static void main(String[] args){
        int i;

        try(FileInputStream fin = new FileInputStream("IOProject/src/files/first.txt");
        FileOutputStream fout = new FileOutputStream("IOProject/src/files/third.txt")){

            do{
                i = fin.read();
                if(i != -1) fout.write(i);
            }while(i != -1);
        } catch(IOException exc){
            System.out.println("I/O Error: " + exc);
        }
    }
}
