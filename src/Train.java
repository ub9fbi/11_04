import javax.xml.crypto.Data;

public class Train extends Time {
    public int trainNumber;
    public String directionTrain;

    public void calculateMinutesToDeparture(){

    }
}

/*public class Train {
    private int trainNumber;
    private String direction;
    private int departureHour;
    private int departureMinute;

    public Train(int trainNumber, String direction, int departureHour, int departureMinute) {
        this.trainNumber = trainNumber;
        this.direction = direction;
        this.departureHour = departureHour;
        this.departureMinute = departureMinute;
    }

    public int minutesUntilDeparture(int trainNumber, int currentHour, int currentMinute) {
        if (this.trainNumber == trainNumber) {
            int minutes = (this.departureHour - currentHour) * 60 + (this.departureMinute - currentMinute);
            if (minutes < 0) {
                return 0;
            }
            return minutes;
        } else {
            return -1; // Поезд с указанным номером не найден
        }
    }

    public static void main(String[] args) {
        Train train1 = new Train(123, "Москва", 8, 0);

        int trainNumberToCheck = 123;
        int currentHour = 7;
        int currentMinute = 45;

        int minutesUntilDeparture = train1.minutesUntilDeparture(trainNumberToCheck, currentHour, currentMinute);

        if (minutesUntilDeparture >= 0) {
            System.out.println("До отправления поезда " + trainNumberToCheck + " осталось " + minutesUntilDeparture + " минут");
        } else {
            System.out.println("Поезд с указанным номером не найден");
        }
    }
}*/
