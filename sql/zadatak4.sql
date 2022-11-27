# ljestve (hash) je komentar i on se ne izvodi
# Izvođenje naredbi na serveru
# Otvoriti CMD
# Zaljepiti sljedeću naredbu bez prvoh hash znaka
# c:\xampp\mysql\bin\mysql -uroot < C:\Users\Administrator\Documents\GitHub\EdunovaJP27\SQL\zadatak4.sql


drop database if exists djecjivrtic;
create database djecjivrtic;
use djecjivrtic;

create table skupina(
    sifra int not null primary key auto_increment,
    naziv varchar(50), 
    cijena decimal(18,2),
    program  varchar(50)
    );

create table dijete(
    sifra int not null primary key auto_increment,
    ime varchar(20),
    prezime varchar(20),
    brojugovora varchar(15),
    skupina int,
    odgajateljica int
);

create table odgajateljica(
    sifra int not null primary key auto_increment,
    imeodg varchar(20),
    prezimeodg varchar(20),
    oib char(11),
    iban char(35),
    strucnasprema int
   
);

create table strucnasprema(
    sifra int not null primary key auto_increment,
    naziv varchar(20)
);

# vanjski ključevi
alter table dijete add foreign key (skupina) references skupina(sifra);
alter table dijete add foreign key (odgajateljica) references odgajateljica(sifra);
alter table odgajateljica add foreign key (strucnasprema) references strucnasprema(sifra);


#popunjavanje tablica

insert  into strucnasprema (sifra, naziv)
values
(null, 'VSS'),
(null, 'SSS'),
(null, 'VŠS');



insert into odgajateljica (sifra, imeodg, prezimeodg, oib, iban, strucnasprema)
values
(null, 'Iva', 'Ivić', 70359334978,'HR8424840081913429276', '1' ),
(null, 'Petra', 'Pertić', 07928222303,'HR2624840088739258725', '1' ),
(null, 'Marija', 'Marić', 49289914637,'HR3324840082999362945', '1' ),
(null, 'Marko ', 'Marković', 67057213295,'HR6723600008379656892', '1' );

insert into skupina (sifra, naziv, cijena, program)
values
( null, 'Bubamare', '500.00', 'Cjelodnevni'),
(null, 'Ribice', '600.00', 'Cjelodenvni'),
(null, 'Žabice', '550.00', 'Cjelodnevni'),
(null, 'Ježići', '450', ' Cjelodnevni');
insert into dijete(sifra, ime, prezime, brojugovora, skupina, odgajateljica)
values
(null, 'Luka', 'Ivić', '22/001', 1, 1),
(null, 'Luka', 'Ivić', '22/002', 1, 1),
(null, 'Luka', 'Ivić', '22/003', 2, 3),
(null, 'Luka', 'Ivić', '22/004', 2, 3),
(null, 'Luka', 'Ivić', '22/005', 3, 4),
(null, 'Luka', 'Ivić', '22/006', 3, 4),
(null, 'Luka', 'Ivić', '22/007', 4, 2),
(null, 'Luka', 'Ivić', '22/008', 4, 2),
(null, 'Luka', 'Ivić', '22/009', 4, 2),
(null, 'Luka', 'Ivić', '22/010', 4, 2);

update dijete set ime='Petar' where sifra=2;
update dijete set ime='Ivor' where sifra=3;
update dijete set ime='Ana' where sifra=4;
update dijete set ime='Jurica' where sifra=5;
update dijete set ime='Ivana' where sifra=6;
update dijete set ime='Maja' where sifra=7;
update dijete set ime='Sara' where sifra=8;
update dijete set ime='Iris' where sifra=9;

update dijete set prezime='Marković' where sifra=2;
update dijete set prezime='Horvat' where sifra=3;
update dijete set prezime='Jurić' where sifra=4;
update dijete set prezime='Tekvavčić' where sifra=5;
update dijete set prezime='Majiž' where sifra=6;
update dijete set prezime='Norković' where sifra=7;
update dijete set prezime='Jedvaj' where sifra=8;
update dijete set prezime='Dodig' where sifra=9;
update dijete set prezime='Horvat' where sifra=10;