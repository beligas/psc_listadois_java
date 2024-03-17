// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Crie um algoritmo que leia um valor de hora (HH:MM) e informe (calcule) quantos minutos se passaram desde o início do dia (00:00).

import java.util.Scanner;

public class QUESTAO1 {
  public static void main(String[] args) {

  Scanner enterScanner = new Scanner (System.in);
    double hora, minutos, horaM;   
    
    System.out.println("Informe uma hora exata do seu dia");
    hora = enterScanner.nextDouble();

    System.out.println("Informe os minutos");
    minutos = enterScanner.nextDouble();
   
    horaM = (hora * 60) + minutos;

    
    System.out.println("Se passaram " + horaM + " minutos desde o início do dia");
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}