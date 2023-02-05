
# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Administrator\Documents\GitHub\RadJP\RadJP\zavrsniRad\djecjaIgraonicamn.sql
drop database if exists djecjaIgraonica;
create database djecjaIgraonica default charset utf8;
use djecjaIgraonica;

    
    

# vatrogasci, policajci, poliklnika , božićni paket, uskrsni paket, classic paket, dnevno čuvanje, vikend čuvanje
create table usluga(
    sifra int not null primary key auto_increment,
    naziv varchar (50),
    cijena decimal(18,2),
    jednicaMjere varchar(10),
    kolicina decimal(18,2)
);


create table dijete(
    sifra int not null primary key auto_increment,
    ime varchar(20),
    prezime varchar(20), 
    imeRoditelja varchar(20),
    telefonRoditelja varchar(20)

    
);

create table posjeta(
    sifra int not null primary key auto_increment,
    datumVrijemeDolaska datetime,
    datumVrijemeOdlaska datetime,
    napomena varchar(500),
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

select a.ime, a.prezime, e.naziv
from dijete a 
inner join posjetadijete b on a.sifra=b.dijete 
inner join posjeta c on b.posjeta=c.sifra 
inner join posjetausluga d on c.sifra=d.posjeta 
inner join usluga e on d.usluga=e.sifra;

# popunajanje tablica 

insert into dijete (sifra, ime, prezime, imeRoditelja, telefonRoditelja)
values
(null, 'Marko', 'Marković', 'Ivana', '091/236-5236'),
(null, 'Luka', 'Ivanković', 'Marija', '097/125-5246'),
(null, 'Josipa', 'Josipović', 'Gabrijel', '098/259-3265');


insert into djelatnik (sifra, ime, prezime, oib, iban, radnoMjesto)
values
(null, 'Ivana', 'Ivković', 93197060481, 'HR7325000098193449454', 'animator' ),
(null, 'Marina', 'Marković', 26403646008, 'HR5723400095351463692', 'teta čuvalica' ),
(null, 'Petar', 'Marinić', 81890337429, 'HR3923600008751454128', 'animator' );

insert into usluga(sifra, naziv, cijena, jeidnicaMjere, kolicina)
values
(null, 'Rođendan', '750.00', 'sat', 5),
(null, 'Dnevno čuvanje', '250.00', 'sat', 1),
(null, 'Tiskanje pozivnica', '10.00', 'kom', 1),
(null, 'Torta', '500.00', 'kom', 1),
(null, 'Umjetnička radionica', '100.00', 'sat', 2);

insert into posjeta(sifra, datumVrijemeDolaska, datumVrijemeOdlaska, djelatnik)
values
(null, '2022-05-01 13:00:00', '2022-05-01 14:00:00',2),
(null, '2022-06-01 14:00:00', '2022-05-01 19:00:00',1),
(null, '2022-07-01 09:00:00', '2022-05-01 11:00:00',3);

insert into posjetadijete (posjeta, dijete)
values
(1,1),
(2,2),
(3,3);

insert into posjetausluga (posjeta, usluga)
values
(1,2),
(2,1),
(3,5);