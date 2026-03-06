
package calculationactivity;

import org.junit.Test;
import static org.junit.Assert.assertEquals; /*Static because it doen't need anything else to run */

public class TestCalculator {
    
    @Test 
    public void addTwoNumbers(){ 
        Calculator calculator = new Calculator();
        assertEquals("1+1 = 2",2, calculator.add(1,1));
    }
    
    
    @Test 
    public void subtractNumbers(){
       Calculator calculator = new Calculator();
       assertEquals("2-1 should equal 1", 1, calculator.subtract(2, 1));
    }
   
}
