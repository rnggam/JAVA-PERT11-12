package LATIHAN_9;

/**
 *  NAMA    : Rangga Meinandi
 *  NIM     : A21900141
 *  KELAS   : TI-A
 */


public class PERCOBAAN_2_PASS_BY_REFERENCE {
    public static void main(String[] args){
        int[] ages = {10, 11, 12};
        for (int i = 0; i < ages.length; i++){
            System.out.println(ages[i]);
        }
        test(ages);
        for (int i = 0; i < ages.length; i++){
            System.out.println(ages[i]);
        }
    }

    public static void test (int [] arr){
        for (int i = 0; i < arr.length; i++){
            arr[i] = i + 50;
        }
    }
}
