import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("6 Star Champ Calculator!");
        ChampCal();
        //ChampsStillNeeded();
    }
    public static void ChampsStillNeeded(){
        int totalChamps = 720;
        do{
            Scanner input = new Scanner(System.in);

            System.out.println("How many 5 stars do you have to feed?");
            int _5star = input.nextInt();
            totalChamps = totalChamps - (_5star * 120);
            System.out.println(_5star * 120);
            if (totalChamps <= 0){
                break;
            }

            System.out.println("How many 4 stars do you have to feed?");
            int _4star = input.nextInt();
            totalChamps = totalChamps - (_4star * 60);
            System.out.println(_4star * 60);
            if (totalChamps <= 0){
                break;
            }

            System.out.println("How many 3 stars do you have to feed?");
            int _3star = input.nextInt();
            totalChamps = totalChamps - (_3star * 20);
            System.out.println(_3star * 20);
            if (totalChamps <= 0){
                break;
            }

            System.out.println("How many 2 stars do you have to feed?");
            int _2star = input.nextInt();
            totalChamps = totalChamps - (_2star * 5);
            System.out.println(_2star * 5);
            if (totalChamps <= 0){
                break;
            }

            System.out.println("How many 1 stars do you have to feed?");
            int _1star = input.nextInt();
            totalChamps = totalChamps - (_1star * 5);
            System.out.println(_1star * 5);
            if (totalChamps <= 0){
                break;
            }

            System.out.println("You still need " + totalChamps);
        }while (totalChamps > 0);
        System.out.println("You can get your 6-star");
    }

    public static void ChampCal() {
        int _1to2 = 2;
        int _2to3 = _1to2 * 3;
        int _3to4 = _2to3 * 4;
        int _4to5 = _3to4 * 5;
        int _5to6 = _4to5 * 6;

        System.out.println(_2to3);
        System.out.println(_3to4);
        System.out.println(_4to5);
        System.out.println(_5to6);

        //6 ster he - 5 5stere - 4 4ster 4 4ster 4 4ster 4 4ster 4 4ster

    }
}