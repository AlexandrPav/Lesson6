import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers = getInputNoRecursion(sc, 1, 5);
        System.out.println(numbers);
        int numbers2 = getInputWithRecursion(sc, 1, 5);
        System.out.println(numbers2);
    }

    public static int getInputNoRecursion(Scanner scanner, int min, int max) {
        int result;
        while (true) {
            System.out.println("введите число от" + min + "до" + max);
            try {
                String stringNumbers = scanner.next();
                result = Integer.valueOf(stringNumbers);
            } catch (NumberFormatException e) {
                System.out.println("вы ввели не число");
                continue;
            }
            if (result < min || result > max) {
                System.out.println("число не от" + min + "до" + max);
                continue;
            }
            break;
        }
        return result;
    }

    public static int getInputWithRecursion(Scanner scanner, int min, int max) {
        int result;
        System.out.println("введите число от" + min + "до" + max);
        try {
            String stringNumbers = scanner.next();
            result = Integer.valueOf(stringNumbers);
        } catch (NumberFormatException e) {
            System.out.println("вы ввели не число");
            return getInputWithRecursion(scanner, min, max);

        }
        if (result < min || result > max) {
            System.out.println("число не от" + min + "до" + max);
            return getInputWithRecursion(scanner, min, max);
        }
        return result;
    }
}
