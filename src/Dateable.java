import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your age: ");
        int age = input.nextInt();
        int Newage = age/2 + 7;
        System.out.println(age + " year olds should date someone who is " + Newage + " years old.");

    }
}
