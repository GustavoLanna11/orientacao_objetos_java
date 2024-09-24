create database ConsultaProduto;
use ConsultaProduto;

create table produto(
id int not null primary key auto_increment,
codigo int not null,
nome varchar(255) not null,
descricao varchar (255) not null);