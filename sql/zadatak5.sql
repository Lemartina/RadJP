
# C:\xampp\mysql\bin>mysql -uroot < C:\Users\Administrator\Documents\GitHub\EdunovaJP27\SQL\zadatak5.sql

drop database if exists muzej;
create database muzej;
use muzej;

create table izlozba(
    sifra int not null primary key auto_increment,
    naziv varchar(50),
    vrijemedatum datetime,
    sponzor int,
    kustos int
);

create table djelo(
    sifra int not null primary key auto_increment,
    nazivdj varchar(50),
    autor varchar(50),
    vrijednost decimal(18,2),
    izlozba int
);

# vanjski ključ 
alter table djelo add foreign key (izlozba) references izlozba(sifra);


create table kustos(
    sifra int not null primary key auto_increment,
    iban char(35),
    oib char(11),
    imekustos varchar(50),
    prezimekustos varchar (50)
);

create table sponzor(
    sifra int not null primary key auto_increment,
    brojugovora varchar (20),
    imesponzora varchar(50),
    prezimesponzora varchar (50)
);