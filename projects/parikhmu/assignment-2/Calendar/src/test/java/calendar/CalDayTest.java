package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedList;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	@Test
	public void test01() throws Throwable {
		int thisMonth;
		int thisYear;
		int thisDay;

		//get todays date
		Calendar rightnow = Calendar.getInstance();
		//current month/year/date is today
		thisMonth = rightnow.get(Calendar.MONTH) + 1;
		thisYear = rightnow.get(Calendar.YEAR);
		thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
		//Construct a new CalDay object with the initial date
		GregorianCalendar obj = new GregorianCalendar(thisYear, thisMonth, thisDay);
		CalDay cal = new CalDay(obj);
		// assertions
		assertEquals(thisDay, cal.getDay());
		assertEquals(thisMonth, cal.getMonth());
		assertEquals(thisYear, cal.getYear());
		assertTrue(cal.isValid());

	}

	@Test
	public void test02() throws Throwable {
		CalDay cal = new CalDay();
		assertFalse(cal.isValid());
	}

	@Test
	public void test03() throws Throwable {

		CalDay cal = new CalDay();
		String test = cal.toString();
		assertEquals("", test);
	}

	@Test

	public void test04() throws Throwable {

		GregorianCalendar cal = new GregorianCalendar();
		CalDay calDay = new CalDay(cal);
		Appt appt = new Appt(13,
				30,
				10,
				4,
				2017,
				"Birthday Party",
				"This is my birthday party.");

		calDay.addAppt(appt);
		LinkedList<Appt> list = calDay.getAppts();
		Appt obj = list.getFirst();

		assertTrue(calDay.isValid());
		assertSame(appt, obj);
	}

	@Test

	public void test05() throws Throwable {

		GregorianCalendar obj = new GregorianCalendar();
		CalDay cal = new CalDay(obj);
//random values for testing addAppt (branch coverage)

		Appt appt = new Appt(13,
				30,
				10,
				4,
				2017,
				"Birthday Party",
				"This is my birthday party.");

		cal.addAppt(appt);

		appt = new Appt(13,
				30,
				15,
				7,
				2017,
				"Birthday Party",
				"This is my birthday party.");

		cal.addAppt(appt);

		appt = new Appt(13,
				20,
				14,
				9,
				2014,
				"Birthday Party",
				"This is my birthday party.");

		cal.addAppt(appt);

		appt = new Appt(10,
				10,
				8,
				11,
				2015,
				"Birthday Party",
				"This is my birthday party.");

		cal.addAppt(appt);

		appt = new Appt(13,
				55,
				14,
				8,
				2017,
				"Birthday Party",
				"This is my birthday party.");

		cal.addAppt(appt);

		Iterator it = cal.iterator();
		Object set = it.next();

		assertTrue(cal.isValid());
		assertTrue(it.hasNext());
		assertEquals(set, appt);
	}

	@Test

	public void test06() throws Throwable {

		GregorianCalendar obj = new GregorianCalendar();
		CalDay cal = new CalDay(obj);

		Appt appt = new Appt(13,
				30,
				10,
				4,
				2017,
				"Birthday Party",
				"This is my birthday party.");

		//add the appointment to the calendar
		cal.addAppt(appt);
		String print = cal.toString();
		System.out.print(print);

	}

}