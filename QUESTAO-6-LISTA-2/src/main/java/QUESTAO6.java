// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Faça um programa para uma loja de cerâmica que ajuda no cálculo da quantidade de revestimento necessário para uma obra. A pessoa utilizadora deve informar as medidas de largura e comprimento da área que será revestida e da cerâmica escolhida. Sempre arredonde o valor para cima, e acrescente dez por cento para o acabamento.

import java.util.Scanner;

public class QUESTAO6 {
  public static void main(String[] args) {

  Scanner enterScanner = new Scanner (System.in);

    double larCer;
    double comCer;
    double areaCer;

    double larRev;
    double comRev;
    double areaRev;

  double totalRev;
    
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

    System.out.println("A quantidade de revestimento necessaria é de: " + totalRev );
        enterScanner.close();

  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}