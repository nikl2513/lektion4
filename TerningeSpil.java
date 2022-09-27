import java.util.Scanner;

public class TerningeSpil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int point1 = 0;
        int point2 = 0;
        String spiller1, spiller2;
        System.out.println("hvad er den første spillers navn?");
        spiller1 = scan.nextLine();
        System.out.println("hvad er den anden spillers navn?");
        spiller2 = scan.nextLine();
        while (point1 < 40 && point2 < 40)
        {
            System.out.println(spiller1 + " kaster terningerne");
            Tur kastSpiller1 = new Tur();
            int sum1 = kastSpiller1.tur();
            System.out.println("du har slået " + kastSpiller1.getTerning1Value() + " og " + kastSpiller1.getTerning2Value());
            point1 = point1 + sum1;
            System.out.println("du har nu " + point1 + " point");
            if (point1 < 40) {
                System.out.println(spiller2 + " kaster terningerne");
                Tur kastSpiller2 = new Tur();
                int sum2 = kastSpiller2.tur();
                System.out.println("du har slået " + kastSpiller2.getTerning1Value() + " og " + kastSpiller2.getTerning2Value());
                point2 = point2 + sum2;
                System.out.println("du har nu " + point2 + " point");
            }

        }


    }
}
