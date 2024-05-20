import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Baggage {
    String item;

    Baggage(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }

    public static String[] random() { // Метод для генерації випадкового багажу
        List<String> itemsList = new ArrayList<>(List.of("Електроніка","вибухівка", "Книги", "Їжа", "Вода", "Засоби гігієни", "Медичні препарати", "Фотоапарат"));
        Random random = new Random(); // Випадковий генератор
        int listSize = 5;  // Розмір масиву предметів багажу
        int b = 10;

// Прапорець, що вказує, чи було додано вибухівка
        boolean a = false;

// Масив для зберігання предметів багажу
        String[] items = new String[listSize];

// Генерація предметів багажу
        for (int i = 0; i < listSize; i++) {
            // Перевірка, чи вже було додано вибухівку і відповідна ймовірність
            if (!a && random.nextInt(b) == 0) {
                // Якщо випадкове число в межах ймовірності, додаємо вибухівку
                items[i] = "вибухівка";
                a = true; // Встановлюємо прапорець, що додано
                itemsList.remove("вибухівка"); // Видаляємо вибухівку зі списку
            } else {
                // Інакше додаємо випадковий предмет зі списку
                int index = random.nextInt(itemsList.size());
                items[i] = itemsList.get(index);
                itemsList.remove(index); // Видаляємо доданий предмет зі списку, щоб уникнути повторень
            }
        }


        return items;
    }
}



















