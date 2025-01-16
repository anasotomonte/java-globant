

public class Morebucles {
public static void main(String[] args) {

String[] arr = {"Hola", "chau", "quien", "sos"};
String texto= "";

for (String e:arr) {
texto += e+" ";

}
texto = texto.substring(0,texto.length()-1);
System.out.println(texto);
}
}


// float[] arr = new float[20];
// float suma = 0;
// float promedio;
//
// for (int i=0; i < arr.length; i++ ) {
// arr[i] = (float)Math.random()*(100-2+1)+2;
// }
//
// for (float a:arr) {
// suma +=a;
// }
// promedio = suma/arr.length;
//
// System.out.println("Los números del array: " +Arrays.toString(arr));
// System.out.println("La suma de los elementos es: "+suma);
// System.out.println("El promedio de los elementos del array es: "+promedio);


