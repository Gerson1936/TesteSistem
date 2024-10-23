Plano de Testes

Título do Projeto:

Sistema de Gestão de Alunos

Versão:

1.0

Identificação do Responsável:

Nome: [Seu nome] E-mail: [Seu e-mail] Departamento: [Seu departamento]


1. Descrição do projeto e funcionalidades

O projeto Sistema de Gestão de Alunos visa criar uma plataforma de controle acadêmico que permite o cadastro, edição e consulta de alunos e suas respectivas notas. O objetivo é fornecer uma solução simples para a gestão de alunos, permitindo a realização das seguintes funcionalidades:

· Cadastro de alunos, com validação de nomes duplicados.

· Edição de nome e notas dos alunos.

· Geração de relatórios com a situação de aprovação/reprovação dos alunos.

· Exclusão de alunos do sistema.


2. Escopo

Os testes abrangerão as seguintes funcionalidades do sistema:

· Cadastro de Alunos: Garantir que os alunos possam ser cadastrados corretamente e que nomes duplicados sejam tratados.

· Edição de Nome: Verificar se é possível editar o nome de um aluno e se a validação de nome duplicado está funcionando.

· Edição de Notas: Validar que as notas podem ser editadas corretamente.

· Geração de Relatórios: Certificar-se de que os relatórios são gerados corretamente, incluindo a média e a situação do aluno.

· Tratamento de erros: Testar as mensagens de erro em cenários de falhas como aluno inexistente e campos não preenchidos.


3. Cronograma dos Testes

Fase Data de Início Data de Término

Análise [Data] [Data]

Planejamento [Data] [Data]

Execução [Data] [Data]

Relatório Final [Data] [Data]


4. Requisitos de Software e Hardware

Software

· JDK 21

· IDE Eclipse ou IntelliJ

· JUnit 5

· Maven ou Gradle para dependências de testes

Hardware

· 8 GB de RAM

· Processador Intel i5 ou superior

· Sistema operacional Windows, macOS ou Linux


5. Critérios de Sucesso e Falha

Critérios de Sucesso

· O aluno deve ser cadastrado corretamente se o nome não existir no sistema.

· O nome do aluno deve ser atualizado corretamente, exceto quando houver duplicidade.

· A nota do aluno deve ser alterada corretamente.

· O relatório deve exibir corretamente o nome, as notas, a média e a situação de aprovação do aluno.

· Mensagens de erro apropriadas devem ser exibidas em caso de falha, como tentativa de cadastro duplicado ou edição de aluno inexistente.

Critérios de Falha

· O cadastro deve falhar quando o nome do aluno já existir.

· A edição do nome deve falhar se o nome já existir no sistema.

· A alteração de notas deve falhar se o aluno não existir.

· O relatório deve exibir corretamente todas as informações; caso contrário, será considerado uma falha.


6. Cenários de Teste

Cenário 1: Cadastro de aluno com sucesso

Input: Nome: “Alan”, Notas: [7.5, 8.0, 9.0, 6.5]

Resultado esperado: Aluno cadastrado com sucesso.

Resultado obtido: Aluno cadastrado conforme o esperado.


Cenário 2: Cadastro de aluno com nome duplicado

Input: Nome: “Alan”, Notas: [7.5, 8.0, 9.0, 6.5] Novo Cadastro: Nome: “Alan”, Notas: [5.0, 6.0, 7.0, 8.0]

Resultado esperado: Erro: "Já existe um aluno cadastrado com esse nome."

Resultado obtido: Erro exibido conforme o esperado.


Cenário 3: Edição de nome do aluno com sucesso

Input: Nome atual: “Alan”, Novo nome: “Alan Ruiz”

Resultado esperado: Nome do aluno alterado com sucesso.

Resultado obtido: Nome alterado conforme o esperado.


Cenário 4: Edição de nome para um nome já existente

Input: Nome atual: “Alan Roberto”, Novo nome: “Alan Ruiz”

Resultado esperado: Erro: "Já existe um aluno com o nome 'Alan Ruiz'."

Resultado obtido: Erro exibido conforme o esperado.


Cenário 5: Edição de nota do aluno com sucesso

Input: Nome: “Alan”, Nota índice 2, Nova nota: 10.0

Resultado esperado: Nota alterada com sucesso.

Resultado obtido: Nota alterada conforme o esperado.


Cenário 6: Edição de nota de aluno inexistente

Input: Nome: “Pedro”, Nota índice 1, Nova nota: 8.0

Resultado esperado: Erro: "Aluno não encontrado."

Resultado obtido: Erro exibido conforme o esperado.


Cenário 7: Geração de relatório

Input: Nome: “Alan”, Notas: [7.0, 8.5, 9.0, 6.5]

Resultado esperado: Relatório gerado com nome, notas, média e situação de aprovação do aluno.

Resultado obtido: Relatório gerado conforme o esperado.


Este template cobre os principais pontos do seu sistema e permite uma boa rastreabilidade de testes e validação de funcionalidade.
