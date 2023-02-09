import java.util.Scanner;
public class Manavkasa {
    public static void main (String[] args) {
        double armut, elma, domates, muz, patlıcan,ucret;
        Scanner input = new Scanner(System.in);
        System.out.print("Armuttan kaç kilo alındı : ");
        armut= input.nextDouble();
        System.out.print("Elmadan kaç kilo alındı :");
        elma = input.nextDouble();
        System.out.print("Domatesten kaç kilo alındı :");
        domates = input.nextDouble();
        System.out.print("Muzdan kaç kilo alındı :");
        muz = input.nextDouble();
        System.out.print("Patlıcandan kaç kilo alındı :");
        patlıcan = input.nextDouble();
        ucret = (armut*2.14) + (elma*3.67)+(domates*1.11)+(muz*0.95)+(patlıcan*5.00) ;
        System.out.println("Armut :"+armut+"kg"+"\nElma :"+elma+"kg"+"\nDomates :"+domates+"kg"+"\nMuz :"+muz+"kg"+"\nPatlıcan :"+patlıcan+"kg"+"\nToplam Tutar :"+ucret+"TL");
    }
}
