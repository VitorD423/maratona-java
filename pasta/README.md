# Arquivos de apoio dos exercícios

Esta pasta reúne arquivos utilizados nos exercícios de manipulação de arquivos, compactação e serialização.

## Compactação e extração

- `subpasta1/subsubpasta1/`: arquivos de texto usados como origem no exercício de compactação.
- `arquivo.zip`: arquivo compactado gerado pelo exercício.
- `descompactado/`: destino utilizado pelo exercício de extração do ZIP.

As classes relacionadas estão em `src/academy/devdojo/maratonajava/javacore/Wnio/test/`.

## Serialização

Os exercícios de serialização utilizam os caminhos `aluno.ser` e `atv2.ser` para gravar e recuperar objetos.

Esses arquivos são gerados durante a execução dos programas e, por isso, não precisam ficar versionados no Git. O arquivo `.gitignore` está configurado para ignorar arquivos com a extensão `.ser`.

As classes relacionadas estão em:

- `src/academy/devdojo/maratonajava/javacore/Xserializacao/test/`
- `src/academy/devdojo/maratonajava/Atividades/EAtividades/Serializacao/ATV2/test/`
