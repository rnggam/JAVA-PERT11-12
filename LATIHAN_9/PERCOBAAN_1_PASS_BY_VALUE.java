package LATIHAN_9;

/**
 *  NAMA    : Rangga Meinandi
 *  NIM     : A21900141
 *  KELAS   : TI-A
 */


public class PERCOBAAN_1_PASS_BY_VALUE {
    public static void main(String[] args){
        int i = 10;
        System.out.println(i);
        test(i);
    }
    public static void test(int j){
        j = 33;
    }
}
