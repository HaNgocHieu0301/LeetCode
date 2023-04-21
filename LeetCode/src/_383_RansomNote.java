import java.util.HashMap;

public class _383_RansomNote {
    public static void main(String[] args) {

    }

    //method 1: Using hashmap
    public static boolean canConstruct1(String ransomNote, String magazine) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            if (!hm.containsKey(magazine.charAt(i))) {
                hm.put(magazine.charAt(i), 1);
            } else {
                hm.put(magazine.charAt(i), hm.get(magazine.charAt(i)) + 1);
            }
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if (!hm.containsKey(c) || hm.get(c) <= 0) return false;
            hm.put(c, hm.get(c) - 1);
        }
        return true;
    }

    //method 2: Using indexOf and SubString
    public static boolean canConstruct2(String ransomNote, String magazine) {
        for (char c : ransomNote.toCharArray()) {
            int index = magazine.indexOf(c);
            if (index < 0) {
                return false;
            }
            magazine = magazine.substring(0, index) + magazine.substring(index+1, magazine.length());
        }
        return true;
    }

    //method 3: Using array
    public static boolean canConstruct3(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            arr[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if(arr[ransomNote.charAt(i) - 'a']-- <= 0){
                return false;
            }
        }
        return true;
    }
}
