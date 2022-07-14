package problem;

/**
 * 860
 *
 */
public class LemonadeChange {
	
	/**
	 * Only has 5, 10, 20 bill
	 * Time: O(N)
	 * Space: O(1)
	 */
	public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        
        for (int b : bills) {
        	if (b == 5) {
        		five ++;
        	}
        	else if (b == 10) {
        		
        		if(five == 0) return false;
        		
        		five --;
        		ten ++;
        	}
        	else {
        		if (five > 0 && ten > 0) {
        			five --;
        			ten --;
        		}
        		else if (five >= 3) {
        			five -= 3;
        		}
        		else {
        			return false;
        		}
        	}
        }
        return true;
    }
}
