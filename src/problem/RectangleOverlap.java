package problem;

/**
 * 836
 *
 */
public class RectangleOverlap {
	/**
	 * Time: 1
	 * Space: 1
	 */
	public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        if (rec1[0] == rec1[2] || rec1[1] == rec1[3] ||
        		rec2[0] == rec2[2] || rec2[1] == rec2[3]) {
        	// the area is zero 
        	return false;
        }
        
        else {
        	return !(rec1[0] >= rec2[2] ||
        			 rec1[1] >= rec2[3] ||
        			 rec1[2] <= rec2[0] ||
        			 rec1[3] <= rec2[1]);
        }
    }
	
	/**
	 * Time: 1
	 * Space: 1
	 * Intersection creates overlap.
	 */
	public boolean isRectangleOverlap2(int[] rec1, int[] rec2) {
        return (Math.min(rec1[2], rec2[2]) > Math.max(rec1[0], rec2[0]) // width > 0
        		&&
        		Math.min(rec1[3], rec2[3]) > Math.max(rec1[1], rec2[1])); // height > 0
    }
}
