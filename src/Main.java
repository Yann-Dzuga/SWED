import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {



    static   void Ulam(int number){

        while (number != 1) {
            if (number % 2 == 0) {
                number = number / 2;
                System.out.println("number is " + number);
            } else {
                number = number * 3 + 1;
                System.out.println("number is " + number);
            }

        }



    }
    public static void main(String[] args) {

        int number ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("write a number");
        number = scanner.nextInt();
        Ulam(number);





}






}