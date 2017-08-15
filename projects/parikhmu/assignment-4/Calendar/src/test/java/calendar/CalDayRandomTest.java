package calendar;


import org.junit.Test;
import java.util.Calendar;
import java.util.Random;
import java.util.Iterator;
import java.util.GregorianCalendar;
import org.junit.Test;



import static org.junit.Assert.*;




/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS = 100;

	/**
	 * Generate Random Tests that tests CalDay Class.
	 */
	// @Test
	//public void randomtest()  throws Throwable  {


	/**
	 * Generate Random Tests that tests CalDay Class.
	 */
	@Test
	public void randomtest() throws Throwable {

		long startTime = Calendar.getInstance().getTimeInMillis();
		long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		System.out.println("Start testing...");

		for (int iteration = 0; elapsed < TestTimeout; iteration++) {
			long randomseed = System.currentTimeMillis();//System.currentTimeMillis();
			//			System.out.println(" Seed:"+randomseed );
			Random random = new Random(randomseed);

			int startHour = 13;
			int startMinute = 30;
			int startDay = 10;
			int startMonth = 4;
			int startYear = 2017;
			String title = "Birthday Party";
			String description = "This is my birthday party.";
			//Construct a new Appointment object with the initial data

			GregorianCalendar today = new GregorianCalendar(startYear, startMonth, startDay);
			CalDay calday = new CalDay(today);

			Appt appt = new Appt(startHour,
					startMinute,
					startDay,
					startMonth,
					startYear,
					title,
					description);

			Appt newappt = new Appt(startHour,
					startMinute,
					startDay,
					startMonth,
					startYear,
					title,
					description);


			for (int i = 0; i < NUM_TESTS; i++) {


				appt.setStartHour(ValuesGenerator.getRandomIntBetween(random, 0, 200));
				appt.setStartMinute(ValuesGenerator.getRandomIntBetween(random, 0, 100));
				appt.setStartDay(ValuesGenerator.getRandomIntBetween(random, 1, 500));
				appt.setStartMonth(ValuesGenerator.getRandomIntBetween(random, 1, 300));
				appt.setStartYear(ValuesGenerator.getRandomIntBetween(random, 2017, 2100));
				appt.setTitle(ValuesGenerator.getString(random));
				appt.setDescription(ValuesGenerator.getString(random));

				newappt.setStartHour(ValuesGenerator.getRandomIntBetween(random, 0, 12));
				newappt.setStartMinute(ValuesGenerator.getRandomIntBetween(random, 0, 60));
				newappt.setStartDay(ValuesGenerator.getRandomIntBetween(random, 1, 31));
				newappt.setStartMonth(ValuesGenerator.getRandomIntBetween(random, 1, 12));
				newappt.setStartYear(ValuesGenerator.getRandomIntBetween(random, 2017, 2100));
				newappt.setTitle(ValuesGenerator.getString(random));
				newappt.setDescription(ValuesGenerator.getString(random));

				calday.addAppt(appt);
				calday.addAppt(newappt);

			}

			elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			if ((iteration % 10000) == 0 && iteration != 0)
				System.out.println("elapsed time: " + elapsed + " of " + TestTimeout);

		}

	}

}






