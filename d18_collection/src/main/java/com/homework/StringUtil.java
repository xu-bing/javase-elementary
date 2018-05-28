package com.homework;

public class StringUtil {

    public static void main(String[] args) {
    }

    /**
     * 将数组 int[] arr = {0,1,2,3,4,5,6,7,8,9} 拼接成 [0, 1, 2, 3, 4, 5, 6, 7, 8, 9] 字符串
     */
    public void arr2String(){
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        StringBuilder sb = new StringBuilder(arr.length * 3);

        sb.append("[");

        for (int i = 0; i < arr.length; i++){

            // 在每个元素前加
            if (i > 0){
                sb.append(",");
            }

            sb.append(arr[i]);
        }


        sb.append("]");

        System.out.println(sb);
    }    // arr2String

    public String arr2String2(int [] arr){
        StringBuilder sb = new StringBuilder(arr.length * 3);

        sb.append("[");

       /* for (int i = 0; i < arr.length; i++){
            sb.append(arr[i]);

            // 在每个元素后加
            if (i == arr.length - 1){
                break;
            }

            sb.append(",");
        }


        sb.append("]");*/

       for (int i = 0; i < arr.length; i++){
           sb.append(arr[i]);

           if (i == arr.length - 1){
               return sb.append("]").toString();
           }

           sb.append(",");
       }    // for


        return sb.toString();

    }    // arr2String2


    public String arr2String3(int[] arr){
        StringBuilder sb = new StringBuilder();

        sb.append("[");

        for (int i = 0; i < arr.length - 1; i++){
            sb.append(arr[i]).append(",");
        }

        sb.append(arr[arr.length - 1]).append("]");

        return sb.toString();
    }    // arr2String3


    /*
    运行效率：3 > 2 > 1, 因为3中没有if判断

     */
}
