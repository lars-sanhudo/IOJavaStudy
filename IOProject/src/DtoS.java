import java.io.*;
public class DtoS {
    public static void main(String[] args){
        String s;

        // Create and use a FileReader wrapped
        // in a BufferedReader.
        try (BufferedReader br = new BufferedReader(
            new FileReader("C:/Users/sanhu/OneDrive/Área de Trabalho/GitHub/IOJava/IOJavaStudy/IOProject/src/files/text.txt")
        )) {
            while((s = br.readLine()) != null){
                System.out.println(s);
            }
        } catch (IOException e) {
            System.out.println("I/O error: " + e);
        }
    }
}
