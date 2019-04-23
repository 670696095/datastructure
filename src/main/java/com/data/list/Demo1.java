package com.data.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 01418061(cuizhiwen)
 * @Description: 线性表
 * @date 2019/4/8 10:04
 */
public class Demo1 {
    private static List union(List la, List lb) {
        int la_len, lb_len;
        la_len = la.size();
        lb_len = lb.size();
        for (int i = 0; i < lb_len; i++) {
            if (!la.contains(lb.get(i))) {
                la.add(lb.get(i));
            }
        }
        return la;
    }

    public static void main(String[] args) {
        List la = new ArrayList();
        la.add("1");
        la.add("2");
        la.add("3");
        la.add("1");
        List lb = new ArrayList();
        lb.add("5");
        lb.add("6");
        lb.add("3");
        List lc = union(la, lb);
        for (Object o : lc) {
            System.out.println(o);
        }
        la.get(0);

        List ld = new LinkedList();
        ld.add("44");
        System.out.println(ld.get(0));


    }
}
