import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DeBug3 {

    /**
     * 运行时与编译时异常断点
     *
     */
    public void doSum() throws IOException {
        // 1. generate list
        List list = new ArrayList();

        Random r = new Random();

//        for (int i = 0; i < list.size(); i++){    //
        for (int i = 0; i < 100; i++){
            int nextInt = r.nextInt();

            list.add(nextInt);
        }

        //list.add(null);

        // 2. add
        int sum = 0;

        for (int i = 0; i < list.size(); i++){
            int value = (Integer) list.get(i);

            sum += value;

            if (i > 15) {
                throw  new IOException("测试编译异常");
            }

        }

        System.out.println(sum);


    }

    public static void main(String[] args) {
        try {
            new DeBug3().doSum();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
