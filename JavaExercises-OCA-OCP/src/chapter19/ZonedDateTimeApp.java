package chapter19;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZonedDateTimeApp {

	public static void main(String[] args) {
		
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println(zonedDateTime);
		
		ZoneId istanbulZoneId = ZoneId.of("Europe/Istanbul");
		ZonedDateTime istanbulTime = zonedDateTime.withZoneSameInstant(istanbulZoneId);
		System.out.println(istanbulTime);
		
		OffsetDateTime offsetDateTime = OffsetDateTime.now();
		System.out.println(offsetDateTime);
		
		OffsetDateTime offsetUtc = offsetDateTime.withOffsetSameInstant(ZoneOffset.UTC);
		System.out.println(offsetUtc);
		
		LocalDateTime localDateTime = zonedDateTime.toLocalDateTime();	
		System.out.println(localDateTime);
		
		System.out.println(offsetDateTime.isAfter(offsetUtc));
		System.out.println(offsetDateTime.isBefore(offsetUtc));
		System.out.println(offsetDateTime.isEqual(offsetUtc));
		
		ZoneOffset myZoneOffset = ZoneOffset.ofHoursMinutes(3, 30);
		System.out.println(myZoneOffset);
		System.out.println(offsetDateTime.withOffsetSameInstant(myZoneOffset));
		
		ZoneOffset myZoneOffsetString = ZoneOffset.of("+03:30");
		System.out.println(offsetDateTime.withOffsetSameInstant(myZoneOffsetString));

		
	}
	
}
