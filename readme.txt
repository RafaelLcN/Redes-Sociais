Sistema de Integração de APIs de Mídia Social com Padrão Adapter

Descrição
Este projeto implementa um sistema unificado de gerenciamento de redes sociais utilizando o padrão de projeto Adapter. Ele permite publicar, agendar conteúdos e obter estatísticas de diferentes plataformas de mídia social (Twitter e Instagram) através de uma interface unificada.

Funcionalidades
Publicar conteúdo em redes sociais.
Agendar publicações para horários específicos.
Obter estatísticas de interações (curtidas, compartilhamentos, comentários).
Tecnologias Utilizadas
Java: Linguagem de programação principal.
Padrão Adapter: Para integrar APIs heterogêneas de redes sociais.
Factory Method: Para criar instâncias de gerenciadores de redes sociais dinamicamente.

Estrutura do Projeto

GerenciadorRedesSociais: Interface unificada para todas as plataformas.
Adapters: Implementações específicas para cada rede social (Twitter e Instagram).
RedesSociaisFactory: Fábrica para criar instâncias de gerenciadores de redes sociais com base na plataforma.