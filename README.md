# Gerenciador Bibliotecario

Projeto final da disciplina de Banco de Dados

## O que foi Implementado 

- A aplicação foi criada com Java Web utilizando JSF.
- Persitência de dados feita com mySQL
- Método de acesso ao banco de dados e encerramento de conexão
- Método de cadastro de funcionário e cliente 
- Método para registrar frequência do funcionário

## Instruções para uso

- Importar o project no Eclipse como Existing Maven Project

- Adicionar como servidor o Tomcat 9. Caso exista servidor, excluir, adicionar o Tomcat 9, Next e adicionar o projeto.

- Acessar pelo navegador os endereços:

   http://localhost:8080/gerenciadorBibliotecario/Cadastro.xhtml

  http://localhost:8080/gerenciadorBibliotecario/frequencia.xhtml

  para realizar cadastro e registrar a frequência, respectivamente.

Para as operações com o banco de dados funcionarem, é preciso ter o  mySQL instalado, editar os atributos da classe ConnectionFactory  com os dados do seu banco e efetuar os comandos nos arquivos .sql da pasta sql. 