# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Administrator\Documents\GitHub\RadJP\RadJP\sql\zadatak7.sql

# Baza
drop database if exists taxi;
create database taxi default charset utf8;
use taxi;


# Tablice
create table vozilo(
    sifra int not null primary key auto_increment,
    registracija varchar(10),
    maxmjesta char(2),
    autosjedalica boolean,
    invalid boolean,
    vozac int

);

create table vozac(
    sifra int not null primary key auto_increment,
    ime varchar(20),
    prezime varchar(20),
    iban char(50)
);

create table putnik(
    sifra int not null primary key auto_increment,
    dob char (2),
    lokacija varchar(20),
    vrijemedolaska time,
    vozac int
);


create table voznja(
    sifra int not null primary key auto_increment,
    trajanje time,
    cijena decimal(18,2),
    vrijemedataum datetime,
    putnik int, 
    vozilo int,
    vozac int
    
);

# Vanjski ključevi

alter table vozilo add foreign key ( vozac) references vozac(sifra);
alter table putnik add foreign key (vozac) references vozac (sifra);
alter table voznja add foreign key (putnik) references putnik (sifra);
alter table voznja add foreign key (vozilo) references vozilo (sifra);
alter table voznja add foreign key (vozac) references vozac (sifra);


# Popunjavanje tablica

insert into putnik (sifra, dob, lokacija, vrijemedolaska, vozac)
values 
(null, 'dijete', 'Svete Ane 17 Osijek', '18:00:00', '1'),
(null, 'odrasla osoba', 'Ivana Mažurainića 17 Osijek', '2'),
(null, 'dijete', 'Petra Preradovoća 3 Tenja', '2'),
(null, 'dijete', 'A. Waldingera 45 Osijek', '3')
;


