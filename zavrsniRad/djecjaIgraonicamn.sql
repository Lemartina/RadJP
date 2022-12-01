
# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Administrator\Documents\GitHub\RadJP\RadJP\zavrsniRad\djecjaIgraonicamn.sql
drop database if exists djecjaIgraonica;
create database djecjaIgraonica default charset utf8;
use djecjaIgraonica;

    
    

# vatrogasci, policajci, poliklnika , božićni paket, uskrsni paket, classic paket, dnevno čuvanje, vikend čuvanje
create table usluga(
    sifra int not null primary key auto_increment,
    naziv varchar (50),
    cijena decimal(18,2),
    jeidnicaMjere int not null,
    kolicina decimal(18,2)
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
    djelatnik int
    
);

create table posjetaUsluga(
    posjeta int,
    usluga int
);

create table posjetaDijete(
	posjeta int,
	dijete int
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

alter table posjeta add foreign key (djelatnik) references djelatnik(sifra);
alter table posjetaDijete add foreign key (posjeta) references posjeta(sifra);
alter table posjetaDijete add foreign key (dijete) references dijete(sifra);
alter table posjetaUsluga add foreign key (posjeta) references posjeta (sifra);
alter table posjetaUsluga add foreign key (usluga) references usluga(sifra);


# koje dijete koristi koju uslugu

select ime.a, prezime.a, naziv.e
from dijete a 
inner join posjetadijete b on a.sifra=b.dijete 
inner join posjeta c on b.posjeta=c.sifra 
inner join posjetausluga d on c.sifra=d.posjeta 
inner join usluga e on d.usluga=e.sifra;