package basic.unittests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.fail;

public class ThirdSuiteTest {
  /* Comment out from here to line 23 for the pr you will not merge  */
    
  @Test
    public void thirdTest1() {
        System.out.println("thirdTest1 successful!");
    }

    @Test
    public void thirdTest2() throws Exception {
        System.out.println("thirdTest2 successful!");
    }

    @Test
    public void thirdTest3() {
        System.out.println("thirdTest3 successful!");
    } 
   

    /* Comment out from here to the end for the original file 
    @Disabled
    @Test
    public void skippedTest1() {
        System.out.println("thirdTest1 successful!");
        
    }

    @Test
    public void failedTest2() throws Exception {
        fail("Forcing a test failure");
    }

    @Test
    public void errorTest3() throws Exception {
        throw new Exception("Throwing an error");
    }
    */
}
