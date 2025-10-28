public class Main {
    public static void main(String[] args) {
        Conteudo conteudo = new Conteudo("Promoção", "Confira nossa nova promoção!");
        GerenciadorRedesSociais gerenciador = RedesSociaisFactory.criarGerenciador("Twitter");

        gerenciador.publicarConteudo(conteudo);
        gerenciador.agendarConteudo(conteudo, "2023-10-01 10:00");
        Estatisticas estatisticas = gerenciador.obterEstatisticas();

        System.out.println("Curtidas: " + estatisticas.getCurtidas() +
                           ", Compartilhamentos: " + estatisticas.getCompartilhamentos() +
                           ", Comentários: " + estatisticas.getComentarios());
    }
}