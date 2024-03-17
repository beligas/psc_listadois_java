// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Uma dúvida que sempre paira na cabeça dos motoristas é: Abastecer com etanol ou gasolina? Especialistas indicam que o consumo do carro aumenta em torno de trinta por cento, quando abastecido com etanol, logo, só vale a pena abastecer com ele se o valor estiver abaixo de setenta por cento do valor da gasolina. Para auxiliar motoristas a realizar este cálculo, crie um algoritmo que receba o preço dos dois combustíveis, e informe qual deve ser a escolha, com base no custo.

import java.util.Scanner;

public class QUESTAO2 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    
    double alcool;
    double gasolina;
    double total;
    
    System.out.println("Digite o preco da gasolina");
    gasolina = scanner.nextDouble();

    System.out.println("Digite o preco do alcool");
    alcool = scanner.nextDouble();

    total = gasolina * 0.7;

    if (alcool> total) {
      System.out.println("A gasolina vale mais a pena");
    } else {
      System.out.println("O alcool vale mais a pena");
    }
        
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}