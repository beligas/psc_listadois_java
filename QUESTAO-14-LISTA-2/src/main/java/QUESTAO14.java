// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Escreva um algoritmo que recebe dois pontos no plano cartesiano, P1=(x1,y1) e P2=(x2,y2)e calcula a distância entre eles, dada por d(P1,P2)=(x1-x2)2+(y1-y2)2 .

import java.util.Scanner;

public class QUESTAO14 {
  public static void main(String[] args) {

    Scanner enterScanner = new Scanner (System.in);

    double X;
    double Y;
    double X2;
    double Y2;
    double resultado;

    
    System.out.println("Me informe dois valores do ponto X e Y dentro do plano cartesiano X");
    X = enterScanner.nextDouble();
    Y = enterScanner.nextDouble();

    System.out.println("Me informe dois valores do ponto X e Y dentro do plano cartesiano Y");
    X2 = enterScanner.nextDouble();
    Y2 = enterScanner.nextDouble();

    resultado = Math.sqrt(((X - X2) * (X - X2)) + ((Y - Y2) * (Y - Y2)));
  
    System.out.println("A distancia entre os pontos é de " + resultado);
    enterScanner.close();
    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}