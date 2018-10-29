package basicosmikelmendozarubio;

public class BasicosMikelMendozaRubio {

      public static void main(String args[]){
  
   int matematicas = 9;
   int biologia    = 7;
   int quimica     = 7;
   int promedio    = 0;

   promedio = (matematicas + biologia + quimica) / 3;

   if(promedio >= 6){
     System.out.println("El alumno aprobó " + promedio);
   } else {
     System.out.println("con este tipo de variable no se acepta ");
   }
 }
}