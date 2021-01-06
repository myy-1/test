package com.ma.queue.String;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public static void main(String[] args) {

    }
    public static boolean two(String s,String t){
        Map<Character,Character> map1=new HashMap<Character, Character>();
        Map<Character,Character> map2=new HashMap<Character, Character>();
        int n=s.length();
        for (int i = 0; i < n; i++) {
            char s1=s.charAt(i),t1=t.charAt(i);
      if((map1.containsKey(s1))&&map1.get(s1)!=t1||(map2.containsKey(t1))&&(map2.get(t1)!=s1)){
            return false;
        }else{
            map1.put(s1,t1);
            map2.put(t1,s1);
        }
    }
    return true;
    }


    }

