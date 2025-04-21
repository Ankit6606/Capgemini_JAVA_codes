package FlightManager_CaseStudy;

public class InternationalFlight extends Flight {
	private String countryCode;
	public InternationalFlight(int flightid, int departureTime, int arrivalTime, int availableSeats, String countryCode) {
		super(flightid, departureTime, arrivalTime, availableSeats);
		this.countryCode = countryCode;
	}
	public boolean bookSeats(int count) {
		if(this.isAvailable() && this.getAvailableSeats()>=count) {
			this.setAvailableSeats(getAvailableSeats()-count);
			System.out.println(count+" seat is booked");
			return true;
		}
		return false;
	}
	public boolean isAvailable() {
		if(this.getAvailableSeats() == 0)return false;
		return true;
	}
	
	public void getFlightInfo() {
		System.out.println("Flightid:"+super.getFlightid()+"\nDeparture Time:"+super.getDepartureTime()+"\nArrival Time:"+super.getArrivalTime()+"\nCoutry code:"+this.countryCode);
	}
}
