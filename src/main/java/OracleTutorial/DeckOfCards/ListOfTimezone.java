package OracleTutorial.DeckOfCards;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * Created by a.shipulin on 11.08.17.
 */
public class ListOfTimezone {
    public static void main(String[] args) {
        Set<String> allZones = ZoneId.getAvailableZoneIds();
        LocalDateTime dt = LocalDateTime.now();

        List<String> zoneList = new ArrayList<String>(allZones);
        Collections.sort(zoneList);

        for(String s: zoneList) {
            ZoneId zone = ZoneId.of(s);
            ZonedDateTime zdt = dt.atZone(zone);
            ZoneOffset offset = zdt.getOffset();
            int secondsOfHour = offset.getTotalSeconds()%(60*60);
            String out = String.format("%35s %10s%n", zone, offset);
            if(secondsOfHour != 0) {
                System.out.println(out);
            }
        }
    }
}
