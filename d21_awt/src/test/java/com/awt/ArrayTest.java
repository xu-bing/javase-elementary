package com.awt;


public class ArrayTest {

    /**
     * 数组合并
     * @param arr1
     * @param arr2
     * @return
     */
   public int[] concatArr(int[] arr1, int[] arr2){
       int[] targetArr = new int[arr1.length + arr2.length];

       // 拿第1个数组元素进行赋值
       for(int i = 0; i < arr1.length; i++){
           targetArr[i] = arr1[i];
       }

       // 取第2个数组赋值
       for (int i = 0; i < arr2.length; i++){
           // targetArr余下的元素的1st下标为arr1.length
           targetArr[arr1.length + i] = arr2[i];
       }

       return targetArr;
   }  // concatArr

    public void printArr(int[] arr){
        for (int e : arr){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        ArrayTest arrayTest = new ArrayTest();

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10,11,12};

        arrayTest.printArr(arrayTest.concatArr(arr1, arr2));


    }

}