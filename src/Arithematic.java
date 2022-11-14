import java.util.Scanner;
public class Arithematic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        SubClass subObj = new SubClass();

        System.out.println("Enter movie name");
        String xMovie = input.nextLine();

        subObj.setMovie(xMovie);
        subObj.fResult();


//        while(x < y){
//            x++;
//            System.out.println(x + ":Elvin, please do not dump your wife");
//        }

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the values for X and Y: ");

//        double y, x, z;
//
//        x = input.nextDouble();
//        y = input.nextDouble();
//        z = x + y;

//        System.out.println("Sum of 2 numbers is : " + z );

    }
}