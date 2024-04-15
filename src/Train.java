import javax.xml.crypto.Data;

public class Train extends Time {
    public int trainNumber;
    public String directionTrain;
    public int departureHour;
    public int departureMin;

    public void calculateMinutesToDeparture(){
        int minutes = (departureHour - hour) * 60 + (departureMin - min);
    }
}