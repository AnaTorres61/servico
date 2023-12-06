CREATE TABLE uf (
 id SERIAL PRIMARY KEY, 
 descricao VARCHAR(255) NOT NULL,
 codigo INT NOT NULL
);

CREATE TABLE cidade (
 id SERIAL PRIMARY KEY,
 descricao VARCHAR(255) NOT NULL,
 codigo INT NOT NULL,
 id_uf INT NOT NULL REFERENCES uf(id)
);

CREATE TABLE endereco (
 id SERIAL PRIMARY KEY,
 rua VARCHAR(255) NOT NULL,
 numero VARCHAR(25),
 bairro VARCHAR(200) NOT NULL,
 cep VARCHAR(20) NOT NULL,
 id_cidade INT NOT NULL REFERENCES cidade(id)
);

CREATE TABLE empresa (
 id SERIAL PRIMARY KEY,
 nome_fantasia VARCHAR(255) NOT NULL,
 cnpj VARCHAR(14) NOT NULL UNIQUE,
 slogan VARCHAR(255),
 id_endereco INT NOT NULL REFERENCES endereco(id)
);

CREATE TABLE cliente (
 id SERIAL PRIMARY KEY,
 nome VARCHAR(255) NOT NULL,
 dt_nascimento DATE,
 cpf VARCHAR(11) NOT NULL UNIQUE,
 email VARCHAR(100),
 id_endereco INT REFERENCES endereco(id)
);

CREATE TABLE ordem_servico (
 id SERIAL PRIMARY KEY,
 observacao VARCHAR(255),
 dt_abertura TIMESTAMP NOT NULL, 
 dt_saida TIMESTAMP,
 username_responsavel VARCHAR(100) NOT NULL,
 id_cliente INT REFERENCES cliente(id) NOT NULL,
 id_empresa INT REFERENCES empresa(id) NOT NULL
);

CREATE TABLE item_ordem_servico (
 id SERIAL PRIMARY KEY,
 descricao VARCHAR(255) NOT NULL,
 preco BIGINT NOT NULL,
 id_ordem_servico INT REFERENCES ordem_servico(id) NOT NULL
);