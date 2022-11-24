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
    nazivroka varchar (20) not null,
    datum date not null,
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




# ispravci
# dodavanje naziva roka nije bilo not null

update rok set 
nazivroka= 'zimski'
where sifra in (4,7,9);

update rok set 
datum= '2023-01-26'
where sifra=2 ;


update rok set 
datum= '2023-02-26'
where sifra=4 ;


update rok set 
datum= '2022-12-22'
where sifra=7 ;


update rok set 
datum= '2023-01-15'
where sifra=9 ;

# dodavanje više rokova po pojedinom kolegiju
insert into rok(sifra, nazivroka, datum, vrijeme, kolegij)
values
(null, 'zimski','2022-11-3', null, 5),
(null, 'zimski','2022-12-4', null, 5),
(null, 'ljetni','2022-08-16', null, 5);


insert into rok(sifra, nazivroka, datum, vrijeme, kolegij)
values
(null, 'zimski','2022-11-3', null, 4),
(null, 'ljetni','2023-03-4', null, 4),
(null, 'ljetni','2023-02-16', null, 4);



insert into rok(sifra, nazivroka, datum, vrijeme, kolegij)
values
(null, 'zimski','2022-10-4', '09:00:00', 1),
(null, 'ljetni','2023-07-6', null, 1),
(null, 'ljetni','2023-08-18', null, 1);

update rok set datum='2023-08-12' where sifra =8;

delete from polaznicikolegija;

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

create table prijavanarok
(sifra int not null primary key auto_increment,
prijava boolean,
rok int);

alter table prijavanarok add foreign key (rok) references rok(sifra);



#ispravci 

update rok set 
nazivroka = 'zimski'
where sifra = 2;

alter table prijavanarok add column student int;

alter table prijavanarok add foreign key (student) references student(sifra);

alter table prijavanarok drop column prijava;

insert into prijavanarok (sifra, rok, student)
values
(null, 1, 1),
(null, 11, 1),
(null, 12, 1),
(null, 2, 1),
(null, 7, 1),
(null, 14, 1),
(null, 4, 1),
(null, 10, 1),
(null, 5, 1),
(null, 18, 1),
(null, 1, 1),
(null, 8, 1),
(null, 15, 1),
(null, 13, 1);