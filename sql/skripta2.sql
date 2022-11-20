# C:\xampp\mysql>bin\mysql -uroot < C:\Users\Administrator\Documents\GitHub\EdunovaJP27\SQL\skripta2.sql

drop database if exists samouprava2;
create database samouprava2;
use samouprava2;

create table zupanija(
    sifra int not null primary key auto_increment,
    naziv varchar(50),
    zupan int

);

create table zupan(
    sifra int not null primary key auto_increment,
    ime varchar(20),
    prezime varchar(20)
);

# vanjski ključ
alter table zupanija add foreign key (zupan) references zupan(sifra);

create table opcina(
    sifra int not null primary key auto_increment,
    zupanija int,
    nazivop varchar(20)
);

# vanjski ključ
alter table opcina add foreign key (zupanija) references zupanija (sifra);

create table mjesto(
    sifra int not null primary key auto_increment,
    opcina int,
    nazivmj varchar(20)
);

# vanjski ključ
alter table mjesto add foreign key (opcina) references opcina(sifra);