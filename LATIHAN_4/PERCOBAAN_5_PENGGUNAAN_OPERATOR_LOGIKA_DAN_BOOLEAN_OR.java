package LATIHAN_4;

/**
 *  NAMA    : Rangga Meinandi
 *  NIM     : A21900141
 *  KELAS   : TI-A
 */

public class PERCOBAAN_5_PENGGUNAAN_OPERATOR_LOGIKA_DAN_BOOLEAN_OR {
    public static void main(String[] args){
        int i = 0;
        int j = 10;
        boolean test = false;

        //demonstrasi &&
        test = (i < 10) || (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);

        //demonstrasi &
        test = (i < 10) | (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
    }
}
