import java.util.Scanner;

public class TEST {
    public static void main (String[] args){
        String[] cars = {"mamad","asghar","jafar"};
        for (String car : cars) {
            System.out.println(car);
        }




        Scanner scanner = new Scanner(System.in);
        int numb;
        do {
            System.out.println("enter a numb");
            numb = scanner.nextInt();
        }
        while (numb % 2 != 0);
        System.out.println(numb);

    }
}
