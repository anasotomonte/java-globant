
//Arrays
/* 
import java.util.Arrays;
public class ArraysEnJava {
public static void main(String[] args) {
int[] original = {1,2,3};
System.out.println(original .length); //Imprime 3
original = Arrays.copyOf(original , 10);
System.out.println(original .length); //Imprime 10
}
}
*/



//Bucles



/* 
public static void main(String[] args) {
    int numeroAleatorio = 0;
    while (numeroAleatorio < 8) {
    numeroAleatorio = (int) (Math.random()*(10-0+1)+0);
    }
    System.out.println("Seguro es 8 o mayor a 8: "+numeroAleatorio);
    }
    
*/
/*
public static void main(String[] args) {
    Scanner pepe = new Scanner(System.in);
    System.out.print("Por favor, ingrese un número mayor a 0: ");
    int num = pepe.nextInt();
    while (num <= 0) {
    System.out.print("Por favor, ingrese un número mayor a 0: ");
    num = pepe.nextInt();
    }
    System.out.println("Ingresaste: " + num);
    }

*/

/* 
public static void main(String[] args) {
    Scanner pepe = new Scanner(System.in);
    int num;
    do {
    System.out.print("Por favor, ingrese un número mayor a 0: ");
    num = pepe.nextInt();
    } while (num <= 0);
    System.out.println("Ingresaste: " + num);
    }
    
*/


/*
//Bucles; For, While , Do While
//Bucles For    
for (let i = 0; i < 10; i++) {
    console.log(i);
    }
    //Bucles While
    let i = 0;
    while (i < 10) {
        console.log(i);
        i++;
        }
        //Bucles Do While
        let i = 0;
        do {
            console.log(i);
            i++;
            } while (i < 10); //Bucle Do While
            //Bucles For Of
            let frutas = ['Manzana', 'Plátano', 'Naranja'];
            for (let fruta of frutas) {
                console.log(fruta);
                }
                //Bucles For In
                let persona = {
                    nombre: 'Juan',
                    edad: 30,
                    ciudad: 'Madrid'
                    };
                    for (let propiedad in persona) {
                        console.log(propiedad + ': ' + persona[propiedad]);
                        } //Bucles For In
                        //Bucles For Of
                        let numeros = [1, 2, 3, 4, 5];
                        for (let numero of numeros) {

                            */

/*public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    for (int num : arr) {
    System.out.println("El valor es: " + num);
    }
    }
*/

/*public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
    System.out.println("El valor de i es: " + i);
    }
    }
*/
/*public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
    System.out.println("El valor de i es: " + i);
    }
    }
*/

/*
public static void main(String[] args) {
    String[] paises = {"Uruguay","Argentina","Brasil","Venezuela"};
    for (int i = 0; i < paises.length ; i++) {
    System.out.println(paises[i]);
    }
    }*/