package LATIHAN_4;

/**
 *  NAMA    : Rangga Meinandi
 *  NIM     : A21900141
 *  KELAS   : TI-A
 */


public class PERCOBAAN_8_PENGGUNAAN_OPERATOR_KONDISI_1 {
    public static void main(String[] args){
        String status = " ";
        int grade = 80;

        //mendapatkan status belajar
        status = (grade >= 60)?"Passed":"Fail";

        //print status
        System.out.println(status);
    }
}
