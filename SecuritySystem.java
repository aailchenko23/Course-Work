public class SecuritySystem {
    private SecurityScanner securityScanner;
    // Конструктор класу
    public SecuritySystem() {
        this.securityScanner = new SecurityScanner();
    }
    // Метод для сканування багажу пасажира
    public void scanBaggage(Baggage baggage, String passengerName) {
        boolean dangerousItemFound = securityScanner.scan(baggage);
// Якщо виявлено небезпечний предмет
        if (dangerousItemFound) {
            System.out.println("Виявлено небезпечний предмет (вибухівка) в багажі пасажира " + passengerName);
            callEmergencyServices();  // Виводимо повідомлення про виявлення небезпечного предмету та викликаємо аварійні служби
        } else {
            System.out.println("Багаж пасажира " + passengerName + " безпечний.");
        }
    }
    // Приватний метод для виклику cпец. служб
    private void callEmergencyServices() {
        System.out.println("Виклик ДСНС для знищення вибухівки...");
    }
}

