package string;

import java.util.HashMap;
import java.util.Map;

public class duplicates {
    public static void main(String[] args) {
        String s="geeksforgeeks";
        count(s);
    }
    public static void count(String s){
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }
        for (Map.Entry<Character,Integer> mapElement : map.entrySet()) {
            char key = mapElement.getKey();
 
            int value = mapElement.getValue();

            if(value>1){
            System.out.println(key + " : " + value);
            }
        }
    }
}
