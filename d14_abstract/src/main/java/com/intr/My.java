package com.intr;

import java.io.*;

public class My implements MyIface {
    public void test(){
       // USER_NAME = "李四";
      //  isRight = false;
    }

    public void print(){
      //  isRiight = false;

    }

    public static void main(String[] args) {
        /*try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("d:\\1.txt")));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("d:\\2.txt")));

            String line = br.readLine();

            while (line != null){
                System.out.println(line);
                bw.write(line);
                bw.newLine();
                bw.flush();
                line = br.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/


        String[] sa = new String[]{"tom", "jerry", "jack", "john"};
        System.out.println(sa);

        String result = "";
        for (String s : sa){
            System.out.println(s);
            result += result.concat(",").concat(s);
        }

        System.out.println(result);


    }  // main
}
