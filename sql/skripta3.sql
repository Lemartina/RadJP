# C:\xampp\mysql\bin\mysql -uroot < C:\Users\Administrator\Documents\GitHub\EdunovaJP27\SQL\skripta3.sql

create database jplrs;
use jplrs;
create table zupanija(
    sifra int not null primary key auto_increment,
    naziv varchar(50),
    zupan varchar(50)
);

create table opcina(
    sifra int not null primary key auto_increment,
    zupanija int,
    nazivop varchar(50)
);

#vanjski ključ

alter table opcina add foreign key (zupanija) references zupanija(sifra);