class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            String s = strs[i];
            int[] count = new int[26];
            for(int j=0; j<s.length(); j++){
                count[s.charAt(j)-'a']++;
            }
            String key = Arrays.toString(count);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
