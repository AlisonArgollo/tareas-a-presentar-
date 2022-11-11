import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner imput = new Scanner(System.in);
    //pedimos el numero de alumnos a evaluar
    System.out.print("Introduzca el numero de alumnos: ");
    int num;
    double med;
    num = imput.nextInt();
    double[] arreglo = new double[num];
    for (int i=0;i<num;i++){
      //introducimos la altura de los alunmos establecidos
      System.out.print("Introduzca la altura del alumno " + (i+1) + ":");
      arreglo[i] = imput.nextDouble();
    }
    med = arreglo[0];
    for (int i=1;i<num;i++){
      med = med + arreglo[i];
    }
    //realizamos las operaciones para sacar la media de los alumnos
    med = med/num;
    System.out.println("La media de los alumnos es : " + med);
    int bajos = 0;
    int altos = 0;
    int medianos = 0;
    for (int i=0;i<num;i++){
      if (arreglo[i]<med){
        bajos = bajos+1;
      }
      else if(arreglo[i]>med){
        altos = altos+1;
      }
      else if(arreglo[i]==med){
        medianos = medianos+1;
      }
    }
    //mostramos por pantalla los resultados de los alumnos evaluados
    System.out.println("Los alumnos superior la media son : " + altos);
    System.out.println("Los alumnos inferior la media son : " + bajos);
    System.out.println("Los alumnos igual a la media son : " + medianos);
  }
}