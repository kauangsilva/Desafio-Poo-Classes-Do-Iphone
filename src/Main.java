public class Main {
    public static void main(String[] args) {
        // Criando uma instância de IPhone
        Iphone.IPhone iPhone = new Iphone.IPhone();

        // Chame os métodos das interfaces
        iPhone.tocar();
        iPhone.pausar();
        iPhone.selecionarMusica("Cpm 22 - Dias Atrás");

        iPhone.ligar("13-8888-4444");
        iPhone.atender();
        iPhone.iniciarCorreioVoz();

        iPhone.exibirPagina("https://www.google.com");
        iPhone.adicionarNovaAba("https://www.youtube.com");
        iPhone.atualizarPagina();
    }
}
