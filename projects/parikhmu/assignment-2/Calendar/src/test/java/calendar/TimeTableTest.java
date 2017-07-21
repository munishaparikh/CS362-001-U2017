package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {

	@Test
	public void test01() throws Throwable {
		TimeTable tt = new TimeTable();

		LinkedList<Appt> appts = new LinkedList<Appt>();

		Appt appt1 = new Appt(15,
				15,
				5,
				5,
				2017,
				"",
				"");

		appts.add(appt1);
		int[] recurringDays = new int[0];
		appt1.setRecurrence(recurringDays, Appt.RECUR_BY_MONTHLY, 0, 1);
		GregorianCalendar firstDay = new GregorianCalendar(2017, 5, 5);
		GregorianCalendar lastDay = new GregorianCalendar(2017, 5, 6);

		try {


			tt.getApptRange(appts, firstDay, lastDay);

			assertTrue(tt.deleteAppt(appts, null) == null);
			assertTrue(tt.deleteAppt(null,
					new Appt(15, 30, 30, 4, 2017, "Birthday", "Birthday Party!")) == null);
			assertTrue(tt.deleteAppt(appts, new Appt(15, 30, 30, 4, 2017, "Birthday", "Birthday Party!")) == null);
			assertTrue(tt.deleteAppt(appts, new Appt(0, 0, 0, 0, 0, "", "")) == null);
		} catch (NullPointerException e) {
		}

	}

	@Test
	public void test02() throws Throwable {
		GregorianCalendar obj = new GregorianCalendar();
		CalDay cal = new CalDay(obj);
		TimeTable table = new TimeTable();

		Appt appt = new Appt(11,
				30,
				10,
				4,
				2017,
				"Birthday Party",
				"This is my birthday party.");

		cal.addAppt(appt);

		appt = new Appt(8,
				30,
				15,
				7,
				2017,
				"Birthday Party",
				"This is my birthday party.");

		cal.addAppt(appt);
		LinkedList<Appt> list = cal.getAppts();
		GregorianCalendar today = new GregorianCalendar();
		GregorianCalendar lastday = (GregorianCalendar) today.clone();
		lastday.add(Calendar.DAY_OF_MONTH, 20);

		try {
			LinkedList<CalDay> range = table.getApptRange(list, today, lastday);
			System.out.print(range);
		} catch (NullPointerException e) {
		}
	}


	@Test
	public void test03() throws Throwable {
		LinkedList<Appt> appts = new LinkedList<Appt>();
		TimeTable table = new TimeTable();
		Appt appt1 = new Appt(15,
				15,
				5,
				5,
				2017,
				"",
				"");

		Appt appt2 = new Appt(15,
				15,
				4,
				5,
				2017,
				"",
				"");

		appts.add(appt1);
		appts.add(appt2);
		int[] pv = {1, 0};
		table.permute(appts, pv);


	}

	@Test
	public void test04() throws Throwable {
		TimeTable timetable = new TimeTable();
	}

	@Test
	public void test05() throws Throwable {
		TimeTable timetable = new TimeTable();

		//Create a linked list of appts to be used
		Appt appt_1 = new Appt(1,
				11,
				5,
				6,
				2017,
				"Appt_1",
				"");

		Appt appt_2 = new Appt(5,
				15,
				5,
				6,
				2017,
				"Appt_2",
				"");

		Appt appt_3 = new Appt(5,
				20,
				6,
				8,
				2017,
				"Appt_3",
				"");


		LinkedList<Appt> ApptsList = new LinkedList<Appt>();
		ApptsList.add(appt_1);
		ApptsList.add(appt_2);
		ApptsList.add(appt_3);


		GregorianCalendar first = new GregorianCalendar(2017, 6, 4);
		GregorianCalendar last = new GregorianCalendar(2018, 6, 7);

		try {
			timetable.getApptRange(ApptsList, last, first);
		} catch (DateOutOfRangeException e) {

		}
	}
	@Test
	public void test06()  throws Throwable  {
		TimeTable timetable = new TimeTable();

		//Create a linked list of appts to be used
		Appt appt_1 = new Appt(1,
				10 ,
				5 ,
				0 ,
				2017 ,
				"Appt_1",
				"");

		Appt appt_2 = new Appt(5,
				15 ,
				5 ,
				0 ,
				2017 ,
				"Appt_2",
				"");

		Appt appt_3 = new Appt(5,
				20 ,
				6 ,
				0 ,
				2017 ,
				"Appt_3",
				"");


		LinkedList<Appt> ApptsList = new LinkedList<Appt>();
		ApptsList.add(appt_1);
		ApptsList.add(appt_2);
		ApptsList.add(appt_3);

		assertFalse(appt_1.getValid());
		assertFalse(appt_2.getValid());
		assertFalse(appt_3.getValid());
		//create first and last days
		//GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
		GregorianCalendar first = new GregorianCalendar(2017, 6, 4);
		GregorianCalendar last = new GregorianCalendar(2017, 6, 7);

		try	{
			timetable.getApptRange(ApptsList, first, last);
		} catch(DateOutOfRangeException e)	{

		}


	}

	@Test
	public void test07()  throws Throwable  {
		TimeTable timetable = new TimeTable();


		Appt appt_1 = new Appt(1,
				10 ,
				5 ,
				6 ,
				2017 ,
				"Appt_1",
				"");

		int [] arr = {};
		appt_1.setRecurrence(arr, 1, 1, 10);

		LinkedList<Appt> ApptsList = new LinkedList<Appt>();
		ApptsList.add(appt_1);
		assertTrue(appt_1.isRecurring());


		GregorianCalendar first = new GregorianCalendar(2017, 6, 5);
		GregorianCalendar last = new GregorianCalendar(2017, 6, 6);

		//try	{
		timetable.getApptRange(ApptsList, first, last);
		//} catch(NullPointerException e)	{

		//}
	}

	@Test
	public void test08()  throws Throwable  {
		TimeTable timetable = new TimeTable();


		Appt appt_1 = new Appt(1,
				10 ,
				5 ,
				6 ,
				2017 ,
				"Appt_1",
				"");

		int [] arr = {1,2};
		appt_1.setRecurrence(arr, 2, 2, 10);

		LinkedList<Appt> ApptsList = new LinkedList<Appt>();
		ApptsList.add(appt_1);
		assertTrue(appt_1.isRecurring());


		//GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
		GregorianCalendar first = new GregorianCalendar(2017, 6, 5);
		GregorianCalendar last = new GregorianCalendar(2017, 6, 6);

		//try	{
		timetable.getApptRange(ApptsList, first, last);
		//} catch(NullPointerException e)	{

		//}
	}
	@Test
	public void test09()  throws Throwable  {
		TimeTable timetable = new TimeTable();


		Appt appt_1 = new Appt(1,
				10 ,
				5 ,
				6 ,
				2017 ,
				"Appt_1",
				"");

		int [] arr = {1,2};
		appt_1.setRecurrence(arr, 3, 3, 10);

		LinkedList<Appt> ApptsList = new LinkedList<Appt>();
		ApptsList.add(appt_1);
		assertTrue(appt_1.isRecurring());
		//GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
		GregorianCalendar first = new GregorianCalendar(2017, 6, 5);
		GregorianCalendar last = new GregorianCalendar(2017, 6, 6);

		//try	{
		timetable.getApptRange(ApptsList, first, last);
		//} catch(NullPointerException e)	{

		//}
	}

}





