package app;

import java.io.*;
import java.nio.CharBuffer;

public class Control {
    public Control(){
    }
    public void add(Product product) throws IOException {
        File file = new File("file.txt");
        BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter("file.txt", true));
        fileOutputStream.write(product.getValue() + "\n");
        //fileOutputStream.flush();
        fileOutputStream.close();
    }
    public void search(Product product) throws IOException{
              File file = new File("file.txt");
              FileReader fileReader = new FileReader(file);
              BufferedReader bufferedReader = new BufferedReader(fileReader);
              String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            line = bufferedReader.readLine();
            bufferedReader.close();
        }

    }
}
