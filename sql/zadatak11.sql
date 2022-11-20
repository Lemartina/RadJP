drop database if exists fakultet;
create database fakultet;
use fakultet;

create table student(
    sifra int not null primary key auto_increment,
    ime varchar(50),
    prezime varchar(50),
    brojugovora varchar (10)

);

create table kolegij(
    sifra int not null primary key auto_increment,
    naziv varchar(50),
    bodovi char(3),
    trajanje time,
    student int
);

create table rok(
    sifra int not null primary key auto_increment,
    nazivroka varchar (20),
    datum date,
    vrijeme time,
    kolegij int
);

# vanjski ključevi

alter table rok add foreign key (kolegij) references kolegij (sifra);
alter table kolegij add foreign key (student) references student(sifra);