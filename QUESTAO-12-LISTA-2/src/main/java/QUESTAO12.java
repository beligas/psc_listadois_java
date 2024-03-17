// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Pesquise o valor aproximado de dias por mês e ajuste o programa anterior para exibir o custo mensal em energia elétrica com o equipamento inserido.

import java.util.Scanner;

public class QUESTAO12 {
  public static void main(String[] args) {

      Scanner enterScanner = new Scanner (System.in);

      double Watts;
      double horas;
      double gasto;
      double preco;
      double precoMensal;

    System.out.println("Informe a potência do equipamento em Watts:");
    Watts = enterScanner.nextDouble();

    System.out.println("Informe a quantidade de horas que o equipamento fica ligado por dia(use horas exatas como 1h, 2h");
    horas = enterScanner.nextDouble();

    gasto = (Watts * horas) / 1000;
    preco = (Watts * horas * 0.65) / 1000;
    precoMensal = preco * 30;
    
    System.out.println("O equipamento consome " + gasto + " KWh por dia");

    System.out.println("\nContado que cada Kwh custa 0,65 reais, o valor por dia desse equipamento é de " + preco + "reais");

    System.out.println("\nContado que cada Kwh custa 0,65 reais, o valor por MES desse equipamento é de " + precoMensal + "reais");

    enterScanner.close();
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}