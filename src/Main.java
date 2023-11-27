import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    String risultatoConcatena = concatena("ciao", 1222);
        System.out.println(risultatoConcatena);
         int moltiplicaNumeri = moltiplica(5,6);
        System.out.println(moltiplicaNumeri);
        String[] arrayCiqueElementi = { "str1", "str2", "str3", "str4", "str5"};
        String stringaIsolata = "Ciao Stringa Isolata!";
        String[] nuovoArray = arrayDiStringhe(arrayCiqueElementi, stringaIsolata);
        System.out.println(Arrays.toString(nuovoArray));
    }
    public static int moltiplica(int num1, int num2) {return num1 * num2;}
    public static String concatena(String stringa1, int num3) {
        String stringhifizzaNum3 = String.valueOf(num3);
        String risultato = stringa1 + stringhifizzaNum3;
        return risultato;
        }
    public static String[] arrayDiStringhe(String[] arrayCinqueElementi, String stringaIsolata){
        String[] nuovoArray = new String[6];
                 nuovoArray[0]= arrayCinqueElementi[0];
                 nuovoArray[1]= arrayCinqueElementi[1];
                 nuovoArray[2]= stringaIsolata;
                 nuovoArray[3]= arrayCinqueElementi[2];
                 nuovoArray[4]= arrayCinqueElementi[3];
                 nuovoArray[5]= arrayCinqueElementi[4];

                 return nuovoArray;
    }
}