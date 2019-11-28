package LATIHAN_12;

/**
 *  NAMA    : Rangga Meinandi
 *  NIM     : A21900141
 *  KELAS   : TI-A
 */

public class ExeptionExample {
    public static void main(String[] args){
        try{
            System.out.println(args[1]);
        }catch (ArrayIndexOutOfBoundsException exp){
            System.out.println("Exeption caught!");
        }
    }
}
