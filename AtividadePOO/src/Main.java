
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Quantos candidatos serão cadastrados? ");
            int qtdCand = scanner.nextInt();

            CandidatoE[] candidatos = new CandidatoE[qtdCand];

            for (int i = 0; i < qtdCand; i++) {
                System.out.print("Número do candidato " + (i + 1) + ": ");
                int numero = scanner.nextInt();

                System.out.print("Nome do candidato " + (i + 1) + ": ");
                String nome = scanner.next();

                candidatos[i] = new CandidatoE(numero, nome);
            }

            System.out.print("Quantos votos serão computados? ");
            int qtdVotos = scanner.nextInt();

            for (int i = 0; i < qtdVotos; i++) {
                System.out.print("Número do candidato escolhido: ");

                while (!scanner.hasNextInt()) {
                    System.out.println("Valor inválido. Por favor, digite um número inteiro.");
                    scanner.next();
                }

                int numeroCandidato = scanner.nextInt();

                for (CandidatoE candidato : candidatos) {
                    if (candidato.getNumero() == numeroCandidato) {
                        candidato.atualizarVotos();
                    }
                }
            }

            System.out.println("\nResultado da eleição:");
            for (CandidatoE candidato : candidatos) {
                System.out.println(candidato.getNumero() + " Nome do Candidato: " + candidato.getNome() + " Quantidade de Votos: " + candidato.getVotos());
            }
        }
    }

