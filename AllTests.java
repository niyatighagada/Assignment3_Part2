package testing;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ countATest.class, divideTest.class, squareTest.class })
public class AllTests {

}
