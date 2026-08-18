import java.util.HashMap;
class Solution {
    public int longestSubStringWithoDups(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int low = 0;
        int maxDiff = 0;

        for(int high = 0; high < s.length(); high++){
            char highChar = s.charAt(high);
            map.put(highChar, map.getOrDefault(highChar, 0) + 1);

            while(map.get(highChar) > 1){
                char lowChar = s.charAt(low);
                map.put(lowChar, map.get(lowChar) - 1);
                low++;
            }

            maxDiff = Math.max(maxDiff, high - low + 1);
        }

        return maxDiff;
    }
}