import java.io.*;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException {

        InputStream in=null;
        OutputStream out=null;
        try {
            in = new FileInputStream("test");
            out =new FileOutputStream("sum");

            Scanner sc=new Scanner(in);

//            while (sc.hasNext()) {
//                System.out.println(sc.nextLine());
//            }

            int a=sc.nextInt();
            int b=sc.nextInt();

            System.out.println(a+b);
            String sum3 = a + b + "";
            out.write(sum3.getBytes());
            out.flush();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                assert in != null;
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
