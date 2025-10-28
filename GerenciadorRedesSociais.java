// Interface Unificada
public interface GerenciadorRedesSociais {
    void publicarConteudo(Conteudo conteudo);
    void agendarConteudo(Conteudo conteudo, String horario);
    Estatisticas obterEstatisticas();
}