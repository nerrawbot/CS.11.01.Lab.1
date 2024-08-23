import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your age: ");
        int age = input.nextInt();
        int Page = 100 - age;
        System.out.println(age + " year olds should at least " + Page + " pages before giving up on a book.");
    }
}
