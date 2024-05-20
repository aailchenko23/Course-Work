public class SecurityScanner {
    boolean scan(Baggage baggage) { // Метод для сканування багажу на наявність небезпечних предметів
        String[] dangerousItems = {"вибухівка"};

        String item = baggage.getItem().toLowerCase(); // Отримуємо предмет багажу та перетворюємо його на нижній регістр для порівняння

        for (String dangerousItem : dangerousItems) {
            if (item.contains(dangerousItem)) { // Якщо знайдено небезпечний предмет, повертаємо true

                return true; // Якщо знайдено небезпечний предмет, повертаємо true
            }
        }

        return false; // Якщо не знайдено, повертаємо false
    }
}
