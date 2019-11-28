package LATIHAN_9;

/**
 *  NAMA    : Rangga Meinandi
 *  NIM     : A21900141
 *  KELAS   : TI-A
 */


public class PERCOBAAN_3_PERBANDINGAN_OBJECT {
    public static void main(String[] arguments){
        String str1, str2;
        str1 = "Free the bound periodicals.";
        str2 = str1;

        System.out.println("String1 : " + str1);
        System.out.println("String2 : " + str2);
        System.out.println("Sama object? " + (str1 == str2));

        str2 = new String(str1);
        System.out.println("String1: " + str1);
        System.out.println("String2: " + str1);
        System.out.println("Same object? " + (str1 == str2));
        System.out.println("Same value? " + str1.equals(str2));

    }
}
