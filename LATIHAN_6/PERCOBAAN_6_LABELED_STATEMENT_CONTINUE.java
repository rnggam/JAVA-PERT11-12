package LATIHAN_6;

/**
 *  NAMA    : Rangga Meinandi
 *  NIM     : A21900141
 *  KELAS   : TI-A
 */


public class PERCOBAAN_6_LABELED_STATEMENT_CONTINUE {
    public static void main(String[] args){
        outerLoop :
            for (int i = 0; i<5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.println("Inside for(j) loop"); //message1
                    if (j == 2) continue outerLoop;
                }
                System.out.println("inside for(i) loop"); //message2
            }
    }
}
