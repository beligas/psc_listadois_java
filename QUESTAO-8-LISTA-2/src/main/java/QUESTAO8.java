// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Faça um programa que calcule o tempo necessário para o download de um arquivo qualquer da internet. Deve-se informar o tamanho do arquivo em MB, a velocidade do link em Mbps e, retornar o tempo total em minutos.

import java.util.Scanner;

public class QUESTAO8 {
    public static void main(String[] args) {

        Scanner enterScanner = new Scanner(System.in);

        double velInternet;
        double tamArquivo;
        double tempo;
        double tempoMin;

        System.out.println("Informe a velocidade da internet que sera utilizada em Mbps");
        velInternet = enterScanner.nextDouble();

        System.out.println("Informe o tamanho do arquivo que sera instalado em MB");
        tamArquivo = enterScanner.nextDouble();
        
        tamArquivo = tamArquivo * 1024 * 1024; 
        tempo = tamArquivo / (velInternet * 1024 * 1024);       
        tempoMin = tempo / 60;

        System.out.println("O tempo total para instalar o arquivo sera de " + tempoMin + " minutos");

        enterScanner.close();
    }
}

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
