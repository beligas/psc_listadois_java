// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Escreva um programa que seja capaz de realizar a soma de duas frações, não é necessário simplificar. As entradas serão o numerador e, o denominador da primeira fração, seguidos do numerador e, o denominador da segunda fração. O resultado também deverá ser exibido em formato de fração. e.g: ⅗

import java.util.Scanner;

public class QUESTAO13 {
  public static void main(String[] args) {
    double dem;
    double num;
    double dem2;
    double num2;
    double resultado1;
    double resultado2;
    double mcomum;
    double resFinal;

    Scanner enterScanner = new Scanner (System.in);
    
    System.out.println("Me informe o numerador e denominador da fraçaõ 1");
    num = enterScanner.nextDouble();
    dem = enterScanner.nextDouble();

    System.out.println("Me informe o numerador e denominador da fraçaõ 2");
    num2 = enterScanner.nextDouble();
    dem2 = enterScanner.nextDouble();

    mcomum = dem * dem2;

    resultado1 = mcomum/dem;
    resultado1 = resultado1 * num;

    resultado2 = mcomum/dem2;
    resultado2 = resultado2 * num2;

    resFinal= (resultado1 + resultado2);
    
    System.out.println("O resultado é: " + resFinal + "/" + mcomum );
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}