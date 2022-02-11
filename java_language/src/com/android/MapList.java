package com.android;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapList {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap();
        map.put("name", "haoxuan");
        map.put("from", "成都");
        Iterator valueIt = map.values().iterator();

        System.out.println(map);
        while (valueIt.hasNext()) {
            System.out.println(valueIt.next());
        }
//        移除键值对
        map.remove("from");
        System.out.println(map);
    }
//    {name=haoxuan, from=成都}
//    haoxuan
//    成都
//    {name=haoxuan}
}
