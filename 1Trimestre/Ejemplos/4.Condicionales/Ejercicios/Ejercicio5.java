public class Ejercicio5{

  public static void main (String [] args){

    int dia = Integer.parseInt(args[0]);
    int mes = Integer.parseInt(args[1]);
    int ano = Integer.parseInt(args[2]);

    /* Con todos los meses homogéneos */
    if (ano > 0) {
      if (mes > 0 && mes <= 12) {
        if (dia > 0 && dia <= 30) {
          System.out.println("La fecha "+dia+"/"+mes+"/"+ano+" es correcta");
        }
      }
    }

    /* Diferenciando entre meses */
    int diaMax = 31;

    switch (mes) {
      case 2:
        diaMax = 28;
        break;
      case 4:
      case 6:
      case 9:
      case 11:
        diaMax = 30;
        break;
      default:
    }

    if (ano > 0 && dia > 0 && mes > 0 && mes <= 12 && dia <= diaMax ) {
         System.out.println("La fecha "+dia+"/"+mes+"/"+ano+" es correcta");
    }else{
        System.out.println("La fecha es incorrecta");
    }

  } 
}