package vehiclePack;
/**
 * 
 * @author Poonam Paraskar
 *
 */
public class Vehicle {
	private int currentSpeed;
	private float currentDirection;
	private String ownerName;
	private int vehicleIdentificationNumber;
	private int vehicleId;

	public static final String northDirection = "North";
	public static final String eastDirection = "East";
	public static final String westDirection = "West";
	public static final String southDirection = "South";

	private String direction = northDirection;
	private static int highestIdentificationNumber ;

	public static final int TURN_LEFT = -1;
	public static final int TURN_RIGHT = 1;

	public Vehicle() {
		vehicleIdentificationNumber = highestIdentificationNumber++;
	}

	public Vehicle(String ownerName) {
		this.setOwnerName(ownerName);
		vehicleIdentificationNumber = highestIdentificationNumber++;
	}

	public void changeSpeed(int newSpeed) {
		if (newSpeed >= 0) {
			this.currentSpeed = newSpeed;
		} else {
			this.currentSpeed = 0;
		}
	}

	public void stop() {
		this.currentSpeed = 0;
	}

	public void turn(float degreesToTurn, int direction) {
		if (TURN_LEFT == direction) {
			this.currentDirection = degreesToTurn;
			this.setDirection(westDirection);
		} else if (TURN_RIGHT == direction) {
			this.currentDirection = degreesToTurn;
			this.setDirection(eastDirection);
		}
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	public float getCurrentDirection() {
		return currentDirection;
	}

	public void setCurrentDirection(float currentDirection) {
		this.currentDirection = currentDirection;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getVehicleIdentificationNumber() {
		return vehicleIdentificationNumber;
	}

	public void setVehicleIdentificationNumber(int vehicleIdentificationNumber) {
		this.vehicleIdentificationNumber = vehicleIdentificationNumber;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public static int getHighestIdentificationNumber() {
		return highestIdentificationNumber;
	}

	public static void setHighestIdentificationNumber(
			int highestIdentificationNumber) {
		Vehicle.highestIdentificationNumber = highestIdentificationNumber;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	@Override
	public String toString() {
		return "Vehicle [currentSpeed=" + currentSpeed + ", currentDirection="
				+ currentDirection + ", ownerName=" + ownerName
				+ ", vehicleIdentificationNumber="
				+ vehicleIdentificationNumber + ", vehicleId=" + vehicleId
				+ "]";
	}

}
