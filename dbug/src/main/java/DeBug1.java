import java.util.ArrayList;
import java.util.List;

/**
 * 1）drop frame 与 step out的区别
 *
 *
 * 其它：
 * 方法的生命周期
 *
 *
 *
 */
public class DeBug1 {

    public static void main(String[] args) {
        int temp1 = 100;
        int temp2 = 50;
        int temp3 = addNum(temp1, temp2); // 步进方法体后drop frame与step out的区别：step out后step into不能再次进入该方法体，而是变成了step over

        System.out.println("temp3:::" + temp3);
        System.out.println("temp2:::" + temp2);
        System.out.println("temp1:::" + temp1);

//        Date d = null;
//        d.getYear();

        System.out.println("sum::" + (temp1 + temp2));

    }

    /**
     * @param temp1
     * @param temp2
     * @return
     */
    public static int addNum(int temp1, int temp2){
        int temp3 = temp1 + temp2;


        int temp = Integer.parseInt("1252");

        int temp = Integer.parseInt(temp1);


        return  temp3;
    }

    /**
     *  方法 documentation
     *
     */
    public static int addNum2(int temp1, int temp2){

        int temp3 = Integer.parseInt(250);

        List list = new ArrayList();

        addNum(temp1, temp2);


    }



}
