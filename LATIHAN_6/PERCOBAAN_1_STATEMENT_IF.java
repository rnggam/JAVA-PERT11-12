package LATIHAN_6;

/**
 *  NAMA    : Rangga Meinandi
 *  NIM     : A21900141
 *  KELAS   : TI-A
 */


public class PERCOBAAN_1_STATEMENT_IF {

    public static void main(String[] args){
        double grade = 92.0;

        if(grade >= 90){
            System.out.println("Exelent!");
        }

        else if ((grade < 90) && (grade >= 80)){
            System.out.println("Good Job!");
        }

        else if ((grade < 80) && (grade >= 60)){
            System.out.println("Study Harder!");
        }

        else{
            System.out.println("Sorry, you failed");
        }
    }
}
