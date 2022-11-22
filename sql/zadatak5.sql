#  C:\xampp\mysql\bin\mysql -uroot < C:\Users\Administrator\Documents\GitHub\RadJP\RadJP\sql\zadatak5.sql

drop database if exists muzej;
create database muzej;
use muzej;

create table izlozba(
    sifra int not null primary key auto_increment,
    naziv varchar(50),
    vrijemedatum datetime,
    kustos int not null,
    sponzor int not null
);

create table djelo(
    sifra int not null primary key auto_increment,
    nazivdj varchar(50) not null,
    autor varchar(50),
    vrijednost decimal(18,2),
    izlozba int not null
   
);

create table kustos(
    sifra int not null primary key auto_increment,
    iban char(35),
    oib char(11),
    imekustos varchar(50) not null,
    prezimekustos varchar (50) not null
);

create  table sponzor(
    sifra int not null primary key auto_increment,
    brojugovora varchar (20),
    imesponzora varchar(50) not null,
    prezimesponzora varchar(50) not null
);


alter table izlozba add foreign key (kustos) references kustos(sifra);
alter table izlozba add foreign key (sponzor) references sponzor(sifra);
alter table djelo add foreign key (izlozba) references izlozba(sifra);