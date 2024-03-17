// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Crie um programa que calcule a área, o perímetro e a diagonal de um retângulo. O resultado deve aparecer de maneira organizada e clara para a pessoa utilizadora.

import java.util.Scanner;

public class QUESTAO5 {
  public static void main(String[] args) {

  Scanner enterScanner =  new Scanner (System.in);

    double base;
    double altura;
    double area;
    double perimetro;
    double diagonal;
    
    System.out.println("Digite o tamanho da base");
    base = enterScanner.nextDouble();

    System.out.println("Digite o tamanho da altura");
    altura = enterScanner.nextDouble();

    area = base * altura;
    perimetro = (base *2 ) + (altura * 2);

    diagonal = Math.sqrt(altura * altura + base * base);

    System.out.println("A área da figura é " + area);
    System.out.println("O perímetro da figura é " + perimetro);
    System.out.println("A diagonal da figura é " + diagonal);
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}