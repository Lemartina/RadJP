
# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Administrator\Documents\GitHub\RadJP\RadJP\zavrsniRad\djecjaIgraonica.sql
drop database if exists djecjaIgraonica;
create database djecjaIgraonica default charset utf8;
use djecjaIgraonica;

# rođendaonica, cjelodenvni boravaka, dvosatna igraonica
create table program(
    sifra int not null primary key auto_increment,
    naziv varchar (50),
    usluga int not null,
    grupa int not null
    
);
# vatrogasci, policajci, poliklnika , božićni paket, uskrsni paket, classic paket, dnevno čuvanje
create table usluga(
    sifra int not null primary key auto_increment,
    vrsta varchar (50),
    cijena decimal(18,2),
    jedinicaMjere int not null,
    zaposlenik int not null
);
# komad, paket, sat
create table jedinicaMjere(
    sifra int not null primary key auto_increment,
    naziv varchar (20)
);

# 0-4, 2-12, 9-15
create table grupa(
    sifra int not null primary key auto_increment,
    naziv varchar (20)
);


create table dijete(
    sifra int not null primary key auto_increment,
    ime varchar(20),
    prezime varchar(20), 
    imeRoditelja varchar(20),
    telefonRoditelja varchar (20),
    grupa int not null
);

create table posjeta(
    sifra int not null primary key auto_increment,
    datumVrijemeDolaska datetime,
    datumVrijemeOdlaska datetime,
    dijete int not null,
    grupa int not null,
    program int not null,
    usluga int not null
);



create table djelatnik(
    sifra int not null primary key auto_increment,
    ime varchar(20),
    prezime varchar (20),
    oib char(11),
    iban char(50),
    radnoMjesto varchar(50)
);

