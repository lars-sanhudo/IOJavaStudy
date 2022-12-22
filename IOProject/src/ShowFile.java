import java.io.*;




public class ShowFile {
    public static void main(String[] args){
        int i =0;
        FileInputStream fin;
        
        try{
            fin = new FileInputStream("src/Test.txt");
            
        } catch(FileNotFoundException exc) {
            System.out.println("File Not Found");
            return;
        }

        try {
            do {
                i = fin.read();
                
                if(i != -1) {
                    System.out.print((char) i);
                    
                }
            } while(i != -1);
        } catch(IOException exc) {
            System.out.println("Error reading File.");
        } finally {
            try{
                fin.close();
            } catch(IOException exc) {
                System.out.println("Error closing fiel.");
            }
        }

        
    }

}
