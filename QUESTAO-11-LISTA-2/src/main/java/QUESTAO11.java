// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Muitas pessoas têm dúvida sobre qual o gasto com energia de determinados equipamentos que possuem. Crie um algoritmo que receba a potência do equipamento em Watts, a quantidade de horas que ele fica ligado por dia, e o valor do KW/h. O cálculo é feito multiplicando a potência pela quantidade de horas, depois, dividindo por mil. Ao final, apresente a quantidade de KWh consumidos pelo equipamento e qual será o valor pago por eles.

import java.util.Scanner;

public class QUESTAO11 {
  public static void main(String[] args) {

      Scanner enterScanner = new Scanner (System.in);
    
      double Watts;
      double horas;
      double gasto;
      double preco;
    
    System.out.println("Informe a potência do equipamento em Watts:");
    Watts = enterScanner.nextDouble();

    System.out.println("Informe a quantidade de horas que o equipamento fica ligado por dia(use horas exatas como 1h, 2h");
    horas = enterScanner.nextDouble();

    gasto = (Watts * horas) / 1000;
    preco = (Watts * horas * 0.65) / 1000;

    System.out.println("O equipamento consome " + gasto + " KWh por dia");
    
    System.out.println("\nContado que cada Kwh custa 0,65 reais, o valor por dia desse equipamento é de " + preco + "reais");

    enterScanner.close();
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}