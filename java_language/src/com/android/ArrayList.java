package com.android;

public class ArrayList {
    public static void main(String[] args) {
        int[] intArr = {13, 40, 25, 96, 8, 12};
        String[] stringArr = new String[4];
        System.out.println(intArr.length);
        System.out.println(intArr[intArr.length - 1]);
        System.out.println(stringArr.length);
        for (int value : intArr) {
            System.out.println("for循环结果" + value);
        }

//        冒泡排序
        int tem;
        for (int index = 0; index < intArr.length; index++) {
            for (int i = 0; i < intArr.length - 1 - index; i++) {
                if (intArr[i] > intArr[i + 1]) {
                    tem = intArr[i];
                    intArr[i] = intArr[i + 1];
                    intArr[i + 1] = tem;
                }
            }
        }


        for (int value : intArr) {
            System.out.println("排序后for循环结果" + value);
        }

//        二维数组
        int[][] twoDimensionalArray = {{2, 5}, {5, 7 }};
        System.out.println(twoDimensionalArray[0][1]);

    }
}
