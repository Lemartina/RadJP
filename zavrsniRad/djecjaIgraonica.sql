
# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Administrator\Documents\GitHub\RadJP\RadJP\zavrsniRad\djecjaIgraonica.sql
drop database if exists djecjaIgraonica;
create database djecjaIgraonica default charset utf8;
use djecjaIgraonica;

# rođendaonica, cjelodenvni boravak, dvosatna igraonica
create table program(
    sifra int not null primary key auto_increment,
    naziv varchar (50)
    
    
);
# vatrogasci, policajci, poliklnika , božićni paket, uskrsni paket, classic paket, dnevno čuvanje, vikend čuvanje
create table usluga(
    sifra int not null primary key auto_increment,
    vrsta varchar (50),
    cijena decimal(18,2),
    djelatnik int not null
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
    telefonRoditelja varchar (20)
    
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


# vanjski ključevi 

alter table posjeta add foreign key (dijete) references dijete(sifra);
alter table posjeta add foreign key (grupa) references grupa (sifra);
alter table posjeta add foreign key (program) references program (sifra);
alter table posjeta add foreign key (usluga) references usluga(sifra);
alter table usluga add foreign key (djelatnik) references djelatnik(sifra);