import java.util.HashMap;

class longestSubStr {
    public int longestKSubstr(String s, int k) {
        int low = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int maxStr = -1; 

        for (int high = 0; high < s.length(); high++) {
            char highChar = s.charAt(high);
            map.put(highChar, map.getOrDefault(highChar, 0) + 1);

            while (map.size() > k) {
                char lowChar = s.charAt(low);
                map.put(lowChar, map.get(lowChar) - 1);
                
                if (map.get(lowChar) == 0) {
                    map.remove(lowChar);
                }
                low++;
            }

            if (map.size() == k) {
                maxStr = Math.max(maxStr, high - low + 1);
            }
        }
        return maxStr;
    }
}
