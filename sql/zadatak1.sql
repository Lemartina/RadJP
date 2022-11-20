# C:\xampp\mysql\bin>mysql -uroot < C:\Users\Administrator\Documents\GitHub\EdunovaJP27\SQL\zadatak1.sql


drop database if exists frizerskisalon;
create database frizerskisalon;
use frizerskisalon;

create table djelatnica(
    sifra int not null primary key auto_increment,
    ime varchar(20),
    prezime varchar(20),
    iban char(35)
);

create table korisnik(
    sifra int not null primary key auto_increment,
    spol boolean,
    dob int,
    duzina decimal(18,2)
);

create table usluga(
    sifra int not null primary key auto_increment,
    naziv varchar(50),
    trajanje time,
    cijena decimal(18,2)
);



create table posjeta(
    sifra int not null primary key auto_increment,
    korisnik int,
    vrijeme datetime,
    djelatnica int,
    usluga int
);

# vanjski ključevi

alter table posjeta add foreign key(korisnik) references korisnik(sifra);
alter table posjeta add foreign key(djelatnica) references djelatnica (sifra);
alter table posjeta add foreign key(usluga) references usluga (sifra);

