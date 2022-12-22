import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String [] args)
    throws IOException{
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;


        try {
            fin = new FileInputStream("src/first.txt");
            fout = new FileOutputStream("src/second.txt");
            
            do {
                i = fin.read();
                if(i != -1) {
                    fout.write(i);
                } 
            }while(i != -1);
        
        
        } catch(IOException exc){
            System.out.println("I/O Error: " + exc);
        } finally{
            try{
                if(fin !=null) {fin.close();}
            } catch(IOException exc) {
                System.out.println("Error closing Input FIle");
            }

            try{
                if(fout !=null) {fout.close();}
            } catch(IOException exc) {
                System.out.println("Error closing Input FIle");
            }
            
           
            
        }
    }
}
