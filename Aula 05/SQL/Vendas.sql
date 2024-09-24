create database ConsultaVenda;
use ConsultaVenda;

create table vendas(
id int not null primary key auto_increment,
codigo varchar(255) not null,
nomeVendedor varchar(255) not null,
nomeProduto varchar(255) not null);