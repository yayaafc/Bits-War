import java.util.Scanner;

public class BitsWar {
  public static void main(String[] args) throws Exception {
    System.out.println("Hello, World!");

    // Variaveis
    Scanner ler = new Scanner(System.in);
    int inicio;
    int comecoInstrcoe;
    int escolhaPlayer;
    int vidaPlayer = 3;
    int pontos; // se tiver pontos
    int vidaInimigo = 5;
    int respc = 0;
    int repitir = 0;
    int volta0 = 0;
    int volta1 = 0;
    int volta2 = 0;
    int volta3 = 0;
    int volta4 = 0;
    int volta5 = 0;
    // Fim Variaveis

    // Arrays
    String[] player = { "Alan Turing", "Ada Lovelace" };
    String perguntas[] = { "Pergunta 0", "Pergunta 1", "Pergunta 2", "Pergunta 3", "Pergunta 4", "Pergunta 5",
                           "Pergunta 6", "Pergunta 7", "Pergunta 8", "Pergunta 9", "Pergunta 10" };
    // Fim Arrays

    do {
      System.out.println("Instruções:");
      System.out.println("");// aqui colocamos as instruçoes e acima dela ou depois vem a historia
      System.out.println("voce entendeu elas?");
      System.out.println("1.sim");
      System.out.println("2.não");
      comecoInstrcoe = ler.nextInt();
    } while (comecoInstrcoe == 2 || comecoInstrcoe != 2 && comecoInstrcoe != 1);

    if (comecoInstrcoe == 1) {

      // Menu
      do {
        System.out.println("***************Welcome the BitsWar**********");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("****************1. Jogar*******************");
        System.out.println(" ");
        System.out.println("****************2. Creditos****************");
        System.out.println(" ");
        System.out.println("****************3. Sair********************");
        System.out.println(" ");
        inicio = ler.nextInt();
      } while (inicio != 1 && inicio != 2 && inicio != 3 && inicio != 4);
      // Fim Menu

      if (inicio == 1) {
       

        switch (inicio) {

          case 1:

            // Escolha do Personagem
            int i = 0;
            do {
              if(i == 3){
                System.out.println("Você digitou errado "+i+" vezes!");
                System.out.println("Escolha o Personagem corretamente, caso escolha a opção errada o jogo encerrara");
                System.out.println("1." + player[0] + " Mago da Algebra");
                System.out.println("2." + player[1] + " a Feticeira Matematica");
                escolhaPlayer = ler.nextInt();
                if(escolhaPlayer < 1 || escolhaPlayer > 2){
                  System.exit(0);
                }
              }
              else if(i > 0 && i < 3){
                System.out.println("Você digitou errado "+i+" vezes!");
                System.out.println("Escolha o Personagem corretamente");
                System.out.println("1." + player[0] + " Mago da Algebra");
                System.out.println("2." + player[1] + " a Feticeira Matematica");
                escolhaPlayer = ler.nextInt();
              }
              else{
              System.out.println("Escolha o Personagem");
              System.out.println("1." + player[0] + " Mago da Algebra");
              System.out.println("2." + player[1] + " a Feticeira Matematica");
              escolhaPlayer = ler.nextInt();
              }
              i++;
            } while (escolhaPlayer < 1 || escolhaPlayer > 2);
            // Fim da Escolha do Personagem
            
            do {

              System.out.println(player + " um inimigo apareceu");// caixa de dialogo
              System.out.println(" ");
              System.out.println("Responda a seguinte pergunta:");
              System.out.println("");
              System.out.println(perguntas[0]);
              System.out.println("A.");
              System.out.println("B.");
              System.out.println("C.");
              System.out.println("D.");
              String respostas = ler.next();

              if (respostas.equalsIgnoreCase("C")) {
                System.out.println("voce mataou o inimigo");
                vidaInimigo--;
                break;
              }

              else {
                System.out.println("Voce erro e tomou dano deseja refazer");
                vidaPlayer--;
                System.out.println("1-sim");
                System.out.println("2-não");
                repitir = ler.nextInt();
                volta0++;

                if (repitir == 2) {
                  System.out.println("Ate a proxima!!");
                  System.exit(0);
                }

              }

            } while (repitir == 1 && volta0 <= 3);

            do {

              System.out.println(player + " um inimigo apareceu");// caixa de dialogo
              System.out.println(" ");
              System.out.println("Responda a seguinte pergunta:");
              System.out.println("");
              System.out.println(perguntas[1]);
              System.out.println("A.");
              System.out.println("B.");
              System.out.println("C.");
              System.out.println("D.");
              String respostas = ler.next();

              if (respostas.equalsIgnoreCase("A")) {
                System.out.println("voce mataou o inimigo");
                vidaInimigo--;
                break;
              }

              else {
                System.out.println("Voce erro e tomou dano deseja refazer");
                vidaPlayer--;
                System.out.println("1-sim");
                System.out.println("2-não");
                repitir = ler.nextInt();
                volta1++;

                if (repitir == 2) {
                  System.out.println("Ate a proxima!!");
                  System.exit(0);
                }

              }

            } while (repitir == 1 && volta1 < 3);

            do {

              System.out.println(player + " um inimigo apareceu");// caixa de dialogo
              System.out.println(" ");
              System.out.println("Responda a seguinte pergunta:");
              System.out.println("");
              System.out.println(perguntas[2]);
              System.out.println("A.");
              System.out.println("B.");
              System.out.println("C.");
              System.out.println("D.");
              String respostas = ler.next();

              if (respostas.equalsIgnoreCase("C")) {
                System.out.println("voce mataou o inimigo");
                vidaInimigo--;
                break;
              }

              else {
                System.out.println("Voce erro e tomou dano deseja refazer");
                vidaPlayer--;
                System.out.println("1-sim");
                System.out.println("2-não");
                repitir = ler.nextInt();
                volta2++;

                if (repitir == 2) {
                  System.out.println("Ate a proxima!!");
                  System.exit(0);
                }

              }

            } while (repitir == 1 && volta2 <= 3);

            do {

              System.out.println(player + " um inimigo apareceu");// caixa de dialogo
              System.out.println(" ");
              System.out.println("Responda a seguinte pergunta:");
              System.out.println("");
              System.out.println(perguntas[3]);
              System.out.println("A.");
              System.out.println("B.");
              System.out.println("C.");
              System.out.println("D.");
              String respostas = ler.next();

              if (respostas.equalsIgnoreCase("C")) {
                System.out.println("voce mataou o inimigo");
                vidaInimigo--;
                break;
              }

              else {
                System.out.println("Voce erro e tomou dano deseja refazer");
                vidaPlayer--;
                System.out.println("1-sim");
                System.out.println("2-não");
                repitir = ler.nextInt();
                volta3++;

                if (repitir == 2) {
                  System.out.println("Ate a proxima!!");
                  System.exit(0);
                }

              }

            } while (repitir == 1 && volta3 <= 3);

            do {

              System.out.println(player + " um inimigo apareceu");// caixa de dialogo
              System.out.println(" ");
              System.out.println("Responda a seguinte pergunta:");
              System.out.println("");
              System.out.println(perguntas[4]);
              System.out.println("A.");
              System.out.println("B.");
              System.out.println("C.");
              System.out.println("D.");
              String respostas = ler.next();

              if (respostas.equalsIgnoreCase("C")) {
                System.out.println("voce mataou o inimigo");
                vidaInimigo--;
                break;
              }

              else {
                System.out.println("Voce erro e tomou dano deseja refazer");
                vidaPlayer--;
                System.out.println("1-sim");
                System.out.println("2-não");
                repitir = ler.nextInt();
                volta4++;

                if (repitir == 2) {
                  System.out.println("Ate a proxima!!");
                  System.exit(0);
                }

              }

            } while (repitir == 1 && volta4 <= 3);

            do {

              System.out.println(player + " um inimigo apareceu");// caixa de dialogo
              System.out.println(" ");
              System.out.println("Responda a seguinte pergunta:");
              System.out.println("");
              System.out.println(perguntas[5]);
              System.out.println("A.");
              System.out.println("B.");
              System.out.println("C.");
              System.out.println("D.");
              String respostas = ler.next();

              if (respostas.equalsIgnoreCase("C")) {
                System.out.println("voce mataou o inimigo");
                vidaInimigo--;
                break;
              }

              else {
                System.out.println("Voce erro e tomou dano deseja refazer");
                vidaPlayer--;
                System.out.println("1-sim");
                System.out.println("2-não");
                repitir = ler.nextInt();
                volta5++;

                if (repitir == 2) {
                  System.out.println("Ate a proxima!!");
                  System.exit(0);
                }

              }

            } while (repitir == 1 && volta5 <= 3);

            do {

              System.out.println(player + " um inimigo apareceu");// caixa de dialogo
              System.out.println(" ");
              System.out.println("Responda a seguinte pergunta:");
              System.out.println("");
              System.out.println(perguntas[6]);
              System.out.println("A.");
              System.out.println("B.");
              System.out.println("C.");
              System.out.println("D.");
              String respostas = ler.next();

              if (respostas.equalsIgnoreCase("C")) {
                System.out.println("voce mataou o inimigo");
                vidaInimigo--;
                break;
              }

              else {
                System.out.println("Voce erro e tomou dano deseja refazer");
                vidaPlayer--;
                System.out.println("1-sim");
                System.out.println("2-não");
                repitir = ler.nextInt();
                volta0++;

                if (repitir == 2) {
                  System.out.println("Ate a proxima!!");
                  System.exit(0);
                }

              }

            } while (repitir == 1 && volta0 <= 3);

            do {

              System.out.println(player + " um inimigo apareceu");// caixa de dialogo
              System.out.println(" ");
              System.out.println("Responda a seguinte pergunta:");
              System.out.println("");
              System.out.println(perguntas[7]);
              System.out.println("A.");
              System.out.println("B.");
              System.out.println("C.");
              System.out.println("D.");
              String respostas = ler.next();

              if (respostas.equalsIgnoreCase("A")) {
                System.out.println("voce mataou o inimigo");
                vidaInimigo--;
                break;
              }

              else {
                System.out.println("Voce erro e tomou dano deseja refazer");
                vidaPlayer--;
                System.out.println("1-sim");
                System.out.println("2-não");
                repitir = ler.nextInt();
                volta1++;

                if (repitir == 2) {
                  System.out.println("Ate a proxima!!");
                  System.exit(0);
                }

              }

            } while (repitir == 1 && volta1 < 3);

            do {

              System.out.println(player + " um inimigo apareceu");// caixa de dialogo
              System.out.println(" ");
              System.out.println("Responda a seguinte pergunta:");
              System.out.println("");
              System.out.println(perguntas[8]);
              System.out.println("A.");
              System.out.println("B.");
              System.out.println("C.");
              System.out.println("D.");
              String respostas = ler.next();

              if (respostas.equalsIgnoreCase("C")) {
                System.out.println("voce mataou o inimigo");
                vidaInimigo--;
                break;
              }

              else {
                System.out.println("Voce erro e tomou dano deseja refazer");
                vidaPlayer--;
                System.out.println("1-sim");
                System.out.println("2-não");
                repitir = ler.nextInt();
                volta2++;

                if (repitir == 2) {
                  System.out.println("Ate a proxima!!");
                  System.exit(0);
                }

              }

            } while (repitir == 1 && volta2 <= 3);

            do {

              System.out.println(player + " um inimigo apareceu");// caixa de dialogo
              System.out.println(" ");
              System.out.println("Responda a seguinte pergunta:");
              System.out.println("");
              System.out.println(perguntas[9]);
              System.out.println("A.");
              System.out.println("B.");
              System.out.println("C.");
              System.out.println("D.");
              String respostas = ler.next();

              if (respostas.equalsIgnoreCase("C")) {
                System.out.println("voce mataou o inimigo");
                vidaInimigo--;
                break;
              }

              else {
                System.out.println("Voce erro e tomou dano deseja refazer");
                vidaPlayer--;
                System.out.println("1-sim");
                System.out.println("2-não");
                repitir = ler.nextInt();
                volta3++;

                if (repitir == 2) {
                  System.out.println("Ate a proxima!!");
                  System.exit(0);
                }

              }

            } while (repitir == 1 && volta3 <= 3);

            do {

              System.out.println(player + " um inimigo apareceu");// caixa de dialogo
              System.out.println(" ");
              System.out.println("Responda a seguinte pergunta:");
              System.out.println("");
              System.out.println(perguntas[10]);
              System.out.println("A.");
              System.out.println("B.");
              System.out.println("C.");
              System.out.println("D.");
              String respostas = ler.next();

              if (respostas.equalsIgnoreCase("C")) {
                System.out.println("voce mataou o inimigo");
                vidaInimigo--;
                break;
              }

              else {
                System.out.println("Voce erro e tomou dano deseja refazer");
                vidaPlayer--;
                System.out.println("1-sim");
                System.out.println("2-não");
                repitir = ler.nextInt();
                volta4++;

                if (repitir == 2) {
                  System.out.println("Ate a proxima!!");
                  System.exit(0);
                }

              }

            } while (repitir == 1 && volta4 <= 3);

        }

      }

      else if (inicio == 2) {
        System.out.println("Creditos: ");// aquicolocamos os creditos
        System.out.println("Para recomecar o jogo aperte F5");
      } else if (inicio == 3) {
        System.out.println("Obrigado e volte sempre!!");
      }

    }

  }
}
