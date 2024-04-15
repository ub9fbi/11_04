import javax.xml.crypto.Data;

public class Train extends Time {
    public int trainNumber;
    public String directionTrain;
    public int departureHour;
    public int departureMin;

    public int calculateMinutesUntilDeparture(int inputHours, int inputMinutes, int inputSeconds) {
        TimeData inputTime = new TimeData(inputHours, inputMinutes, inputSeconds);

        int currentTimeInSeconds = this.calculateTotalSeconds();
        int inputTimeInSeconds = inputTime.calculateTotalSeconds();

        int differenceInSeconds = Math.max(inputTimeInSeconds - currentTimeInSeconds, 0);

        return differenceInSeconds / 60;
    }
}