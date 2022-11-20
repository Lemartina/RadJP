# C:\xampp\mysql\bin\mysql -uroot < C:\Users\Administrator\Documents\GitHub\EdunovaJP27\SQL\skripta4.sql


create database hijerarhija_novo;
use hijerarhija_novo;

create table zaposlenik(
    sifra int not null primary key auto_increment,
    ime varchar(50),
    prezime varchar(50),
    placa decimal(18,2),
    nadredeni int
);

# vanjski ključ sam na sebe

alter table zaposlenik add foreign key (nadredeni) references zaposlenik(sifra);