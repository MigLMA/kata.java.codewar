/*
 * INGENĬUM Infinite learning for Idiomatic Java and others.
 *
 */
package es.ingenium.kata.java.codewar.kyu6;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import java.util.Random;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author MigLMA
 */

/**
 * <h1>"Build a pile of Cubes"</h1>
 * 
 * <p>
 * Your task is to construct a building which will be a pile of n cubes. The cube at the bottom will
 * have a volume of n^3, the cube above will have volume of (n-1)^3 and so on until the top which
 * will have a volume of 1^3.
 * </p>
 * <p>
 * You are given the total volume m of the building. Being given m can you find the number n of
 * cubes you will have to build?
 * </p>
 * <p>
 * The parameter of the function findNb <code>(find_nb, find-nb, findNb)</code> will be an integer m
 * and you have to return the integer n such as n^3 + (n-1)^3 + ... + 1^3 = m if such a n exists or
 * -1 if there is no such n.
 * </p>
 * <h2>Examples:</h2>
 * 
 * <pre>
 * <code>findNb(1071225) --&gt; 45
findNb(91716553919377) --&gt; -1
</code>
 * </pre>
 * 
 * </div>
 */
public class ASumTest {

  @Rule
  public TestRule watcher = new TestWatcher() {
    protected void starting(Description description) {
      // FIX: use logger for logging
      logger.info("=== Test [" + description.getMethodName() + "] =========");
      System.out.println("=== Test [" + description.getMethodName() + "] =========");
    }
  };

  final Logger logger = LoggerFactory.getLogger(ASumTest.class);

  @Test
  public void testWhenM9ThenNumberIs2() {
    long m = 9L;

    assertEquals(2, ASum.findNb(m));
  }


  @Test
  public void testWhenMLessThan9ThenNoFoundNumber() {
    Random rand = new Random();
    int m = rand.nextInt(8) + 2;

    assertEquals(-1, ASum.findNb((long) m));
  }

  @Test
  public void testWhenM1ThenSameNumber() {
    assertEquals(1, ASum.findNb(1L));
  }

  @Test
  public void testWhenM0ThenNoFoundNumber() {
    assertEquals(-1, ASum.findNb(0L));
  }

  // codewar own tests:
  @Test
  public void test1() {
    assertEquals(2022, ASum.findNb(4183059834009L));
  }

  @Test
  public void test2() {
    assertEquals(-1, ASum.findNb(24723578342962L));
  }

  @Test
  public void test3() {
    assertEquals(4824, ASum.findNb(135440716410000L));
  }

  @Test
  public void test4() {
    assertEquals(3568, ASum.findNb(40539911473216L));
  }

  // @Test
  public void test() {
    fail("Not yet implemented");
  }

}
