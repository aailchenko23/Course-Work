import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Створення пасажирів
        Passenger passenger1 = new Passenger("Kate", "UA");
        Passenger passenger2 = new Passenger("John", "USA");
        Passenger passenger3 = new Passenger("Jack", "PL");
        Passenger passenger4 = new Passenger("Mary", "IT");
        Passenger passenger5 = new Passenger("Ivan", "UA");
        Passenger passenger6 = new Passenger("Stacy", "CA");
        Passenger passenger7 = new Passenger("Jack", "JP");
        Passenger passenger8 = new Passenger("Pierre", "FR");
        Passenger passenger9 = new Passenger("Hans", "DE");
        Passenger passenger10 = new Passenger("Jan", "PL");


        // Вивід інформації про пасажирів на консоль
        System.out.println("\t Пасажири:");
        System.out.println("1. " + passenger1.getName() + " - " + passenger1.getNationality());
        System.out.println("2. " + passenger2.getName() + " - " + passenger2.getNationality());
        System.out.println("3. " + passenger3.getName() + " - " + passenger3.getNationality());
        System.out.println("4. " + passenger4.getName() + " - " + passenger4.getNationality());
        System.out.println("5. " + passenger5.getName() + " - " + passenger5.getNationality());
        System.out.println("6. " + passenger6.getName() + " - " + passenger6.getNationality());
        System.out.println("7. " + passenger7.getName() + " - " + passenger7.getNationality());
        System.out.println("8. " + passenger8.getName() + " - " + passenger8.getNationality());
        System.out.println("9. " + passenger9.getName() + " - " + passenger9.getNationality());
        System.out.println("10. " + passenger10.getName() + " - " + passenger10.getNationality());

        System.out.println("\t Вміст багажу:");

// Генерування речей багажу
        String[] baggage1Items = Baggage.random();
        String[] baggage2Items = Baggage.random();
        String[] baggage3Items = Baggage.random();
        String[] baggage4Items = Baggage.random();
        String[] baggage5Items = Baggage.random();
        String[] baggage6Items = Baggage.random();
        String[] baggage7Items = Baggage.random();
        String[] baggage8Items = Baggage.random();
        String[] baggage9Items = Baggage.random();
        String[] baggage10Items = Baggage.random();

// Вивід,речей
        System.out.println(" багаж пасажира 1 : " + String.join(", ", baggage1Items));
        System.out.println(" багаж пасажира 2 : " + String.join(", ", baggage2Items));
        System.out.println(" багаж пасажира 3 : " + String.join(", ", baggage3Items));
        System.out.println(" багаж пасажира 4 : " + String.join(", ", baggage4Items));
        System.out.println(" багаж пасажира 5 : " + String.join(", ", baggage5Items));
        System.out.println(" багаж пасажира 6 : " + String.join(", ", baggage6Items));
        System.out.println(" багаж пасажира 7 : " + String.join(", ", baggage7Items));
        System.out.println(" багаж пасажира 8 : " + String.join(", ", baggage8Items));
        System.out.println(" багаж пасажира 9 : " + String.join(", ", baggage9Items));
        System.out.println(" багаж пасажира 10 : " + String.join(", ", baggage10Items));

