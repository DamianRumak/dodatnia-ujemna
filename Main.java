import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Wpisz liczbę:");
        Scanner pobierz = new Scanner(System.in);
        int liczba;
        liczba = pobierz.nextInt();
				if(liczba>0){
          System.out.println("wieksza od zera");
        }
        else if(liczba<0){
          System.out.println("mniejsza od zera");
        }
        }

    

}