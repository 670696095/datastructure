package com.data.list;
/**
 * @author 01418061(cuizhiwen)
 * @Description: 判断字符串是否一样
 * @date 2019/4/22 13:10
 */
public class TString {
    private static boolean equals(String s1, String s2) {
        if (s1 == s2) {
            return true;
        }
        s1 = sort(s1);
        s2 = sort(s2);
        System.out.println(s1.equals(s2));

        if (s1 instanceof String) {
            String anotherString = (String) s2;
            int n = s1.length();
            if (n == anotherString.length()) {
                char v1[] = s1.toCharArray();
                char v2[] = anotherString.toCharArray();
                int i = 0;
                while (n-- != 0) {
                    if (v1[i] != v2[i]) {
                        return false;
                    }
                    i++;
                }
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(equals("123abc", "abc123"));
    }
    private static String sort(String s) {
        //1.将字符串转换为字符数组
        //2.对字符串进行冒泡排序
        //3.将字符数组转换为字符串
        String ch = s;
        char[] arr = ch.toCharArray();
        bubbleSort(arr);
        String result = new String(arr);
        return result;
    }
    public static void bubbleSort(char[] ch) {
        for (int i = 0; i < ch.length - 1; i++) {
            for (int x = 0; x < ch.length - 1 - i; x++) {
                if (ch[x] > ch[x + 1]) {
                    char a = ch[x + 1];
                    ch[x + 1] = ch[x];
                    ch[x] = a;
                }
            }
        }

    }
}

