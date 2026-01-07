import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient

  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls
  @Test
  void testMostCommonTimeEfficient(){
    int[] arr = {1,3,6,2,3,4,7,2,1,4,7,3,5,3,1,7,7,6,4,7};
    Practice test = new Practice();
    int answer = test.mostCommonTimeEfficient(arr);
    assertEquals(7, answer);
  }
}
