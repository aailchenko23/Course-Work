import java.time.LocalDateTime;
import java.util.List;

 public class Flight {
     // Змінні
     String airplaneNumber;
     String flight;
     //Конструктор класу
     Flight(String airplaneNumber, String flightNumber) {
         this.airplaneNumber = airplaneNumber;
         this.flight = flightNumber;
     }

     void flightCheckIn() {
         FlightCheckIn checkIn = new FlightCheckIn(); // Створюємо новий об'єкт для перевірки справності літака
         checkIn.checkAircraft(); // Виклик методу для перевірки літака
         System.out.println("Технічна перевірка літака " + airplaneNumber + " рейс " +  flight + ".Пройдена!");
     }


}





