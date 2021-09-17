SELECT * FROM usuario, endereco WHERE usuario.CPF = endereco.id_usuario;

SELECT * FROM usuario, frequencia WHERE usuario.CPF = frequencia.id_bibliotecario;

SELECT * FROM usuario WHERE flag_bibli='1';