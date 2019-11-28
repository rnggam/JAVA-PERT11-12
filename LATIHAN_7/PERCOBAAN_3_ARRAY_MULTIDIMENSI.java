package LATIHAN_7;

/**
 *  NAMA    : Rangga Meinandi
 *  NIM     : A21900141
 *  KELAS   : TI-A
 */


public class PERCOBAAN_3_ARRAY_MULTIDIMENSI {
    public static void main(String[] args){

        //Elemen 512 x 128 dari integer array
        int [][] twoD = new int[512][128];

        //Karakter array 8 x 16 x 24
        char [][][] threeD = new char[8][16][24];

        //String array 4 baris x 2 kolom
        String [][] dogs = {{"Terry", "Brown"},
                {"Kristin", "White"},
                {"Toby", "Gray"},
                {"Fido", "Black"}

        };

        System.out.print(dogs [0][0]);
    }
}
