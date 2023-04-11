package EasyCollection.Strings;

public class ReverseString {
    public static void main(String[] args){
        char[] s = new char[]{'h','e','l','l','o'};
        reverseString(s);
        for (char c: s) {
            System.out.print(c + " ");
        }
    }
    /*
    * https://leetcode.com/problems/reverse-string/solutions/80937/java-simple-and-clean-with-explanations-6-solutions/?orderBy=most_votes
    */
    public static void reverseString(char[] s){
        int l = 0;
        int r = s.length-1;
        while(l < r){
            char tmp = s[r];
            s[r] = s[l];
            s[l] = tmp;
            r--;
            l++;
        }
    }
}
