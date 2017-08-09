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
		CalDay cal = new CalDay();
		assertFalse(cal.isValid());
	}

	@Test
	public void test02() throws Throwable {

		CalDay cal = new CalDay();
		String test = cal.toString();
		assertEquals("", test);
	}

	@Test

	public void test03() throws Throwable {

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

	public void test04() throws Throwable {

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

	@Test
	public void test05() throws Throwable {


		int thisMonth;
		int thisYear;
		int thisDay;

		Calendar rightnow = Calendar.getInstance();
		thisMonth = rightnow.get(Calendar.MONTH) + 1;
		thisYear = rightnow.get(Calendar.YEAR);
		thisDay = rightnow.get(Calendar.DAY_OF_MONTH);

		GregorianCalendar obj = new GregorianCalendar(thisYear, thisMonth, thisDay);
		CalDay cal = new CalDay(obj);

		//assertEquals(thisDay, cal.getDay());
		//assertEquals(thisMonth, cal.getMonth());
		assertEquals(thisYear, cal.getYear());
		assertTrue(cal.isValid());
	}


	@Test
	public void test06() throws Throwable {

		CalDay cal = new CalDay();
		assertFalse(cal.isValid());
	}


	@Test

	public void test07() throws Throwable {

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

//assertions
		assertTrue(calDay.isValid());
		assertSame(appt, obj);
	}

	@Test
	public void test08() throws Throwable {

		CalDay cal = new CalDay();
		String test = cal.toString();
		assertEquals("", test);
	}


	@Test

	public void test09() throws Throwable {

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
		//assertions
		assertTrue(cal.isValid());
		assertTrue(it.hasNext());
		assertEquals(set, set);
	}

	@Test

	public void test10() throws Throwable {

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

	@Test
	public void test11() throws Throwable {

		GregorianCalendar obj = new GregorianCalendar();
		CalDay cal = new CalDay(obj);

		cal = new CalDay();
		assertEquals("", cal.toString());
		cal = new CalDay(obj);
		cal.addAppt(new Appt(13,
				30,
				10,
				4,
				2017,
				"Birthday Party",
				"This is my birthday party."));
		assertTrue(cal.toString() != "");

	}

	@Test
	public void test12() throws Throwable {

		GregorianCalendar calendar = new GregorianCalendar(2017, 4, 30, 18, 30, 0);
		CalDay cal = new CalDay(calendar);
		assertTrue(cal.iterator() != null);

		cal = new CalDay();
		assertTrue(cal.iterator() == null);
	}

	@Test
	public void test13() throws Throwable {

		GregorianCalendar calendar = new GregorianCalendar(2017, 4, 30, 18, 30, 0);
		CalDay cal = new CalDay(calendar);
		assertEquals(-1, cal.getSizeAppts());
		assertEquals(4, cal.getDay());
		assertEquals(4, cal.getMonth());
		assertEquals(2017, cal.getYear());
		assertTrue(cal.getAppts() != null);
	}

	@Test

	public void test14() throws Throwable {

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
		//assertions
		assertTrue(cal.isValid());
		assertTrue(it.hasNext());
		assertEquals(set, set);
		assertEquals(4, cal.getSizeAppts());
	}

	@Test
	public void test15() throws Throwable {
		int startHour = 11;
		int startMinute = 30;
		int startDay = 10;
		int startMonth = 4;
		int startYear = 2017;
		String title = "Birthday Party";
		String description = "This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		Appt appt2 = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		GregorianCalendar today = new GregorianCalendar(2, 3, 4);
		CalDay c = new CalDay(today);
		c.addAppt(appt);
		c.addAppt(appt2);

		assertEquals(1,c.getSizeAppts());
	}

	@Test
	public void test16() throws Throwable {
		int startHour = 11;
		int startMinute = 30;
		int startDay = 10;
		int startMonth = 4;
		int startYear = 2017;
		String title = "Birthday Party";
		String description = "This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		Appt appt2 = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		GregorianCalendar today = new GregorianCalendar(2, 3, 4);
		CalDay c = new CalDay(today);
		c.addAppt(appt);
		c.addAppt(appt2);

		assertEquals(1,c.getSizeAppts());
		c.getDay();
		assertEquals(3,c.getDay());

		c.getMonth();
		assertEquals(3,c.getMonth());
	}

	@Test
	public void test17() throws Throwable {
		int startHour = 11;
		int startMinute = 30;
		int startDay = 10;
		int startMonth = 4;
		int startYear = 2017;
		String title = "Birthday Party";
		String description = "This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		Appt appt2 = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		GregorianCalendar today = new GregorianCalendar(2, 3, 4);
		CalDay c = new CalDay(today);
		c.addAppt(appt);
		c.addAppt(appt2);

		assertEquals(1,c.getSizeAppts());
		c.getDay();
		assertEquals(3,c.getDay());

		c.getYear();
		assertEquals(2,c.getYear());


		assertNotNull(c.toString());
	}
	@Test
	public void test18() throws Throwable {
		int startHour = 11;
		int startMinute = 30;
		int startDay = 10;
		int startMonth = 4;
		int startYear = 2017;
		String title = "Birthday Party";
		String description = "This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(13,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		Appt appt2 = new Appt(13,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		GregorianCalendar today = new GregorianCalendar(2, 3, 4);
		CalDay c = new CalDay(today);
		c.addAppt(appt);
		c.addAppt(appt2);

		assertEquals(1,c.getSizeAppts());
		c.getDay();
		assertEquals(3,c.getDay());


		CalDay c2 = new CalDay();

		assertEquals(0,c2.getYear());

		assertNotNull(c2.toString());
		c2.toString();
		Appt baap = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);
		c.addAppt(baap);
		assertNotNull(appt.getStartHour());


	}

	@Test
	public void test19() throws Throwable {
		int startHour = 11;
		int startMinute = 30;
		int startDay = 10;
		int startMonth = 4;
		int startYear = 2017;
		String title = "Birthday Party";
		String description = "This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		Appt appt2 = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		GregorianCalendar today = new GregorianCalendar(2, 3, 4);
		CalDay c = new CalDay(today);
		c.addAppt(appt);
		c.addAppt(appt2);

		assertEquals(1,c.getSizeAppts());
		c.getDay();
		assertEquals(3,c.getDay());

		c.getYear();
		assertEquals(2,c.getYear());


		assertNotNull(c.toString());

		assertNotNull(c.getAppts().add(appt));
	}

	@Test
	public void test20() throws Throwable {
		int startHour = 11;
		int startMinute = 30;
		int startDay = 10;
		int startMonth = 4;
		int startYear = 2017;
		String title = "Birthday Party";
		String description = "This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		Appt appt2 = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		GregorianCalendar today = new GregorianCalendar(2, 3, 4);
		CalDay c = new CalDay(today);
		c.addAppt(appt);
		c.addAppt(appt2);

		assertEquals(1,c.getSizeAppts());
		c.getDay();
		assertEquals(3,c.getDay());

		c.getYear();
		assertEquals(2,c.getYear());


		assertNotNull(c.toString());

		assertNotNull(c.getAppts().add(appt));
		//CalDay:c.setDay(2);
	}

	@Test
	public void test21() throws Throwable {
		Appt appt_1 = new Appt(1, 1, 5, 5, 2017,
				"Appt_1",
				"");

		Appt appt_2 = new Appt(5, 14, 5, 5, 2017,
				"Appt_2",
				"");

		Appt appt_3 = new Appt(1, 25, 5, 5, 2017,
				"Appt_3",
				"");

		Appt appt_4 = new Appt(1, 25, 5, 5, 2017,
				"Appt_3",
				"");

		int [] arr = {1,2,3,4,5,6,7,8,9,0};
		appt_1.setRecurrence(arr, 0, 0, 0);
		appt_2.setRecurrence(arr, 1, 10, 20);
		appt_3.setRecurrence(arr, 3, 30, -1);

		GregorianCalendar today = new GregorianCalendar(2017, 5, 5);
		CalDay c = new CalDay(today);

		c.addAppt(appt_1);
		c.addAppt(appt_2);
		c.addAppt(appt_3);
		c.addAppt(appt_4);

		assertEquals(3, c.getSizeAppts());
	}

	@Test
	public void test22() throws Throwable {
		Appt appt_1 = new Appt(1, 1, 5, 5, 2017,
				"Appt_1",
				"1");

		Appt appt_2 = new Appt(1, 1, 5, 5, 2017,
				"Appt_2",
				"2");

		Appt appt_3 = new Appt(3, 50, 5, 5, 2017,
				"Appt_3",
				"3");

		Appt appt_4 = new Appt(2, 25, 5, 5, 2017,
				"Appt_4",
				"4");

		//int [] arr = {1,2,3,4,5,6,7,8,9,0};
		//appt_1.setRecurrence(arr, 0, 0, 0);
		//appt_2.setRecurrence(arr, 1, 10, 20);
		//appt_3.setRecurrence(arr, 3, 30, -1);

		GregorianCalendar today = new GregorianCalendar(2017, 5, 5);
		CalDay c = new CalDay(today);

		c.addAppt(appt_1);
		c.addAppt(appt_2);
		c.addAppt(appt_3);
		c.addAppt(appt_4);

		assertEquals(3, c.getSizeAppts());
		LinkedList<Appt> appt0 =  c.getAppts();
		assertEquals(appt_1.getDescription(), appt0.get(0).getDescription());
		assertEquals(appt_2.getDescription(), appt0.get(1).getDescription());
		assertEquals(appt_3.getDescription(), appt0.get(3).getDescription());
		assertEquals(appt_4.getDescription(), appt0.get(2).getDescription());
	}





}
