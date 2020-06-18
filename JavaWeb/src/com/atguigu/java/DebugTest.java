package com.atguigu.java;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ly on 2020/6/16.
 */
public class DebugTest {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        Map<String,String> map = new HashMap<String,String>();
        map.put("熊大","聪明");
        map.put("age","12");
        map.put("school","Tsinghua");
        map.put("major","computer");

        String age = map.get("age");
        System.out.println("age = " + age);

        map.remove("school");
        System.out.println("map = " + map);

    }

}
