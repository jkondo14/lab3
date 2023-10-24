import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test 
	public void testReverseInPlaceAgain() {
    int[] input1 = { 5,6,7,8 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 8,7,6,5 }, input1);
	}

  @Test
  public void testReversedAgain() {
    int[] input1 = {1,5,6,9};
    assertArrayEquals(new int[]{9,6,5,1}, ArrayExamples.reversed(input1));
  }
  
}
