# ljestve (hash) je komentar i on se ne izvodi
# Izvođenje naredbi na serveru
# Otvoriti CMD
# Zaljepiti sljedeću naredbu bez prvoh hash znaka
# c:\xampp\mysql\bin\mysql -uroot < C:\Users\Administrator\Documents\GitHub\EdunovaJP27\SQL\zadatak4.sql


drop database if exists djecjivrtic;
create database djecjivrtic;
use djecjivrtic;

create table skupina(
    sifra int not null primary key auto_increment,
    naziv varchar(50), 
    cijena decimal(18,2),
    program  varchar(50)
    );

create table dijete(
    sifra int not null primary key auto_increment,
    ime varchar(20),
    prezime varchar(20),
    brojugovora varchar(15),
    skupina int,
    odgajateljica int
);

create table odgajateljica(
    sifra int not null primary key auto_increment,
    imeodg varchar(20),
    prezimeodg varchar(20),
    oib char(11),
    iban char(35),
    strucnasprema int
   
);

create table strucnasprema(
    sifra int not null primary key auto_increment,
    naziv varchar(20)
);

# vanjski ključevi
alter table dijete add foreign key (skupina) references skupina(sifra);
alter table dijete add foreign key (odgajateljica) references odgajateljica(sifra);
alter table odgajateljica add foreign key (strucnasprema) references strucnasprema(sifra);


