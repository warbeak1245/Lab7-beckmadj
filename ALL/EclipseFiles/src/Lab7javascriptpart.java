import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.regex.Pattern;

public class Lab7javascriptpart extends SeleneseTestCase {
	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://webtesting.idyll.org/");
		selenium.start();
	}

	@Test
	public void testLab7javascriptpart() throws Exception {
		selenium.open("/");
		selenium.click("link=JavaScript alert box");
		assertEquals("Hi, I'm a JavaScript alert box!", selenium.getAlert());
		selenium.type("num1", "23");
		selenium.type("num2", "23");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
