package src.com.chrazqee;
import java.util.HashMap;
import java.util.Map;


public class Solution {
    public int takeCharacters (String s, int k) {
        int ans = 0;
        // 定义一个字典
        Map<Character, Integer> dic = new HashMap<Character, Integer>();

        for (char c: s.toCharArray()) {
            if (dic.containsKey(c)){
                dic.put(c, dic.get(c) + 1);
            } else {
                dic.put(c, 1);
            }
        }

        // 遍历这个 HashMap
        for (Map.Entry<Character, Integer> entry: dic.entrySet()) {
            System.out.print(entry.getKey());
            System.out.println(entry.getValue());
        }

        return ans;
    } 

    // public static void main(String[] args) {
    //     Solution solution = new Solution();
    //     String s = "aaabbb";
    //     int k = 5;
    //     solution.takeCharacters(s, k);
    // }
}
