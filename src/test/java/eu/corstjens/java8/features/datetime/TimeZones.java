package eu.corstjens.java8;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * Created by Koen on 20/04/2016.
 */
public class TimeZones {

    @Test
    public void printTimeZone() {
        Set<String> allZones = ZoneId.getAvailableZoneIds();
        LocalDateTime dt = LocalDateTime.now();

        // Create a List using the set of zones and sort it.
        List<String> zoneList = new ArrayList<String>(allZones);
        Collections.sort(zoneList);


        for (String s : zoneList) {
            ZoneId zone = ZoneId.of(s);
            ZonedDateTime zdt = dt.atZone(zone);
            ZoneOffset offset = zdt.getOffset();
            String out = String.format("%35s %10s%n", zone, offset);
            System.out.printf(out);
        }
    }
}
