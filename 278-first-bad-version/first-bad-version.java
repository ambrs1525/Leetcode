/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low =1;
        int high = n;
        while(low<=high){
            int version = low+(high-low)/2;
            boolean result =isBadVersion(version);
            if(result){
;             high= version-1;
            }
            else{
                low = version+1;
            }
            
        }
        return low;
    }
}