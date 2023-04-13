package Days.Day2;

public class _278_FirstBadVersion {
    public static void main(String[] args){

    }

    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version);
       */

    public static int firstBadVersion(int n){
        int left = 0, right = n-1;
        while (left <= right) {
            int mid = left + (right-left)/2;
            if (isBadVersion(mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
