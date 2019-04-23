package com.data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 01418061(cuizhiwen)
 * @Description:
 * @date 2019/4/4 13:09
 */
public class Demo {

    private static int fun1() {
        long startTime = System.currentTimeMillis();
        int i;
        int sum = 0;
        int n = 1000;
        for (int j = 0; j <=n; j++) {
            sum = sum + j;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("fun1运行时间：" + (endTime - startTime) + "ms");
        System.out.println(sum);
        return sum;
    }

    private static int fun2() {
        long startTime = System.currentTimeMillis();
        int sum = 0;
        int n = 1000;
        sum = (1 + n) * n / 2;
        long endTime = System.currentTimeMillis();
        System.out.println("fun2运行时间：" + (endTime - startTime) + "ms");
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        fun1();
        fun2();
        List list = new ArrayList();
    }
}
