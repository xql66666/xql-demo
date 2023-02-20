package com.xuqianlei.test;

import io.netty.util.internal.StringUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: xuqianlei
 * @Date: 2023/02/16/16:11
 */
public class Test {
    public static void main(String[] args) {

        List<String> data = new ArrayList<>();
        Double value = 0.0D;
        if (data instanceof List) {
            value = ((List) data).stream().mapToDouble(n -> Double.parseDouble(String.valueOf(n))).sum();
        }
        System.out.println(value);
    }
}
