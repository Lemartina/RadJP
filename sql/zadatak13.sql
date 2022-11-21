drop database if exists srednjaskola; 
create database srednjaskola;
use srednjaskola;

create table razred(
    sifra int not null primary key auto_increment,
    naziv varchar(20),
    ucionica varchar(20)
);
create table ucenik(
    sifra int not null primary key auto_increment,
    ime varchar(50),
    prezime varchar(50),
    brojugovora varchar (20),
    razred int
);
create table profesor(
    sifra int not null primary key auto_increment,
    imep varchar (50),
    prezimep varchar(50),
    iban char(35)
);
create table predavaci(
    profesor int,
    razred int,
    datumpocetka datetime,
    datumkraja datetime
);


# vanjski ključevi
alter table ucenik add foreign key razred references razred(sifra);
alter table predavaci add foreign key profesor references profesor(sifra);
alter table predavaci add foreign key razred references razred(sifra);