class TwitterAdapter implements GerenciadorRedesSociais {
    @Override
    public void publicarConteudo(Conteudo conteudo) {
        System.out.println("Publicando no Twitter: " + conteudo.getTitulo());
    }

    @Override
    public void agendarConteudo(Conteudo conteudo, String horario) {
        System.out.println("Agendando no Twitter: " + conteudo.getTitulo() + " para " + horario);
    }

    @Override
    public Estatisticas obterEstatisticas() {
        return new Estatisticas(100, 50, 20);
    }
}