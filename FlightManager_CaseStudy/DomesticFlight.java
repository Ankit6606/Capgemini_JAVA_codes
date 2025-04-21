package FlightManager_CaseStudy;

public class DomesticFlight extends Flight {
	private String stateCode;
	public DomesticFlight(int flightid, int departureTime, int arrivalTime, int availableSeats, String stateCode) {
		super(flightid, departureTime, arrivalTime, availableSeats);
		this.stateCode = stateCode;
	}
	public boolean bookSeats(int count) {
		if(this.isAvailable() && this.getAvailableSeats()>=count) {
			this.setAvailableSeats(this.getAvailableSeats()-count);
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
		System.out.println("Flightid:"+super.getFlightid()+"\nDeparture Time:"+super.getDepartureTime()+"\nArrival Time:"+super.getArrivalTime()+"\nCoutry code:"+this.stateCode);
	}
}
