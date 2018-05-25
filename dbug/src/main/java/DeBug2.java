import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 条件断点
 *
 */
public class DeBug2 {

    public void doMain(){

        // 1. generate list
        List list = new ArrayList();

        Random r = new Random();

        for (int i = 0; i < list.size(); i++){    //
//        for (int i = 0; i < 100; i++){
            int nextInt = r.nextInt();

            list.add(nextInt);
        }

        // 2. add
        int sum = 0;

        for (int i = 0; i < list.size(); i++){
            int value = (Integer) list.get(i);

            sum += value;
        }

        System.out.println(sum);

    }


    public static void main(String[] args) {
        new DeBug2().doMain();
    }
}
