package LATIHAN_5;

/**
 *  NAMA    : Rangga Meinandi
 *  NIM     : A21900141
 *  KELAS   : TI-A
 */


    import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;
    import sun.awt.windows.WBufferStrategy;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

public class PERCOBAAN_1_MENGGUNAKAN_CLASS_BUFFEREDREADER {
    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        String name = "";

        System.out.println("Please Enter Your Name: ");

        try{
            name = dataIn.readLine();
        }catch (IOException e) {
            System.out.println("Error!");
        }

        System.out.println("Hello " + name + "!");
    }
}
