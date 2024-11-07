create database exercicio2;
use exercicio2;

create table produtos(
id int not null primary key auto_increment,
codigo int not null,
nomeProduto varchar (255) not null,
descricao varchar (255) not null);

select * from produtos;