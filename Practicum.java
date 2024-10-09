import java.util.ArrayList;

class LostAndFoundOffice {
    // Список потерянных вещей
    private ArrayList<Object> things = new ArrayList<>();

    // Метод для добавления вещи в список
    public void put(Object element) {
        things.add(element);
    }

    // Метод для проверки наличия вещи в списке
    public boolean check(Object target) {
        if (target == null) {
            return false;
        }
        for (Object object : things) {
            if (object.equals(target)) {
                return true;
            }
        }
        return false;
    }
}

class Ball { }       // Класс "мяч"
class Accordion { }  // Класс "аккордеон"
class Hat { }        // Класс "шляпа"
class Umbrella { }   // Класс "зонт"

public class Practicum {
    // Бюро находок
    static LostAndFoundOffice lostAndFound = new LostAndFoundOffice();

    public static void main(String[] args) {
        Ball ball = new Ball();
        Accordion accordion = new Accordion();
        Umbrella umbrella = new Umbrella();
        Hat hat = new Hat();

        // Сдаём в бюро находок найденные вещи
        lostAndFound.put(ball);
        lostAndFound.put(accordion);
        lostAndFound.put(umbrella);

        checkObject(accordion, "Аккордеон");
        checkObject(ball, "Мяч");
        checkObject(null, "Пустая ссылка");
        checkObject(umbrella, "Зонт");
        checkObject(hat, "Шляпа");
    }

    private static void checkObject(Object object, String description) {
        if (lostAndFound.check(object)) {
            System.out.println('\'' + description + "' нашёлся!");
        } else {
            System.out.println('\'' + description + "' в бюро находок никто не приносил :(");
        }
    }
}