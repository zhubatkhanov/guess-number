import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        guessNumGame();
    }

    public static void guessNumGame(){
        Scanner scanner = new Scanner(System.in);
        int number = 1 + (int)(100 * Math.random());
        System.out.println("Угадайте число от 1 до 100: ");
        System.out.println("У вас есть 5 попыток: ");
        for (int i = 0; i < 5; i++){
            int num = scanner.nextInt();
            if (num == number){
                System.out.println("Молодец, вы правильно угадали число!");
                break;
            }
            if (num < number){
                System.out.println("Это число меньше");
            }

            if (num > number){
                System.out.println("Это число больше");
            }
        }
        System.out.println("Number: " + number);
    }
}