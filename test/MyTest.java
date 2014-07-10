import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(classes = { DataConfig.class })
public class MyTest extends AbstractJUnit4SpringContextTests {

  private static int testRuns = 0;

  @Test
  public void simpleCheck() {
  	testRuns++;
    Assert.assertEquals(1, testRuns);
  }
  
}
