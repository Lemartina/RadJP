# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Administrator\Documents\GitHub\RadJP\RadJP\Kolokvij\vjezba4.sql

drop database if exists vjezba4;
create database vjezba4;
use vjezba4;

# 0 tablice i Venezia

create table punac(
    sifra int not null primary key auto_increment,
    treciputa datetime,
    majica varchar (46),
    jmbag char(11) not null,
    novcica decimal (18,7) not null,
    maraka decimal(12,6) not null,
    ostavljen int not null
);

create table ostavljen(
    sifra int not null primary key auto_increment, 
    modelnaocala varchar(43),
    introvertno bit,
     kuna decima(14,10)
);

create table snasa(
    sifra int not null primary key auto_increment,
    introvertno bit, 
    treciputa datetime,
    haljina varchar(44) not null,
    zena int not null
);

create table becar(
    sifra int not null primary key auto_increment,
    novcica decimal(14,8),
    kratkamajica varchar(48) not null,
    bojaociju varchar(36),
    snasa int not null
);

create table prijatelj(
    sifa int not null primary key auto_increment,
    eura decimal(16,9),
    prstene int not null, 
    gustoca decimal(16,5),
    jmbag cher (11) not null,
    suknja varchar(47) not null,
    becar int not null
);

create table zena(
    sifra int not null primary key auto_increment,
    suknja varchar(39) not null,
    lipa decimal(18,7),
    prstena  itn not null
    );

    create table zena_mladic (
        sifra int not null primary key,
        zena int not null,
        mladic int not null
    );





    