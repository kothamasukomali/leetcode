import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        ArrayList<String> al = new ArrayList<>();
        
        String[] a = s1.split(" ");
        String[] b = s2.split(" ");
        
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : a) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        
        
        for (String word : b) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() == 1) {
                al.add(entry.getKey());  
            }
        }
        
        return al.toArray(new String[0]);
    }
}
