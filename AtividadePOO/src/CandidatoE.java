public class CandidatoE {

        private int numero;
        private String nome;
        private int votos;


        public CandidatoE(int numero, String nome) {
            this.numero = numero;
            this.nome = nome;
            this.votos = 0;
        }



        public int getNumero() {

            return numero;
        }
        public String getNome() {

            return nome;
        }
        public int getVotos() {
            return votos;
        }

    public void votar() {
        votos++;
    }
        public void atualizarVotos() {

            votos++;
        }

    public void exibirinfo() {
        System.out.println("Candidato: " + nome);
        System.out.println("Numero: " + numero);
        System.out.println("Total de votos: " + votos);
    }
}


