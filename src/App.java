import java.util.Scanner;

public class App {

    public static void main(String []args){

        System.out.println("Prime numbers between 1 and 100");

        int counter = 0;
        for (int i=2; i<=100; i++){



            for(int j=2; j < i; j++) {
                if (i % j == 0) {
                    counter++;
                    break;
                }
            }
                

                if (counter ==0){

                    System.out.print(i + " ");
                }
                counter =0;

        }

    }
}