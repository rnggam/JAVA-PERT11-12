package LATIHAN_6;

/**
 *  NAMA    : Rangga Meinandi
 *  NIM     : A21900141
 *  KELAS   : TI-A
 */


public class PERCOBAAN_2_STATEMENT_SWITCH {

    public static void main(String[] args){
        int grade = 92;

        switch (grade){
            case 100:
                System.out.println("Exelent!");
                break;

            case 90:
                System.out.println("Good Job!");
                break;

            case 80:
                System.out.println("Study Harder!");
                break;

            default:
                System.out.println("Sorry, you failed");
        }
    }
}
