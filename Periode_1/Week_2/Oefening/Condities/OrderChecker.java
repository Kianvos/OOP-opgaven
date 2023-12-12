import java.util.Scanner;

public class OrderChecker {
    public static void main(String[] args) {
        int bout = 5;
        int moer = 3;
        int sluitring = 1;

        int countBout = countAsker("Bout");
        int countMoer = countAsker("Moer");
        int countSluitring = countAsker("Sluitring");

        int checked =  checkCount(countBout, countMoer, countSluitring);
        int calculation = bout*countBout+moer*countMoer+sluitring*countSluitring;
        switch(checked) {
            case 0:
                System.out.println("Bestelling is OK");
                break;
            case 1:
                System.out.println("Controleer de volgorde: te weinig moeren");
                break;
            case 2:
                System.out.println("Controleer de volgorde: te weinig sluitringen");
                break;
        }
        System.out.println("Totale kosten (centen): " + calculation);
    }
    private static int countAsker(String product){
        System.out.printf("Aantal %s: ", product);
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        return count;
    }

    private static int checkCount(int b, int m, int s){
        //Code 0 alles goed
        //Code 1 als moeren en bouten niet gelijk zijn
        //Code 2 als er niet 2 keer zoveel sluitringen zijn als bouten
        if (b != m){
            return 1;
        }else if (s*2 < b){
            return 2;
        }else{
            return 0;
        }
    }
}
