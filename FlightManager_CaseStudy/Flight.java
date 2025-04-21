package FlightManager_CaseStudy;

abstract public class Flight {
	private int flightid;
	private int departureTime;
	private int arrivalTime;
	private int availableSeats;
	public Flight(int flightid, int departureTime, int arrivalTime, int availableSeats) {
		this.flightid = flightid;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.availableSeats = availableSeats;
	}
	abstract public boolean bookSeats(int count);
	abstract public boolean isAvailable();
	abstract public void getFlightInfo();
	public int getFlightid() {
		return flightid;
	}
	public void setFlightid(int flightid) {
		this.flightid = flightid;
	}
	public int getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(int departureTime) {
		this.departureTime = departureTime;
	}
	public int getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(int arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
}
