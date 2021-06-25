package com.ust.CountWordTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.ust.CountWord.CountWord;

public class CountTest {
	
	private CountWord wc;
	private String text;
	  
	 @Test
	    public void shouldAnswerWithTrue()
	    {
	        assertTrue( true );
	    }
	 
	 @Before
	  public void setUp() {
	    wc = new CountWord();
	    text = "In the rain rain light the the In, Hi Am am right";
	  }
	 
	 @Test
	  public void runCountWordFromFile() {
	    wc.countWordsFromFile("Example");
	  }

	  @Test
	  public void countWordsShouldCountAllWords() {
	    Map<String, Integer> expected = new HashMap<>();
	    expected.put("in", 2);
	    expected.put("the", 3);
	    expected.put("rain", 2);
	    expected.put("light", 1);
	    expected.put("hi", 1);
	    expected.put("am", 2);
	    expected.put("right", 1);
	    assertEquals(expected, wc.countWords(text));
	    }

	  @Test
	  public void countWordsShouldCountMostCommonWords() {
	    Map<String, Integer> expected = new HashMap<>();
	    expected.put("in", 2);
	    expected.put("the", 3);
	    expected.put("rain", 2);
	    expected.put("am", 2);
	    assertEquals(expected, wc.countWords(text , 4));
//	    System.out.println(wc.countWords(text, 4));
	  }

	  @Test
	  public void countWordFromFileShouldReturnAllWords1() {
	    Map<String, Integer> expected = new HashMap<>();
	    expected.put("in", 2);
	    expected.put("the", 3);
	    expected.put("rain", 2);
	    expected.put("light", 1);
	    expected.put("hi", 1);
	    expected.put("am", 2);
	    expected.put("right", 1);
	    assertEquals(expected, wc.countWordsFromFile("Example"));
	  } 
	  
	  @Test
	  public void countWordFromFileShouldReturnAllWords2() {
	    Map<String, Integer> expected = new HashMap<>();
	    expected.put("in", 2);
	    expected.put("the", 3);
	    expected.put("rain", 2);
	    expected.put("am", 2);  
//	    expected.put("light", 1);
//	    expected.put("hi", 1);
//	    expected.put("right", 1);
	    assertNotEquals(expected, wc.countWordsFromFile("Example"));
	  }

}
