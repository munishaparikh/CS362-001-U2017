package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;
public class ApptTest {
	/**
	 * Test that the gets methods work as expected.
	 */
	@Test
	public void test01() throws Throwable {
		int startHour = 13;
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
		// assertions
		assertTrue(appt.getValid());
		assertEquals(13, appt.getStartHour());
		assertEquals(30, appt.getStartMinute());
		assertEquals(10, appt.getStartDay());
		assertEquals(04, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Birthday Party", appt.getTitle());
		assertEquals("This is my birthday party.", appt.getDescription());
	}

	@Test
	public void test02() throws Throwable {
		int startHour = 25;
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
		// assertions
		assertFalse(appt.getValid());
		assertEquals(25, appt.getStartHour());
		assertEquals(30, appt.getStartMinute());
		assertEquals(10, appt.getStartDay());
		assertEquals(04, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Birthday Party", appt.getTitle());
		assertEquals("This is my birthday party.", appt.getDescription());
	}

	@Test
	public void test03() throws Throwable {
		int startHour = 13;
		int startMinute = 61;
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
		// assertions
		assertFalse(appt.getValid());
		assertEquals(13, appt.getStartHour());
		assertEquals(61, appt.getStartMinute());
		assertEquals(10, appt.getStartDay());
		assertEquals(04, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Birthday Party", appt.getTitle());
		assertEquals("This is my birthday party.", appt.getDescription());
	}

	@Test
	public void test04() throws Throwable {
		int startHour = 13;
		int startMinute = 30;
		int startDay = -1;
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
		// assertions
		assertFalse(appt.getValid());
		assertEquals(13, appt.getStartHour());
		assertEquals(30, appt.getStartMinute());
		assertEquals(-1, appt.getStartDay());
		assertEquals(04, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Birthday Party", appt.getTitle());
		assertEquals("This is my birthday party.", appt.getDescription());
	}

	@Test
	public void test05() throws Throwable {
		int startHour = -1;
		int startMinute = 30;
		int startDay = 1;
		int startMonth = 4;
		int startYear = 2017;
		String title = null;
		String description = null;
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);
		// assertions
		assertFalse(appt.getValid());
		assertEquals(-1, appt.getStartHour());
		assertEquals(30, appt.getStartMinute());
		assertEquals(1, appt.getStartDay());
		assertEquals(04, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("", appt.getTitle());
		assertEquals("", appt.getDescription());
	}


	@Test
	public void test06() throws Throwable {
		int startHour = 13;
		int startMinute = 30;
		int startDay = 1;
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
		// assertions
		appt.setStartHour(13);
		assertEquals(13, appt.getStartHour());
		appt.setStartMinute(30);
		assertEquals(30, appt.getStartMinute());
		appt.setStartDay(1);
		assertEquals(1, appt.getStartDay());
		appt.setStartMonth(4);
		assertEquals(4, appt.getStartMonth());
		appt.setStartYear(2017);
		assertEquals(2017, appt.getStartYear());
		appt.setTitle("Birthday Party");
		assertEquals("Birthday Party", appt.getTitle());
		appt.setDescription("This is my birthday party");
		assertEquals("This is my birthday party", appt.getDescription());
	}

	@Test
	public void test07() throws Throwable {
		int startHour = 13;
		int startMinute = -1;
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
		// assertions
		assertFalse(appt.getValid());
		assertEquals(13, appt.getStartHour());
		assertEquals(-1, appt.getStartMinute());
		assertEquals(10, appt.getStartDay());
		assertEquals(04, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Birthday Party", appt.getTitle());
		assertEquals("This is my birthday party.", appt.getDescription());
	}

	@Test
	public void test08() throws Throwable {
		int startHour = 13;
		int startMinute = 30;
		int startDay = 32;
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
		// assertions
		assertFalse(appt.getValid());
		assertEquals(13, appt.getStartHour());
		assertEquals(30, appt.getStartMinute());
		assertEquals(32, appt.getStartDay());
		assertEquals(04, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Birthday Party", appt.getTitle());
		assertEquals("This is my birthday party.", appt.getDescription());

	}

	@Test
	public void test09() throws Throwable {
		int startHour = 13;
		int startMinute = 30;
		int startDay = 10;
		int startMonth = 0;
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
		// assertions
		assertFalse(appt.getValid());
		assertEquals(13, appt.getStartHour());
		assertEquals(30, appt.getStartMinute());
		assertEquals(10, appt.getStartDay());
		assertEquals(0, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Birthday Party", appt.getTitle());
		assertEquals("This is my birthday party.", appt.getDescription());
	}

	@Test

	public void test10() throws Throwable {
		int startHour = 0;
		int startMinute = 0;
		int startDay = 0;
		int startMonth = 0;
		int startYear = 0;
		String title = null;
		String description = null;
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		appt.setStartHour(13);
		appt.setStartMinute(30);
		appt.setStartDay(10);
		appt.setStartMonth(4);
		appt.setStartYear(2017);
		appt.setTitle("Birthday Party");
		appt.setDescription("This is my birthday party.");

		// assertions
		assertTrue(appt.getValid());
		assertEquals(13, appt.getStartHour());
		assertEquals(30, appt.getStartMinute());
		assertEquals(10, appt.getStartDay());
		assertEquals(04, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Birthday Party", appt.getTitle());
		assertEquals("This is my birthday party.", appt.getDescription());
	}

	@Test

	public void test11() throws Throwable {
		int startHour = 13;
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
		// assertions
		assertTrue(appt.getValid());
		assertEquals(13, appt.getStartHour());
		assertEquals(30, appt.getStartMinute());
		assertEquals(10, appt.getStartDay());
		assertEquals(04, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Birthday Party", appt.getTitle());
		assertEquals("This is my birthday party.", appt.getDescription());
	}


	@Test

	public void test12() throws Throwable {
		int startHour = 0;
		int startMinute = 0;
		int startDay = 0;
		int startMonth = 0;
		int startYear = 0;
		String title = null;
		String description = null;
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		appt.setStartHour(13);
		appt.setStartMinute(30);
		appt.setStartDay(10);
		appt.setStartMonth(4);
		appt.setStartYear(2017);
		appt.setTitle("Birthday Party");
		appt.setDescription("This is my birthday party.");

		// assertions
		assertTrue(appt.getValid());
		assertEquals(13, appt.getStartHour());
		assertEquals(30, appt.getStartMinute());
		assertEquals(10, appt.getStartDay());
		assertEquals(04, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Birthday Party", appt.getTitle());
		assertEquals("This is my birthday party.", appt.getDescription());
	}


	@Test

	public void test13() throws Throwable {
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(0,
				0,
				0,
				0,
				0,
				null,
				null);


		appt.setStartHour(-3);

		assertEquals(false, appt.getValid());
		assertNull(appt.toString());
	}

	@Test

	public void test14() throws Throwable {

		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(0,
				0,
				0,
				0,
				0,
				null,
				null);

		appt.setStartHour(26);

		assertEquals(false, appt.getValid());
		assertNull(appt.toString());
	}

	@Test

	public void test15() throws Throwable {
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(0,
				0,
				0,
				0,
				0,
				null,
				null);


		appt.setStartMinute(-4);

		assertEquals(false, appt.getValid());
		assertNull(appt.toString());

	}

	@Test

	public void test16() throws Throwable {

		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(0,
				0,
				0,
				0,
				0,
				null,
				null);

		appt.setStartMinute(70);

		assertEquals(false, appt.getValid());
		assertNull(appt.toString());
	}

	@Test

	public void test17() throws Throwable {
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(0,
				0,
				0,
				0,
				0,
				null,
				null);


		appt.setStartDay(0);

		assertEquals(false, appt.getValid());
		assertNull(appt.toString());

	}

	@Test

	public void test18() throws Throwable {

		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(0,
				0,
				0,
				0,
				0,
				null,
				null);

		appt.setStartDay(35);

		assertEquals(false, appt.getValid());
		assertNull(appt.toString());
	}

	@Test

	public void test19() throws Throwable {
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(0,
				0,
				0,
				0,
				0,
				null,
				null);


		appt.setStartMonth(0);

		assertEquals(false, appt.getValid());
		assertNull(appt.toString());

	}

	@Test

	public void test20() throws Throwable {

		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(0,
				0,
				0,
				0,
				0,
				null,
				null);

		appt.setStartMonth(0);

		assertEquals(false, appt.getValid());
		assertNull(appt.toString());
	}


	@Test
	public void test21() throws Throwable {

		int startHour = 13;
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
		//check starting boundaries for mutation coverage
		appt.setStartHour(-1);
		assertFalse(appt.getValid());
		appt.setStartHour(0);
		assertTrue(appt.getValid());

		appt.setStartMinute(-1);
		assertFalse(appt.getValid());
		appt.setStartMinute(0);
		assertTrue(appt.getValid());

		appt.setStartDay(0);
		assertFalse(appt.getValid());
		appt.setStartDay(1);
		assertTrue(appt.getValid());

		appt.setStartMonth(0);
		assertFalse(appt.getValid());
		appt.setStartMonth(1);
		assertTrue(appt.getValid());

	}

	//@Test
	//public void test22() throws Throwable {

//		int startHour = 13;
//		int startMinute = 30;
//		int startDay = 10;
//		int startMonth = 4;
//		int startYear = 2017;
//		String title = "Birthday Party";
//		String description = "This is my birthday party.";
//		//Construct a new Appointment object with the initial data
//		Appt appt = new Appt(startHour,
//				startMinute,
//				startDay,
//				startMonth,
//				startYear,
//				title,
//				description);
	//check ending bounderies for mutation coverage
//		appt.setStartHour(24);
//		assertFalse(appt.getValid());
//		appt.setStartHour(23);
//		assertTrue(appt.getValid());
//
//		appt.setStartMinute(60);
//		assertFalse(appt.getValid());
//		appt.setStartMinute(59);
//		assertTrue(appt.getValid());
//
//		appt.setStartDay(32);
//		assertFalse(appt.getValid());
//		appt.setStartDay(31);
//		assertTrue(appt.getValid());
//
//		appt.setStartMonth(13);
//		assertFalse(appt.getValid());
//		appt.setStartMonth(12);
//		assertTrue(appt.getValid());
//
//	}

	@Test
	public void test23() throws Throwable {

		int startHour = 13;
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

		Appt temp;

		appt.setStartHour(24);
		if (appt.getValid()) {
			temp = new Appt(appt.getStartHour(), 30, 10, 4,
					2017, appt.getTitle(), appt.getDescription());
			assertTrue(temp.getValid());
		}

	}

	@Test
	public void test24() throws Throwable {

		int startHour = 13;
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

		Appt temp;

		appt.setStartHour(13);
		appt.setStartMinute(61);
		if (appt.getValid()) {
			temp = new Appt(13, appt.getStartMinute(), 10, 4,
					2017, appt.getTitle(), appt.getDescription());
			assertTrue(temp.getValid());
		}

	}

	@Test
	public void test25() throws Throwable {

		int startHour = 13;
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

		Appt temp;

		appt.setStartMinute(30);
		appt.setStartDay(32);
		if (appt.getValid()) {
			temp = new Appt(13, 30, appt.getStartDay(), 4,
					2017, appt.getTitle(), appt.getDescription());
			assertTrue(temp.getValid());
		}

	}

	@Test
	public void test26() throws Throwable {

		int startHour = 13;
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

		assertTrue(appt.getValid());
		assertEquals(appt.toString(), ("\t" + appt.getStartMonth() + "/" + appt.getStartDay() + "/" + appt.getStartYear() + " at " + 1 + ":" + appt.getStartMinute() + "pm" + " ," + appt.getTitle() + ", " + appt.getDescription() + "\n"));
	}

	@Test

	public void test27() throws Throwable {

		int startHour = 0;
		int startMinute = 30;
		int startDay = 10;
		int startMonth = 4;
		int startYear = 2017;
		String title = "Birthday Party";
		String description = "This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(0,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);


		assertTrue(appt.getValid());
		assertEquals(0, appt.getStartHour());
		assertEquals(30, appt.getStartMinute());
		assertEquals(10, appt.getStartDay());
		assertEquals(04, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Birthday Party", appt.getTitle());
		assertEquals("This is my birthday party.", appt.getDescription());
	}

	@Test

	public void test28() throws Throwable {

		int startHour = 24;
		int startMinute = 30;
		int startDay = 10;
		int startMonth = 4;
		int startYear = 2017;
		String title = "Birthday Party";
		String description = "This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(24,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		assertTrue(appt.getValid());
		assertEquals(24, appt.getStartHour());
		assertEquals(30, appt.getStartMinute());
		assertEquals(10, appt.getStartDay());
		assertEquals(04, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Birthday Party", appt.getTitle());
		assertEquals("This is my birthday party.", appt.getDescription());
	}
	@Test

	public void test29() throws Throwable {

		int startHour = 24;
		int startMinute = 0;
		int startDay = 10;
		int startMonth = 4;
		int startYear = 2017;
		String title = "Birthday Party";
		String description = "This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(24,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		assertTrue(appt.getValid());
		assertEquals(24, appt.getStartHour());
		assertEquals(0, appt.getStartMinute());
		assertEquals(10, appt.getStartDay());
		assertEquals(04, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Birthday Party", appt.getTitle());
		assertEquals("This is my birthday party.", appt.getDescription());
	}

	@Test

	public void test30() throws Throwable {

		int startHour = 24;
		int startMinute = 60;
		int startDay = 10;
		int startMonth = 4;
		int startYear = 2017;
		String title = "Birthday Party";
		String description = "This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(24,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		assertTrue(appt.getValid());
		assertEquals(24, appt.getStartHour());
		assertEquals(60, appt.getStartMinute());
		assertEquals(10, appt.getStartDay());
		assertEquals(04, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Birthday Party", appt.getTitle());
		assertEquals("This is my birthday party.", appt.getDescription());
	}
	@Test

	public void test31() throws Throwable {

		int startHour = 24;
		int startMinute = 30;
		int startDay = 1;
		int startMonth = 4;
		int startYear = 2017;
		String title = "Birthday Party";
		String description = "This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(24,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		assertTrue(appt.getValid());
		assertEquals(24, appt.getStartHour());
		assertEquals(30, appt.getStartMinute());
		assertEquals(1, appt.getStartDay());
		assertEquals(04, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Birthday Party", appt.getTitle());
		assertEquals("This is my birthday party.", appt.getDescription());
	}

	@Test
	public void test32() throws Throwable {

		int startHour = 24;
		int startMinute = 30;
		int startDay = 31;
		int startMonth = 4;
		int startYear = 2017;
		String title = "Birthday Party";
		String description = "This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(24,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		assertTrue(appt.getValid());
		assertEquals(24, appt.getStartHour());
		assertEquals(30, appt.getStartMinute());
		assertEquals(31, appt.getStartDay());
		assertEquals(04, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Birthday Party", appt.getTitle());
		assertEquals("This is my birthday party.", appt.getDescription());
	}

	@Test
	public void test33() throws Throwable {

		int startHour = 24;
		int startMinute = 30;
		int startDay = 31;
		int startMonth = 4;
		int startYear = 2017;
		String title = "Birthday Party";
		String description = "This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(24,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		assertEquals(2, appt.getRecurBy());
	}
	@Test
	public void test34()  throws Throwable  {
		int startHour=24;
		int startMinute=60;
		int startDay=30;
		int startMonth=10;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);


		// assertions

		assertTrue(appt.getValid());
		assertEquals(24, appt.getStartHour());
		assertEquals(60, appt.getStartMinute());
		assertEquals(30, appt.getStartDay());
		assertEquals(10, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());


	}


	@Test
	public void test35()  throws Throwable  {
		int startHour=0;
		int startMinute=0;
		int startDay=0;
		int startMonth=0;
		int startYear=0;
		String title=null;
		String description=null;
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				null,
				null);
		assertNull(appt.toString());

		int [] recurDays=null;
		int recurBy=10;
		int recurIncrement=5;
		int recurNumber=15;
		// assertions

		appt.setRecurrence(recurDays,10,5,15);


		assertNotNull(appt.getRecurDays());

		Appt a;
		appt.setStartHour(24);
		if(appt.getValid())
		{
			a=new Appt(appt.getStartHour(),40,11,5,2017,appt.getTitle(),appt.getDescription());
			assertTrue(a.getValid());
		}
	}
	public void test36()  throws Throwable  {
		int startHour=2;
		int startMinute=40;
		int startDay=11;
		int startMonth=5;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		Appt ab;
		appt.setStartHour(2);
		if(appt.getValid())
		{
			ab=new Appt(appt.getStartHour(),40,11,5,2017,appt.getTitle(),appt.getDescription());
			assertTrue(ab.getValid());

		}

	}

	@Test
	public void test37()  throws Throwable  {
		int startHour=0;
		int startMinute=0;
		int startDay=0;
		int startMonth=0;
		int startYear=0;
		String title=null;
		String description=null;
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				null,
				null);
		assertNull(appt.toString());

		int [] recurDays=null;
		int recurBy=10;
		int recurIncrement=5;
		int recurNumber=15;
		// assertions

		appt.setRecurrence(recurDays,10,5,15);


		assertNotNull(appt.getRecurDays());
		assertEquals(10,appt.getRecurBy());
		assertEquals(5,appt.getRecurIncrement());
		assertEquals(15,appt.getRecurNumber());
		Appt a;
		appt.setStartHour(24);
		if(appt.getValid())
		{
			a=new Appt(appt.getStartHour(),40,11,5,2017,appt.getTitle(),appt.getDescription());
			assertTrue(a.getValid());
		}
	}
	@Test
	public void test38()  throws Throwable  {
		int startHour=0;
		int startMinute=0;
		int startDay=0;
		int startMonth=0;
		int startYear=0;
		String title=null;
		String description=null;
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				null,
				null);
		assertNull(appt.toString());

		int [] recurDays=null;
		int recurBy=10;
		int recurIncrement=5;
		int recurNumber=15;
		// assertions

		appt.setRecurrence(recurDays,10,5,15);


		assertNotNull(appt.getRecurDays());
		assertEquals(10,appt.getRecurBy());
		assertEquals(5,appt.getRecurIncrement());
		assertEquals(15,appt.getRecurNumber());
		Appt a;
		appt.setStartHour(24);
		if(appt.getValid())
		{
			a=new Appt(appt.getStartHour(),40,11,5,2017,appt.getTitle(),appt.getDescription());
			assertTrue(a.getValid());
		}

		a=new Appt(appt.getStartHour(),40,11,5,2017,appt.getTitle(),appt.getDescription());
		assertTrue(a.getValid());

		System.out.println(a.toString());
		assertEquals("\t5/11/2017 at 12:40pm ,, \n",a.toString());
	}
	@Test
	public void test39()  throws Throwable {
		int startHour = 3;
		int startMinute = 5;
		int startDay = 8;
		int startMonth = 5;
		int startYear = 207;
		String title = null;
		String description = null;
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				"",
				"");

		appt.setStartHour(-3);
		assertFalse(appt.getValid());


	}

	@Test
	public void test40()  throws Throwable {
		int startHour = 3;
		int startMinute = 5;
		int startDay = 8;
		int startMonth = 5;
		int startYear = 2017;
		String title = null;
		String description = null;
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				"",
				"");

		appt.setStartHour(-3);

		assertFalse(appt.getValid());

		appt.setStartMinute(-3);

		assertFalse(appt.getValid());

	}

	@Test
	public void test41()  throws Throwable {
		int startHour = 3;
		int startMinute = 5;
		int startDay = 8;
		int startMonth = 5;
		int startYear = 2017;
		String title = null;
		String description = null;
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				"",
				"");
		appt.setStartMinute(-3);
		assertFalse(appt.getValid());

	}

	@Test
	public void test43()  throws Throwable {
		int startHour = 3;
		int startMinute = 5;
		int startDay = 8;
		int startMonth = 5;
		int startYear = 2017;
		String title = null;
		String description = null;
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				"",
				"");
		appt.setStartDay(-3);
		assertFalse(appt.getValid());

	}

	@Test
	public void test44()  throws Throwable {
		int startHour = 3;
		int startMinute = 5;
		int startDay = 8;
		int startMonth = 5;
		int startYear = 2017;
		String title = null;
		String description = null;
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				"",
				"");
		appt.setStartMonth(0);
		assertFalse(appt.getValid());

	}

	@Test
	public void test45()  throws Throwable {
		int startHour = 3;
		int startMinute = 5;
		int startDay = 8;
		int startMonth = 5;
		int startYear = 0;
		String title = null;
		String description = null;
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				"",
				"");
		appt.setStartYear(1992);
		assertEquals(true,appt.getValid());

	}

	@Test
	public void test46()  throws Throwable {
		int startHour = 15;
		int startMinute = 40;
		int startDay = 5;
		int startMonth = 5;
		int startYear = 2017;
		String title = null;
		String description = null;
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				"",
				"");
		appt.toString();
		assertEquals("\t5/5/2017 at 3:40pm ,, \n",appt.toString());

	}

	@Test
	public void test47()  throws Throwable {
		int startHour = 12;
		int startMinute = 40;
		int startDay = 5;
		int startMonth = 5;
		int startYear = 2017;
		String title = null;
		String description = null;
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				"",
				"");
		appt.toString();
		assertEquals("\t5/5/2017 at 12:40pm ,, \n",appt.toString());

	}

	@Test
	public void test48()  throws Throwable {
		int startHour = 0;
		int startMinute = 40;
		int startDay = 5;
		int startMonth = 5;
		int startYear = 2017;
		String title = null;
		String description = null;
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				"",
				"");
		appt.toString();
		assertEquals("\t5/5/2017 at 12:40am ,, \n",appt.toString());

	}

	@Test
	public void test49()  throws Throwable {
		int startHour = 2;
		int startMinute = 40;
		int startDay = 5;
		int startMonth = 5;
		int startYear = 2017;
		String title = null;
		String description = null;
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				"",
				"");
		appt.toString();
		assertEquals("\t5/5/2017 at 2:40am ,, \n",appt.toString());

	}

	@Test
	public void test50()  throws Throwable {
		int startHour = 11;
		int startMinute = 40;
		int startDay = 5;
		int startMonth = 5;
		int startYear = 2017;
		String title = null;
		String description = null;
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				"",
				"");
		appt.toString();
		assertEquals("\t5/5/2017 at 11:40am ,, \n",appt.toString());

	}
	@Test
	public void test51() throws Throwable {

		int startHour = 24;
		int startMinute = 30;
		int startDay = 31;
		int startMonth = 4;
		int startYear = 2017;
		String title = "Birthday Party";
		String description = "This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(24,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		assertEquals(2, appt.getRecurBy());
//add more unit tests as you needed
	}
	@Test
	public void test52() throws Throwable {

		int startHour = 24;
		int startMinute = 30;
		int startDay = 31;
		int startMonth = 4;
		int startYear = 2017;
		String title = "Birthday Party";
		String description = "This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(24,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		appt.isRecurring();
		assertFalse(appt.isRecurring());


	}


	}