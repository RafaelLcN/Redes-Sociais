class InstagramAdapter implements GerenciadorRedesSociais {
    @Override
    public void publicarConteudo(Conteudo conteudo) {
        System.out.println("Publicando no Instagram: " + conteudo.getTitulo());
    }

    @Override
    public void agendarConteudo(Conteudo conteudo, String horario) {
        System.out.println("Agendando no Instagram: " + conteudo.getTitulo() + " para " + horario);
    }

    @Override
    public Estatisticas obterEstatisticas() {
        return new Estatisticas(200, 80, 40);
    }
}