// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;


// Escreva um programa que calcule o teorema de Pitágoras, representado pela expressão: c = a2+b2 

import java.util.Scanner;

public class QUESTAO3 {
  public static void main(String[] args) {

  Scanner enterScanner = new Scanner (System.in);
    
  double a;
  double b;
  double c ;
    
    System.out.println("Informe o valor da variavel A de pitagoras");
    a = enterScanner.nextDouble();  
    
    System.out.println("Informe o valor da variavel B de pitagoras");
    b = enterScanner.nextDouble();

    c = Math.sqrt(a*a + b*b);
    
    System.out.println("o valor de C de pitagoras é " + c);
   
    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}