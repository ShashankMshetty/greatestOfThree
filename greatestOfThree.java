import java.util.Scanner;

public class greatestOfThree {
    public static void main(String[] args) {
        int x, y, z;

        Scanner input = new Scanner(System.in);

        System.out.println("enter the value of x: ");
        x = input.nextInt();
        System.out.println("enter the value of y: ");
        y = input.nextInt();
        System.out.println("enter the value of z: ");
        z = input.nextInt();

        if ((x>y) &&  (x > z)) {
            System.out.println("x is the greatest value");
            }

        else if((y>x) && (y>z)){
                System.out.println("y is the greatest value");

        }else{
                System.out.println("z is the greatest value");
            }
        }

    }


