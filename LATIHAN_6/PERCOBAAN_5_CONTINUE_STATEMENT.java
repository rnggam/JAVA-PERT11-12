package LATIHAN_6;

/**
 *  NAMA    : Rangga Meinandi
 *  NIM     : A21900141
 *  KELAS   : TI-A
 */


public class PERCOBAAN_5_CONTINUE_STATEMENT {
    public static void main(String[] args){
        String names[] = {"Beah", "Bianca", "Lance", "Beah"};
        int count = 0;

        for (int i = 0; i < names.length; i++){
            if (!names[i].equals("Beah")){
                continue; //skip next statement
            }

            count++;

        }

        System.out.println("There are " + count + " Beah's is the list");
    }
}
