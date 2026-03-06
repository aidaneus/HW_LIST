import java.util.ArrayList;
import java.util.List;

public class Case {
    protected List<String> cases = new ArrayList<>();

    public void setCase(String caseName) {
        cases.add(caseName);
        System.out.println("Добавлено!");
    }

    public void getCase() {
        System.out.println("Ваш список дел:");
        for (int i = 0; i < cases.size(); i++) {
            System.out.println((i + 1) + ". " + cases.get(i));
        }
    }

    public void deleteByKeyWord(String keyword) {
        List<String> toRemove = new ArrayList<>();

        if (keyword == null || keyword.trim().isEmpty()) {
            System.out.println("Ключевое слово не может быть пустым!");
            return;
        }
        for (String task : cases) {
            if (task.toLowerCase().contains(keyword.toLowerCase())) {
                toRemove.add(task);
            }
        }
        if (toRemove.isEmpty()) {
            System.out.println("Задач с ключевым словом \"" + keyword + "\" не найдено!");
        } else {
            cases.removeAll(toRemove);
            System.out.println("Удалено задач: " + toRemove.size());
        }
    }

    public void delete(String caseName) {
        if (caseName == null || !cases.contains(caseName)) {
            System.out.println("Нет такого дела");
            return;
        }
        cases.remove(caseName);
        System.out.println("Удалено!");
    }

    public void delete(int num) {
        if (num < 1 || num > cases.size()) {
            System.out.println("Нет такого дела");
            return;
        }
        cases.remove(num - 1);
        System.out.println("Удалено!");
    }
}
