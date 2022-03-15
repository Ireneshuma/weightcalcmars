 public class Weightmarscalc {
     public static void main(String[] args) {

         float earthWeightShuma;
         float marsWeightShuma;
         double marsWeightInDoubleShuma;
         int marsWeightInIntShuma;

         earthWeightShuma = 85;
         marsWeightShuma = (earthWeightShuma * 0.38F);
         System.out.println(earthWeightShuma + "kg on earth is " + marsWeightShuma + "kg on Mars");

         marsWeightInDoubleShuma = marsWeightShuma;
         System.out.println("Kilograms on Mars after converting to double" + marsWeightInDoubleShuma);

         System.out.printf("Kilograms on Mars expressed to four decimal places: %.4f %n", marsWeightInDoubleShuma);

         marsWeightInIntShuma = (int) marsWeightInDoubleShuma;
         System.out.println("Kilograms on Mars when casted to integer" + marsWeightInIntShuma);

         char c = (char) marsWeightInDoubleShuma;
         System.out.println("The ASCII table equivalent of marsWeightInInt is:" + c);
         int exampleOfMathOnChar = c * c;
         System.out.println("An example of a mathematical operation on the char type :" + exampleOfMathOnChar);

     }

 }







