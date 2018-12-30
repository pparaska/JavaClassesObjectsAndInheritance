package DatePack;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class DateTest {
	private Date date1;
	
	@Before
	public void setUp(){
		date1=new Date(17,8,1997);
	}
	
	
	@Test
	public void testForDate(){
	String actual=date1.toString();
	assertEquals("[17/8/1997]",actual);
	}
	
	@Test
	public void testForSmallerDate(){
	boolean actual=date1.isSmaller(date1);
	assertTrue(actual);
	}
	
	@Test
	public void testForDateDifference(){
	int expected[]= {14,4,21};
	assertArrayEquals(expected,date1.difference(date1));
	}

}
