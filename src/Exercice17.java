import java.util.Scanner;

public class Exercice17 {

    public static void main(String[] args) {
        int s,min,h;

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        System.out.println("Hours: ");
        h= inputValue.nextInt();
        System.out.println("Minutes: ");
        min= inputValue.nextInt();
        System.out.println("Seconds: ");
        s= inputValue.nextInt();

        s++;
        if (s == 60) {
            min++;
            s = 0;
            if (min == 60) {
                h++;
                min = 0;
            }             
        } 
        System.out.println(h + " Hours " + min + " minutes " + s + " seconds ");
    }
}
