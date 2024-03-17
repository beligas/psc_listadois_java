// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Crie um programa para calcular o IMC de uma pessoa. Ele deve receber o peso atual em quilogramas e a altura, em centímetros, e exibir o peso ideal e o peso ideal ajustado. Dica: https://eurofarma.com.br/calculadoras/calculadora-de-peso-ideal Utilize este como referência para seus testes. Obs. O IMC é apenas uma referência, um médico deve ser consultado para entender as necessidades de cada indivíduo.

import java.util.Scanner;

public class QUESTAO9 {
  public static void main(String[] args) {

    Scanner enterScanner = new Scanner(System.in);

    double peso;
    double altura;
    double IMC;

    System.out.println("Informe sua altura em centimetros");
    altura = enterScanner.nextDouble();

    System.out.println("Informe seu peso em quilogramas");
    peso = enterScanner.nextDouble();

    IMC = peso / ((altura /100) * (altura / 100));

    if (IMC < 18.5) {
      System.out.println("Voce esta magro");
    } else if (IMC > 18.5 && IMC < 24.9) {
      System.out.println("Voce esta com o peso ideal");
    } else if (IMC > 25) {
      System.out.println("Voce esta acima do peso");
    }
 enterScanner.close();
  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
 

}