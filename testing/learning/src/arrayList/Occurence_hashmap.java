package arrayList;

import java.util.HashMap;
import java.util.Map;

public class Occurence_hashmap {
    public static void main(String[] args) {
        String inputStr = "HelloWorld";
        countCharacters(inputStr);
    
    }
    static void countCharacters(String inputStr) {
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        char[] strArray = inputStr.toCharArray();

        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
        }
    }
       
}