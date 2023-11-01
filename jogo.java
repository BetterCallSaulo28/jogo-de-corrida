import java.util.Scanner;

public class JogoCorrida {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Jogo de Corrida!");

        // Pedir o nome do personagem
        System.out.print("Digite o nome do seu personagem: ");
        String nomePersonagem = scanner.nextLine();

        System.out.println("Olá, " + nomePersonagem + "!");
        
        int coracoes = 2; // Inicializa os corações do jogador

        // Fase 1
        System.out.println("Fase 1: Corrida no Deserto");
        System.out.println("Você tem " + coracoes + " corações.");

        System.out.println("Você vê dois caminhos à sua frente: A - Caminho da Esquerda, B - Caminho da Direita");
        System.out.print("Escolha a opção (A/B): ");
        String escolhaFase1 = scanner.nextLine();

        if (escolhaFase1.equalsIgnoreCase("A")) {
            System.out.println("Você escolheu o Caminho da Esquerda. Boa escolha!");
        } else if (escolhaFase1.equalsIgnoreCase("B")) {
            System.out.println("Você escolheu o Caminho da Direita. O chão cede e você cai!");
            System.out.println("Você sofreu uma batida!");
            coracoes--; // Perde um coração devido à escolha errada
        } else {
            System.out.println("Escolha inválida. Você sofreu uma batida!");
            coracoes--;
        }

        if (coracoes <= 0) {
            System.out.println("Você perdeu todos os corações. O jogo acabou.");
            return;
        }

        System.out.println("Você ainda tem " + coracoes + " corações.");

        // ... Restante do código para as outras fases ...
    }
}
