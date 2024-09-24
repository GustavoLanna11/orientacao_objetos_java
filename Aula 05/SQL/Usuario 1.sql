create database Usuario;
use Usuario;

create table cliente(
id int auto_increment primary key,
nome varchar(60),
login varchar(100),
senha varchar(100),
email varchar(200));