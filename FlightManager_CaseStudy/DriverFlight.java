package FlightManager_CaseStudy;
import java.util.*;
public class DriverFlight {
	public static void main(String[] args) {
		DomesticFlight dFlight = new DomesticFlight(101, 1130, 900, 50, "MH");
		InternationalFlight iFlight = new InternationalFlight(202, 1900, 1400, 150, "US");
		FlightsScheduleManager f = new FlightsScheduleManager();
		f.addFlight(iFlight);
		f.addFlight(dFlight);
		f.bookFlight(101, 4);
		List<Flight> fl = f.getAvailableFlights(1200, 1700);
		for(Flight fll : fl) {
			fll.getFlightInfo();
		}
	}
}
