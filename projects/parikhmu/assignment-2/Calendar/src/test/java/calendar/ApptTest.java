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
}



