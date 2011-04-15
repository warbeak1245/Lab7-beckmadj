import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.regex.Pattern;

public class LookingUpMySchedule extends SeleneseTestCase {
	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://www.rose-hulman.edu/");
		selenium.start();
	}

	@Test
	public void testLookingUpMySchedule() throws Exception {
		selenium.open("/");
		selenium.click("link=Current Students");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=a[title=Registrar]");
		selenium.waitForPageToLoad("30000");
		selenium.click("//div/ul/li[2]/a/span");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Current schedule look-up");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=h2 > a");
		selenium.waitForPageToLoad("30000");
		selenium.type("id1", "beckmadj");
		selenium.click("bt1");
		selenium.waitForPageToLoad("30000");
		verifyTrue(selenium.isTextPresent("CSSE376"));
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}