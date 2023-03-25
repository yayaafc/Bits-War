import java.util.Scanner;

public class ado5 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        System.out.println("Selecione uma opção");

        boolean rept = false;

        System.out.println("1 - Instruções");
        System.out.println("2 - Jogar");
        System.out.println("3 - Créditos");
        System.out.println("4- Sair");

        int escolha = ler.nextInt();

        do {

            switch (escolha) {
                case 1:
                    System.out.println("Sua escolha foi Instruções");
                    System.out.println("1 - Intruções");
                    System.out.println("2 - Jogar");
                    System.out.println("3 - Créditos");
                    System.out.println("4 - Sair");
                    escolha = ler.nextInt();

                    break;

                case 2:
                    System.out.println("Sua escolha foi Jogar");
                    System.out.println("1 - Intruções");
                    System.out.println("2 - Jogar");
                    System.out.println("3 - Créditos");
                    System.out.println("4- Sair");
                    escolha = ler.nextInt();

                    break;

                case 3:
                    System.out.println("Sua escolha foi Créditos");
                    System.out.println("1 - Intruções");
                    System.out.println("2 - Jogar");
                    System.out.println("3 - Créditos");
                    System.out.println("4- Sair");
                    escolha = ler.nextInt();

                    break;

                case 4:
                    System.out.println("Sua escolha foi Sair");
                    System.out.println("1 - Intruções");
                    System.out.println("2 - Jogar");
                    System.out.println("3 - Créditos");
                    System.out.println("4- Sair");
                    escolha = ler.nextInt();

                    break;
            }

        } while (rept = true);

        ler.close();

    }
}
