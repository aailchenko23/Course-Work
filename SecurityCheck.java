public class SecurityCheck extends Passenger {
    SecurityCheck(String name, String nationality) {
        super(name, nationality); // Виклик конструктора батьківського класу Passenger
    }
    // Метод для проведення перевірки безпеки
    boolean performSecurityCheck(Baggage baggage, SecurityScanner scanner) {
        // Перевірка багажу на наявність небезпечних предметів
        return scanner.scan(baggage);
    }
}
