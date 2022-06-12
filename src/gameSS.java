import java.util.Scanner;

public class gameSS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Угадай число от 1 до 100: ");
        int range = 100;
        int number = (int) (Math.random() * 100);

        while (true) {
            for (int count = 0; count < number; count++) {

                Scanner sc = new Scanner(System.in);
                int gessnumber = sc.nextInt();

                if (number == gessnumber) {
                    System.out.print("Поздравляю,брат : ");
                    System.out.println(" Количество попыток " + count++);
                    break;
                } else if (number < gessnumber) {
                    System.out.print("Не ожидал от тебя такого. Загаданное число меньше, брат : ");
                } else
                    System.out.print("Я сам в шоке, но, загаданное число больше, брат : ");


            }


        }
    }
}

