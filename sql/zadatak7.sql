# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Administrator\Documents\GitHub\RadJP\RadJP\sql\zadatak7.sql


drop database if exists taxi;
create database taxi default charset utf8;
use taxi;

create table vozilo(
    sifra int not null primary key auto_increment,
    redistracija varchar(10),
    maxmjesta char(2),
    vozac int

);

create table vozac(
    sifra int not null primary key auto_increment,
    ime varchar(20),
    prezime varchar(20),
    iban char(50)
);

create table putnik(
    sifra int not null primary key auto_increment,
    dob char (2),
    lokacija varchar(20),
    vozac int
);


create table voznja(
    sifra int not null primary key auto_increment,
    trajanje time,
    cijena decimal(18,2),
    vrijemedataum  datetime,
    putnik int
);