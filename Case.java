import java.util.ArrayList;

public class Case {
    protected ArrayList<String> cases = new ArrayList<>();

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
        ArrayList<String> toRemove = new ArrayList<>();
        for (String task : cases) {
            if (task.toLowerCase().contains(keyword.toLowerCase())) {
                toRemove.add(task);
            }
        }
        cases.removeAll(toRemove);
        System.out.println("Удалено задач: " + toRemove.size());
    }

    public void delete(String caseName) {
        cases.remove(caseName);
        System.out.println("Удалено!");
    }

    public void delete(int num) {
        cases.remove(num - 1);
        System.out.println("Удалено!");
    }
}
