// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Incremente o programa da questão 6, para informar o valor do metro quadrado da cerâmica escolhido e o valor total a ser pago.


import java.util.Scanner;

public class QUESTAO7 {
  public static void main(String[] args) {

  Scanner enterScanner = new Scanner (System.in);

    double larCer;
    double comCer;
    double areaCer;

    double larRev;
    double comRev;
    double areaRev;

    double totalRev;
    double valorTotal;

    System.out.println("Informe a largura da ceramica escolhida");
    larCer = enterScanner.nextDouble();

    System.out.println("Informe o comprimento da ceramica escolhida");
    comCer = enterScanner.nextDouble();

    areaCer = larCer * comCer;

    System.out.println("Informe a largura da base da revestimento escolhida");
    larRev = enterScanner.nextDouble();

    System.out.println("Informe o comprimento da area sera revestida");
    comRev = enterScanner.nextDouble();

    areaRev = larRev * comRev;

    totalRev = Math.ceil (areaRev / areaCer);
    valorTotal = totalRev * 5;

    System.out.println("A quantidade de revestimento necessaria é de: " + totalRev );
        enterScanner.close();

    System.out.println("O valor total do revestimento, contando que o preco do metro quadrado é de 5 reais será de: " + valorTotal );
    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}