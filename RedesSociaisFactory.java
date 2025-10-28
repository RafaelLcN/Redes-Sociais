class RedesSociaisFactory {
    public static GerenciadorRedesSociais criarGerenciador(String plataforma) {
        switch (plataforma) {
            case "Twitter":
                return new TwitterAdapter();
            case "Instagram":
                return new InstagramAdapter();
            default:
                throw new IllegalArgumentException("Plataforma não suportada");
        }
    }
}