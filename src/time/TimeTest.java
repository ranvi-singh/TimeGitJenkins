package time;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TimeTest {
	
	//failing test for testGetMilliseconds
	@Test
	public void testGetMillisecondsGood() {
		int milliseconds = Time.getMilliseconds("12:05:05:05");
assertTrue("The milliseconds were not calculated properly", milliseconds == 5);
	}
	
	// Bad test for milliseconds
	@Test
	public void testGetTotalMinutesBad() {
		assertThrows(NumberFormatException.class, () -> {
			Time.getMilliseconds("12:10:30:00:00");
		});
	}
	
	//Boundary test for milliseconds
	@Test
	public void testGetMillisecondsBoundary() {
		int milliseconds = Time.getMilliseconds("12:05:05:00");
assertTrue("The milliseconds were not calculated properly", milliseconds == 0);
	}

//	// Good Test for minutes
//	@ParameterizedTest
//	@ValueSource(strings = { "05:10:00", "09:10:00", "10:10:00" })
//	void testGetTotalMinutesGood(String candidate) {
//		int minutes = Time.getTotalMinutes(candidate);
//		assertTrue("The minutes were not calculated properly", minutes == 10);
//
//	}
//
//	// Bad test for minutes
//	@Test
//	public void testGetTotalMinutesBad() {
//		assertThrows(StringIndexOutOfBoundsException.class, () -> {
//			Time.getTotalMinutes("5");
//		});
//	}
//
//	// Boundary test for minutes
//	@ParameterizedTest
//	@ValueSource(strings = { "05:00:20", "10:00:30" })
//	void testGetTotalMinutesBoundary(String candidate) {
//		int minutes = Time.getTotalMinutes(candidate);
//		assertTrue("The minutes were not calculated properly", minutes == 0);
//
//	}
//
//	// Good Test for Total seconds
//	@ParameterizedTest
//	@ValueSource(strings = { "01:00:60", "00:60:60" })
//	void testGetTotalSecondsGood(String candidate) {
//		int seconds = Time.getTotalSeconds(candidate);
//		assertTrue("The seconds were not calculated properly", seconds == 3660);
//
//	}
//
//	// Boundary Test for Total seconds
//	@ParameterizedTest
//	@ValueSource(strings = { "00:01:00", "00:00:60" })
//	void testGetTotalSecondsBoundary(String candidate) {
//		int seconds = Time.getTotalSeconds(candidate);
//		assertTrue("The seconds were not calculated properly", seconds == 60);
//
//	}
//
//	// Bad test for Total seconds
//	@Test
//	public void testGetTotalSecondsBad() {
//		assertThrows(StringIndexOutOfBoundsException.class, () -> {
//			Time.getTotalSeconds("10:00");
//		});
//	}
//
//	// Good Test for seconds
//	@ParameterizedTest
//	@ValueSource(strings = { "01:00:30", "10:60:30" })
//	void testGetSecondsGood(String candidate) {
//		int seconds = Time.getSeconds(candidate);
//		assertTrue("The seconds were not calculated properly", seconds == 30);
//
//	}
//
//	// Bad test for seconds
//	@Test
//	public void testGetSecondsBad() {
//		assertThrows(StringIndexOutOfBoundsException.class, () -> {
//			Time.getSeconds("02:60");
//		});
//	}
//
//	// Boundary Test for seconds
//	@ParameterizedTest
//	@ValueSource(strings = { "00:01:60", "10:00:60" })
//	void testGetSecondsBoundary(String candidate) {
//		int seconds = Time.getSeconds(candidate);
//		assertTrue("The seconds were not calculated properly", seconds == 60);
//
//	}
//
//	// Good test for Total hours
//	@ParameterizedTest
//	@ValueSource(strings = { "05:00:00", "05:15:15", "05:59:59" })
//	void testGetTotalHoursGood(String candidate) {
//		int hours = Time.getTotalHours(candidate);
//		assertTrue("The hours were not calculated properly", hours == 5);
//
//	}
//
//	// Bad test from Total Hours
//	@Test
//	public void testGetTotalHoursBad() {
//		assertThrows(StringIndexOutOfBoundsException.class, () -> {
//			Time.getTotalHours("4");
//		});
//	}
//
//	// Boundary test for Total hours
//	@ParameterizedTest
//	@ValueSource(strings = { "00:00:00", "00:15:15", "00:59:59" })
//	void testGetTotalHoursBoundary(String candidate) {
//		int hours = Time.getTotalHours(candidate);
//		assertTrue("The hours were not calculated properly", hours == 0);
//
//	}

}
