import java.io.*;

public class KtoD {
    public static void main(String[] args){
        String str;
        BufferedReader br = new BufferedReader(
        new InputStreamReader(System.in, System.console().charset())
        );

        System.out.println("Enter text ('stop' to quit).");

        try (FileWriter fw = new FileWriter("C:/Users/sanhu/OneDrive/Área de Trabalho/GitHub/IOJava/IOJavaStudy/IOProject/src/files/text.txt")) {
            do {
                System.out.print(": ");
                str =  br.readLine();

                if(str.compareTo("stop") == 0) break;

                str = str + "\r\n"; //add a new line.
                fw.write(str);
             } while(str.compareTo("stop") != 0);
        } catch (IOException e) {
            System.out.println("I/O error: " + e);
        }

    }

    
}
