import java.util.Scanner;
class Fatorial  {
    public static void main (String []args) {
        int calculo = 1;

        for (int n=10; n>0;n--) {
            calculo *= n;

        }
        System.out.println ("O valor eh " + calculo);
    }
}