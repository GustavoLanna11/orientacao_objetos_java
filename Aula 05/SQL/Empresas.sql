create database ConsultaEmpresa;
use ConsultaEmpresa;

create table empresa(
id int not null primary key auto_increment,
CNPJ varchar(255) not null,
nomeEmpresa varchar(255) not null,
endereco varchar(255) not null);