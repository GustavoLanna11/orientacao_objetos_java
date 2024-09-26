create database ConsultaPrefeitura;
use ConsultaPrefeitura;

create table prefeitura(
id int not null primary key auto_increment,
codigo varchar(255) not null,
prefeitura varchar(255) not null,
cidade varchar(255) not null);