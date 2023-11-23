import java.util.Scanner;
public class Main {

    public static class DesafioTemperatura {
        public static void main(String[] args){
            Scanner entrada = new Scanner(System.in);
            System.out.print("Digite uma temperatura: ");
            double temp = entrada.nextDouble();
            double conversao = (temp * 1.8) + 32;

            System.out.println("O valor convertido eh: " + conversao);

        }
    }
}