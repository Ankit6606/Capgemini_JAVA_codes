package FlightManager_CaseStudy;
import java.util.*;
public class FlightsScheduleManager {
	private List<Flight> flights = new ArrayList<>();
	public void addFlight(Flight flight) {
		flights.add(flight);
		flight.getFlightInfo();
	}
	public boolean bookFlight(int id, int count) {
		for(Flight f : flights) {
			if(f.getFlightid() == id) {
				if(f.bookSeats(count)) {
					System.out.println("Flight with id: "+f.getFlightid()+" has been booked");
					return true;
				}
				
			}
		}
		return false;
	}
	public List<Flight> getAvailableFlights(int start, int end){
		List<Flight> avFlight = new ArrayList<>();
		for(Flight f : flights) {
			if(f.getArrivalTime()<end && f.getDepartureTime()>start) {
				avFlight.add(f);
			}
		}
		return avFlight;
	}
}
