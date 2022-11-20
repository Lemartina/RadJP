# C:\xampp\mysql>bin\mysql -uroot < C:\Users\Administrator\Documents\GitHub\EdunovaJP27\SQL\zadatak3.sql

drop database if exists udruga;
create database udruga;
use udruga;

create table osoba(
    sifra int not null primary key auto_increment,
    ime varchar(20),
    prezime varchar(20),
    telefon int
);

create table sticenik(
    sifra int not null primary key auto_increment,
    vrstazivotinje varchar(50),
    vrstahrane varchar(50),
    tezina decimal(18,2),
    visina decimal(18,2),
    osoba int,
    prostor int
);

create table prostor(
    sifra int not null primary key auto_increment,
    visina decimal(18,2),
    sirina decimal(18,2),
    dubina decimal(18,2)
);

# vanjski ključevi

alter table sticenik add foreign key (osoba) references osoba(sifra);
alter table sticenik add foreign key (prostor) references prostor(sifra);