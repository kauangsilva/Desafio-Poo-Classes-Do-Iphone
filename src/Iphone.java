public class Iphone {
    // Interface para o Reprodutor Musical
    public interface ReprodutorMusical {
        void tocar();
        void pausar();
        void selecionarMusica(String musica);
    }

    // Interface para o Aparelho Telefônico
    public interface AparelhoTelefonico {
        void ligar(String numero);
        void atender();
        void iniciarCorreioVoz();
    }

    // Interface para o Navegador na Internet
    public interface NavegadorInternet {
        void exibirPagina(String url);
        void adicionarNovaAba(String url);
        void atualizarPagina();
    }

    // Classe iPhone que implementa todas as interfaces
    public static class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
        // Implementação dos métodos das interfaces com mensagens de retorno
        public void tocar() {
            System.out.println("Tocando música.");
        }

        public void pausar() {
            System.out.println("Pausando música.");
        }

        public void selecionarMusica(String musica) {
            System.out.println("Selecionando música: " + musica);
        }

        public void ligar(String numero) {
            System.out.println("Ligando para: " + numero);
        }

        public void atender() {
            System.out.println("Atendendo chamada telefônica.");
        }

        public void iniciarCorreioVoz() {
            System.out.println("Iniciando correio de voz.");
        }

        public void exibirPagina(String url) {
            System.out.println("Exibindo página da web: " + url);
        }

        public void adicionarNovaAba(String url) {
            System.out.println("Adicionando nova aba: " + url);
        }

        public void atualizarPagina() {
            System.out.println("Atualizando página da web.");
        }


    }

}