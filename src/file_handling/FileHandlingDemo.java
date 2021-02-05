package file_handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileHandlingDemo {
    public static void main(String[] args) {
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("FHDemo.txt");
            String str="Today is Friday";
            byte[] arr=str.getBytes();
            fileOutputStream.write(arr);

            System.out.println("File is written successfully");

            FileInputStream fileInputStream = new FileInputStream("FHDemo.txt");
            int i= fileInputStream.read();
            System.out.println((char)i);
            while(i!=-1){
                System.out.print((char)i);
                i=fileInputStream.read();
            }



        }catch (IOException ioException){
            System.out.println(ioException);
        }
    }
}
