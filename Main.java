import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Case cases = new Case();
        String name;

        outerLoop:
        while (true) {
            System.out.println("Выберите операцию:");
            System.out.println("""
                    0. Выход из программы
                    1. Добавить дело
                    2. Показать дела
                    3. Удалить дело по номеру
                    4. Удалить дело по названию
                    5. Удалить дело по ключевому слову""");
            System.out.print("Ваш выбор: ");
            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Введите число от 0 до 5.");
                System.out.println();
                continue;
            }
            System.out.println();
            switch (choice) {
                case 0:
                    break outerLoop;
                case 1:
                    System.out.print("Введите название задачи: ");
                    name = scanner.nextLine();
                    cases.setCase(name);
                    cases.getCase();
                    break;
                case 2:
                    cases.getCase();
                    break;
                case 3:
                    System.out.print("Введите номер для удаления: ");
                    int num;
                    try {
                        num = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Введите число");
                        continue;
                    }
                    cases.delete(num);
                    cases.getCase();
                    break;
                case 4:
                    System.out.print("Введите задачу для удаления: ");
                    name = scanner.nextLine();
                    cases.delete(name);
                    cases.getCase();
                    break;
                case 5:
                    System.out.print("Введите ключевое слово для удаления дела: ");
                    name = scanner.nextLine();
                    cases.deleteByKeyWord(name);
                    cases.getCase();
                    break;
            }
            System.out.println();
        }
        scanner.close();
    }
}