// Створення об'єктів багажу з введеними предметами
        Baggage baggage1 = new Baggage(String.join(", ", baggage1Items));
        Baggage baggage2 = new Baggage(String.join(", ", baggage2Items));
        Baggage baggage3 = new Baggage(String.join(", ", baggage3Items));
        Baggage baggage4 = new Baggage(String.join(", ", baggage4Items));
        Baggage baggage5 = new Baggage(String.join(", ", baggage5Items));
        Baggage baggage6 = new Baggage(String.join(", ", baggage6Items));
        Baggage baggage7 = new Baggage(String.join(", ", baggage7Items));
        Baggage baggage8 = new Baggage(String.join(", ", baggage8Items));
        Baggage baggage9 = new Baggage(String.join(", ", baggage9Items));
        Baggage baggage10 = new Baggage(String.join(", ", baggage10Items));

        // Створення об'єктів для проведення перевірки безпеки
        SecurityCheck securityCheck1 = new SecurityCheck(passenger1.getName(), passenger1.getNationality());
        SecurityCheck securityCheck2 = new SecurityCheck(passenger2.getName(), passenger2.getNationality());
        SecurityCheck securityCheck3 = new SecurityCheck(passenger3.getName(), passenger3.getNationality());
        SecurityCheck securityCheck4 = new SecurityCheck(passenger4.getName(), passenger4.getNationality());
        SecurityCheck securityCheck5 = new SecurityCheck(passenger5.getName(), passenger5.getNationality());
        SecurityCheck securityCheck6 = new SecurityCheck(passenger6.getName(), passenger6.getNationality());
        SecurityCheck securityCheck7 = new SecurityCheck(passenger7.getName(), passenger7.getNationality());
        SecurityCheck securityCheck8 = new SecurityCheck(passenger8.getName(), passenger8.getNationality());
        SecurityCheck securityCheck9 = new SecurityCheck(passenger9.getName(), passenger9.getNationality());
        SecurityCheck securityCheck10 = new SecurityCheck(passenger10.getName(), passenger10.getNationality());

        // Створення об'єктів сканера
        SecurityScanner securityScanner = new SecurityScanner();

        // Перевірка багажу та вивід результату на консоль
        System.out.println("\t Результат перевірки:");
        System.out.println("1. " + (securityCheck1.performSecurityCheck(baggage1, securityScanner) ? "Виявлено небезпечний предмет!" : "Успішно!"));
        System.out.println("2. " + (securityCheck2.performSecurityCheck(baggage2, securityScanner) ? "Виявлено небезпечний предмет!" : "Успішно!"));
        System.out.println("3. " + (securityCheck3.performSecurityCheck(baggage3, securityScanner) ? "Виявлено небезпечний предмет!" : "Успішно!"));
        System.out.println("4. " + (securityCheck4.performSecurityCheck(baggage4, securityScanner) ? "Виявлено небезпечний предмет!" : "Успішно!"));
        System.out.println("5. " + (securityCheck5.performSecurityCheck(baggage5, securityScanner) ? "Виявлено небезпечний предмет!" : "Успішно!"));
        System.out.println("6. " + (securityCheck6.performSecurityCheck(baggage6, securityScanner) ? "Виявлено небезпечний предмет!" : "Успішно!"));
        System.out.println("7. " + (securityCheck7.performSecurityCheck(baggage7, securityScanner) ? "Виявлено небезпечний предмет!" : "Успішно!"));
        System.out.println("8. " + (securityCheck8.performSecurityCheck(baggage8, securityScanner) ? "Виявлено небезпечний предмет!" : "Успішно!"));
        System.out.println("9. " + (securityCheck9.performSecurityCheck(baggage9, securityScanner) ? "Виявлено небезпечний предмет!" : "Успішно!"));
        System.out.println("10. " + (securityCheck10.performSecurityCheck(baggage10, securityScanner) ? "Виявлено небезпечний предмет!" : "Успішно!"));
        System.out.println("\t Звітність перевірки");

        SecuritySystem securitySystem = new SecuritySystem();
        securitySystem.scanBaggage(baggage1, passenger1.getName());
        securitySystem.scanBaggage(baggage2, passenger2.getName());
        securitySystem.scanBaggage(baggage3, passenger3.getName());
        securitySystem.scanBaggage(baggage4, passenger4.getName());
        securitySystem.scanBaggage(baggage5, passenger5.getName());
        securitySystem.scanBaggage(baggage6, passenger6.getName());
        securitySystem.scanBaggage(baggage7, passenger7.getName());
        securitySystem.scanBaggage(baggage8, passenger8.getName());
        securitySystem.scanBaggage(baggage9, passenger9.getName());
        securitySystem.scanBaggage(baggage10, passenger10.getName());





        System.out.println("\t Технічна перевірка борту літака");
        Flight flight1 = new Flight("Airbus A320", "New York");
        flight1.flightCheckIn();

    }
}








