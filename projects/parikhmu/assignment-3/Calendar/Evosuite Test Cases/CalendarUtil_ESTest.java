/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 09 04:29:42 GMT 2017
 */

package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import calendar.CalendarUtil;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CalendarUtil_ESTest extends CalendarUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      boolean boolean0 = CalendarUtil.IsLeapYear((-700));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = CalendarUtil.IsLeapYear((-718));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[4];
      CalendarUtil.DaysInMonth = intArray0;
      int int0 = CalendarUtil.NumDaysInMonth(2163, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CalendarUtil calendarUtil0 = new CalendarUtil();
      CalendarUtil.DaysInMonth = calendarUtil0.DaysInMonth;
      int[] intArray0 = new int[2];
      intArray0[1] = (-1);
      CalendarUtil.DaysInMonth = intArray0;
      int int0 = CalendarUtil.NumDaysInMonth(1, 1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        CalendarUtil.NumDaysInMonth(2449, 2012);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2012
         //
         verifyException("calendar.CalendarUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      boolean boolean0 = CalendarUtil.IsLeapYear(0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      boolean boolean0 = CalendarUtil.IsLeapYear(2012);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = CalendarUtil.IsLeapYear(100);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = CalendarUtil.NumDaysInMonth(0, 0);
      assertEquals(31, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = CalendarUtil.NumDaysInMonth(0, 1);
      assertEquals(29, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CalendarUtil calendarUtil0 = new CalendarUtil();
      CalendarUtil.DaysInMonth = calendarUtil0.DaysInMonth;
      CalendarUtil.DaysInMonth = calendarUtil0.DaysInMonth;
      CalendarUtil.DaysInMonth = calendarUtil0.DaysInMonth;
      CalendarUtil.DaysInMonth = null;
      // Undeclared exception!
      try { 
        CalendarUtil.NumDaysInMonth(0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("calendar.CalendarUtil", e);
      }
  }
}
