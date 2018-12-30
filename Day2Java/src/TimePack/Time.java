package TimePack;

public class Time {
	private int hours;
	private int minutes;

	public void set(int hours, int minutes) {
		if (hours > 24 && minutes > 60) {
			this.hours = -1;
			this.minutes = -1;
		} else {
			this.hours = hours;
			this.minutes = minutes;
		}
	}

	public float getHour() {
		return this.hours;
	}

	@Override
	public String toString() {
		return "Time [hours=" + hours + ", minutes=" + minutes + "]";
	}

	public float getMinute() {
		return this.minutes;
	}

	public Time sum(Time Object1, Time Object2) {
		if (Object1.minutes < 0 || Object1.hours < 0 || Object2.minutes < 0
				|| Object2.hours < 0) {
			this.hours = -1;
			this.minutes = -1;
			return this;
		} else {
			int minuteSum = this.minutes + Object1.minutes + Object2.minutes;
			if (minuteSum > 59) {
				if (minuteSum == 60)
					this.hours = this.hours + 1;
				else {
					int minutesGreaterThanSixty = minuteSum - 60;
					this.hours = this.hours + 1;
					this.minutes = this.minutes + minutesGreaterThanSixty;
				}

			} else
				this.minutes = minuteSum;
			int hourSum = this.hours + Object1.hours + Object2.hours;
			if (hourSum > 23) {
				if (hourSum == 24)
					this.hours = 00;
				else {
					int hoursGreaterThanTwentyFour = hourSum - 24;
					this.hours = hoursGreaterThanTwentyFour;
				}
			} else
				this.hours = hourSum;
			return this;
		}
	}
}
