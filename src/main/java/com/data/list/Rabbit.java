package com.data.list;

/**
 * @author 01418061(cuizhiwen)
 * @Description: 斐波那契数列 -兔子数列
 * @date 2019/4/12 11:03
 */
public class Rabbit {
    private static int list(int j) {
        int a[] = new int[j + 1];
        int result = 2;
        a[1] = 1;
        a[2] = 1;
        for (int i = 3; i <= j; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        return a[j];
    }
    private static int fbi(int i) {
        if (i < 2) {
            return i == 0 ? 0 : 1;
        }
        return fbi(i - 1) + fbi(i - 2);
    }
    public static void main(String[] args) {
        System.out.println(list(12));
        System.out.println(fbi(12));
    }

}
