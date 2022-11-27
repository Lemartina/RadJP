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
    invalid boolean

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
    vrijemedolaska time
);


create table voznja(
    sifra int not null primary key auto_increment,
    trajanje time,
    cijena decimal(18,2),
    vozac int, 
    vozilo int
    
);


create table voznja_putnik (
    voznja int,
    putnik int
    
    );


# 

alter table voznja add foreign key (vozac) references vozac (sifra);
alter  table voznja add foreign key (vozilo) references vozilo (sifra);
alter table voznja_putnik add foreign key (voznja) references voznja (sifra);
alter table voznja_putnik add foreign key (putnik ) references putnik(sifra);


 insert into vozac(sifra, ime, prezime, iban)
 values 
 (null, 'Pero', 'Perić','HR7923400097722248444'),
 (null, 'Marko', 'Marković','HR4023400098719311467'),
 (null, 'Janko', 'Janković','HR4325000094474277255'),
 (null, 'Đuro', 'Đurić','HR3523600002161521453'),
 (null, 'Maja', 'Perić','HR2023400096162643833');

insert into vozilo 
(sifra, registracija, maxmjesta, autosjedalica, invalid)
values
(null, 'OS-123-NA', 4, 'da', 'da'),
(null, 'OS-236-DL', 7, 'da', 'da'),
(null, 'OS-565-NL', 4, 'ne', 'ne'),
(null, 'OS-987-JF', 7, 'da', 'da'),
(null, 'OS-582-TL', 4, 'ne', 'da');

insert into putnik 
(sifra, dob, lokacija, vrijemedolaska)
values 
(null, 'dijete', 'Svete Ane 17 Osijek', '18:00:00'),
(null, 'odrasla osoba', 'Ivana Mažurainića 17 Osijek', '21:00:00'),
(null, 'dijete', 'Petra Preradovoća 3 Tenja', '16:20'),
(null, 'dijete', 'A. Waldingera 45 Osijek', '14:00:00'),
(null, 'odrasla osoba', 'Svete Ane 17 Osijek', '18:00:00'),
(null, 'odrasla osoba', 'Petra Preradovoća 3 Tenja', '16:20'),
(null, 'odrasla osoba', 'A. Waldingera 45 Osijek', '14:00:00')
;

insert into voznja (sifra, trajanje, cijena, vozilo, vozac)
values
(null, '0:30', '100.00',  1,1),
(null, '0:30', '100.00', 1,1),
(null, '0:15', '50.00', 2,2),
(null, '0:15', '50.00',  2,2),
(null, '0:05', '16.65', 2,2),
(null, '0:25', '83.25',  3,3),
(null, '0:25', '83.250', 3,3);