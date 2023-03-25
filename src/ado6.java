import java.util.Scanner;

public class ado6 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        int questoes = 0;

        do {

            System.out.println("Selecione a alternativa correta");
            System.out.println(" Em que ano surgiu o ENIAC?");
            System.out.println("A 1946");
            System.out.println("B 2000");
            System.out.println("C 1995");
            System.out.println("D 1980");

            String escolha = ler.next();

            switch (escolha) {
                case "A":
                case "a":
                    System.out.println("Resposta Correta");
                    System.exit(0);

                    break;

                case "B":
                case "b":
                    System.out.println("Resposta incorreta");
                    questoes++;

                    break;

                case "C":
                case "c":

                    System.out.println("Resposta incorreta");
                    questoes++;

                    break;

                case "D":
                case "d":
                    System.out.println("Resposta incorreta");
                    questoes++;

                    break;
            }

        } while (questoes < 3);

        if (questoes == 3) {
            System.out.println("Você excedeu o número de tentativas");
        }

        ler.close();

    }
}
