package es.ingenium.kata.java.codewar.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import es.ingenium.kata.java.codewar.kyu6.suite.All6KyuTests;

@RunWith(Suite.class)
@SuiteClasses({
    // Kyu levels
    All6KyuTests.class// ,All5KyuTests.class,All4KyuTests.class,All3KyuTests.class,All2KyuTests.class,All1KyuTests.class
    // Dan levels
    // All1DanTests.class
})
public class AllTests {

}
