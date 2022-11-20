# C:\xampp\mysql\bin\mysql -uroot < C:\Users\Administrator\Documents\GitHub\EdunovaJP27\SQL\skripta5.sql


drop database if exists firma;
 create database firma;
 use firma;

 create table projekt(
    sifra int not null primary key auto_increment,
    naziv varchar(50),
    cijena decimal(18,2)
 );

 create table programer(
    sifra int not null primary key auto_increment,
    ime varchar(50),
    prezime varchar(50),
    datumrodjenja datetime,
    placa decimal(18,2)
 );

create table sudjeluje(
    projekt int,
    programer int,
    datumpocetka datetime,
    datumkraja datetime
);

# vanjski ključevi

alter table sudjeluje add foreign key (projekt) references projekt(sifra);
alter table sudjeluje add foreign key (programer) references programer(sifra);
