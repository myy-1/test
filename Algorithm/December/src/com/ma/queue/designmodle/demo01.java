package com.ma.queue.designmodle;


import java.util.*;

public class demo01 {
    public static void main(String[] args) {
/*        Set<Integer> s1=new HashSet<Integer>();
        s1.add(1);
        s1.add(2);
        for (int s:s1
             ) {
            System.out.println(s);

        }

     Set<String> s2=new LinkedHashSet<String>();
        s2.add("a");
        s2.add("c");
        s2.add("b");
        for (String b:s2
             ) {
            System.out.println(b);

        }*/
        Map map = new HashMap();
        for(int i = 0; i < 10; i ++){
            map.put(i, String.valueOf("map" + i));
        }
        Iterator iterMap = map.entrySet().iterator();
        while(iterMap.hasNext()){
            Map.Entry strMap = (Map.Entry)iterMap.next();
            System.out.println("key为:" + strMap.getKey() +
                    ", value为:" + strMap.getValue());
        }


    }
    }



