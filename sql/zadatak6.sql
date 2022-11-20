drop database if exists samostan;
create database samostan;
use samostan;

create table svecenik(
    sifra int not null primary key auto_increment,
    ime varchar(20),
    prezime varchar(20),
    iban char(35),
    nadredjeni int(11)
);

create table posao(
    sifra int not null primary key auto_increment,
    naziv varchar(50),
    trajanje time,
    vrsta varchar(50),
    svecenik int
);

# vanjski ključevi

alter table svecenik add foreign key (nadredjeni) references svecenik(sifra);
alter table posao add foreign key (svecenik) references svecenik(sifra);