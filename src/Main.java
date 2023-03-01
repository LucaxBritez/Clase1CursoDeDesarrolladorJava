

public class Main {
    public static void main(String[] args) {
        //PUNTO 1:

        /*Punto 1-A
            Utilizando la sentencia while, imprima todos los números entre 2 variables “a” y “b”.*/

        System.out.println("-----Punto 1-A-----");
        int number1 = 1;
        int number2 = 10;
        int  i = number1;

        while(i <= number2){
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        /*Punto 1-B
            A lo anterior, solo muestre los números pares.*/
        System.out.println("-----Punto 1-B-----");
        int number3 = 1;
        int number4 = 10;
        int  e = number3;

        while(e <= number4){
            if(e % 2 == 0){
            System.out.print(e + " ");
            }
            e++;
        }

        System.out.println();

        /*Punto 1-C
            A lo anterior, con una variable extra, elija si se deben mostrar los números
            pares o impares*/
        System.out.println("-----Punto 1-C-----");
        int number5 = 1;
        int number6 = 10;
        int  o = number5;
        boolean parOImpar = false;

        while(o <= number6){
            if(parOImpar){
                if (o % 2 == 0){
                System.out.print(o + " ");
                }
            }else{
                if (o % 2 != 0){
                    System.out.print(o + " ");
                }
            }
            o++;
        }

        System.out.println();
        
        /*Punto 1-D
            Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden*/
        System.out.println("-----Punto 1-D-----");
        int number7 = 1;
        int number8 = 10;

        for ( int u = number8 ; u >= number7 ; u--){
            if(u % 2 == 0){
                System.out.print(u + " ");
            }
        }
        System.out.println();
        //PUNTO 2:
        /*Dado el siguiente texto, vamos a atacar el siguiente problema: “determinar si una
          persona pertenece al segmento de ingresos altos”. Del i al iii, la idea es hacerlo en
          papel y lápiz y sólo implementar el cuarto.

          “Son hogares que declaran reunir alguna de las siguientes condiciones, considerando a
          todas y todos los convivientes:
            ● Ingresos mensuales totales del hogar equivalentes o superiores a $489.083
            (3,5 canastas básicas para un hogar tipo 2 según el INDEC).
            ● Tener 3 o más vehículos con una antigüedad menor a 5 años.
            ● Tener 3 o más inmuebles.
            ● Poseer una embarcación, una aeronave de lujo o ser titular de activos
            societarios que demuestren capacidad económica plena.”*/

                /*D-Finalmente, vea si puede resolver el problema utilizando código Java. Por
                ejemplo si estuviésemos intentando resolver el ejemplo de monotributo
                tendríamos el código que se muestra más abajo, y cambiando las variables*/

        //Variables del punto 2-D
        boolean embarcacion = false, aeronave = false, tituloSocietario = false, masDe3Vehiculos= false;
        int ingresos = 0 , inmuebles = 4, antiguedad = 0;


        System.out.println("-----Punto 2-D-----");

        //Funcionamiento de la resolucion del punto 2-D
        if(ingresos>489093||inmuebles >= 3|| embarcacion == true|| aeronave == true|| tituloSocietario ==true ){
            System.out.println("Esta persona pertence al segmento de altos ingresos");
        }else if(masDe3Vehiculos == true){
            if(antiguedad<5){
                System.out.println("Esta persona pertence al segmento de altos ingresos");
            }else{
                System.out.println("Esta persona no pertenece al segmento de ingresos altos");
            }
        }else{
            System.out.println("Esta persona no pertenece al segmento de ingresos altos");
        }

    }
}