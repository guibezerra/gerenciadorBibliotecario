-- insercao de dados tabela usuario: bibliotecario
INSERT INTO usuario (CPF, nome, telefone, login, senha, flag_bibli) 
VALUES ('806.651.110-80', 'Renato Gaucho', '22998645304', 'renatoMalvadao@flamengo.com.br','seleFla', true);

INSERT INTO usuario (CPF, nome, telefone, login, senha, flag_bibli) 
VALUES ('705.441.119-81', 'Jorge Jesus', '22991643501', 'jj@flamengo.com.br','fla123', true);

-- insercao de dados tabela usuario: cliente
INSERT INTO usuario (CPF, nome, telefone, login, senha, flag_bibli) 
VALUES ('715.402.202-72', 'Luiz Carlos', '22999206206', 'liscadoido@vasco.com.br','vasco2', false);

INSERT INTO usuario (CPF, nome, telefone, login, senha, flag_bibli) 
VALUES ('702.021.209-80', 'Fernando Diniz', '22981206305', 'fd@vasco.com.br','vascoB', false);

-- insercao de dados tabela endereco
INSERT INTO endereco (id_usuario, CEP, rua, numero, bairro, complemento) 
VALUES ('806.651.110-80', '59201-123', 'rua maracana','81', 'campeao mundial 81','campeao mundial 2021');

INSERT INTO endereco (id_usuario, CEP, rua, numero, bairro, complemento) 
VALUES ('705.441.119-81', '59201-123', 'rua maracana','81', 'campeao mundial 81','campeao mundial 2021');

INSERT INTO endereco (id_usuario, CEP, rua, numero, bairro) 
VALUES ('715.402.202-72', '58202-124', 'avenida serie b','21', 'moarcyr barbosa');

INSERT INTO endereco (id_usuario, CEP, rua, numero, bairro) 
VALUES ('702.021.209-80', '58202-124', 'avenida serie b','21', 'moarcyr barbosa');

-- frequencia
INSERT INTO frequencia (id_bibliotecario, dt_entrada, hr_entrada, hr_saida) 
VALUES ('705.441.119-81', '17/09/2021','22:12', '23:52');

DELETE FROM frequencia WHERE id_bibliotecario = '806.651.110-80';
DELETE FROM frequencia WHERE id_bibliotecario = '705.441.119-81';





