Resumo simples

A atividade era pra criar um objeto Anime, modificar ele através de outra classe (service), e também aprender a criar e retornar novos objetos, entendendo que cada um tem sua própria vida na memória.

Criar uma classe Anime com atributos e métodos normais: nome, tipo, episodios.

Um método init() pra inicializar sem usar construtor

Um método imprimeAnime() pra mostrar os dados

Criar uma classe AnimeService pra manipular objetos Anime

Aqui entra a associação: o service recebe um objeto Anime por parâmetro e faz algo com ele.

Criar uma classe de teste e usar os métodos

No main você:

 criou objetos
 passou eles pro service (associação)
 recebeu um novo objeto de volta (cópia)
 provou que original e cópia são independentes
