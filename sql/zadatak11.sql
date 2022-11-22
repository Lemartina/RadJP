# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Administrator\Documents\GitHub\RadJP\RadJP\sql\zadatak11.sql

drop database if exists fakultet;
create database fakultet  default charset utf8;;
use fakultet;

create table student(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    brojugovora varchar (20)

);

create table kolegij(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    bodovi char(3),
    trajanje time
);

create table rok(
    sifra int not null primary key auto_increment,
    nazivroka varchar (20),
    datum date,
    vrijeme time,
    kolegij int not null
);

create table polaznicikolegija(
    student int not null,
    kolegij int not null
);


# vanjski ključevi

alter table rok add foreign key (kolegij) references kolegij (sifra);
alter table polaznicikolegija add foreign key (student) references student (sifra);
alter table polaznicikolegija add foreign key (kolegij) references kolegij (sifra);


# unos u tablice

insert into kolegij
(sifra, naziv, bodovi, trajanje)
values 
(null, 'Poduzetništvo', 30, '20:00:00'),
(null, 'Statistika', 40, null),
(null, 'Informatika', 50, null),
(null, 'Bankarstvo', null, null),
(null, 'Računovodstvo', 100, null)
;


insert into rok (sifra, nazivroka, datum, vrijeme, kolegij)
values
(null, 'zimski', '2022-10-01', '15:00:00', 5),
(null, null, null, null, 4),
(null, 'zimski', '2022-11-10', '15:00:00', 3),
(null, null, null, null, 2),
(null, 'ljetni', '2023-08-08', '13:00:00', 1);

insert into rok (sifra, nazivroka, datum, vrijeme, kolegij)
values
(null, 'ljetni', '2022-07-01', null, 5),
(null, null, null, null, 4),
(null, 'ljetni', '2022-11-10', null, 3),
(null, null, null, null, 2),
(null, 'zimski', '2022-10-08', '13:00:00', 1);

insert into student(sifra, ime, prezime, brojugovora)
values 
(null, 'Marko', 'Marković', '2022/1235-1'),
(null, 'ivan', 'Ivić', null),
(null, 'Jakob', 'Ivković', null),
(null, 'Petar', 'Majdić', null),
(null, 'Maja', 'Horvat', '2022/456-1'),
(null, 'Ivana', 'Marić', '2011/1598-1'),
(null, 'Ana', 'Matić','2019/1254635-1'),
(null, 'Janko', 'Perić', '2022/54-1'),
(null, 'Marko', 'Jakobović', '2022/545-1'),
(null, 'Petar', 'Marković', '2021/588-1');

# 1. prijava
insert into polaznicikolegija (student, kolegij)
values
(10, 5),
(10, 4),
(10, 3),
(10, 2),
(10, 1),
(9, 4),
(9, 2),
(8, 5),
(8, 3),
(8, 1),
(7, 1),
(7, 2),
(7, 3),
(6, 5),
(6, 4),
(6, 1),
(6, 2),
(6, 3),
(5, 5),
(4, 5),
(3, 5),
(2, 5),
(1, 1),
(1, 4),
(1, 5);


# 2. prijava
insert into polaznicikolegija (student, kolegij)
values
(10, 5),
(10, 4),
(9, 2),
(8, 5),
(8, 3),
(8, 1),
(7, 1),
(7, 2),
(7, 3),
(6, 5),
(2, 5),
(1, 1),
(1, 4),
(1, 5);