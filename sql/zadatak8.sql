# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Administrator\Documents\GitHub\RadJP\RadJP\sql\zadatak8.sql
drop database if exists postolar;
create database postolar;
use postolar;

create table korsinik (
    sifra int not null primary key auto_increment,
    spol varchar(1),
    telefon varchar (20),
    obuca int not null
);

create table obuca(
    sifra int not null primary key auto_increment,
    vrstaobuce varchar(50),
    broj char (2),
    popravak int not null
);

create table popravak(
    sifra int not null primary key auto_increment,
    naziv varchar(20),
    trajanje time,
    cijena decimal(18,2),
    segrt int not null
);

create table segrt(
    sifra int not null primary key auto_increment,
    ime varchar (20),
    prezime varchar (20),
    oib char(11),
    iban char (50),
    postolar int not null
);

#vanjski ključevi

alter table korsinik add foreign key (obuca) references obuca(sifra);
alter table obuca add foreign key (popravak) references popravak (sifra);
alter table segrt add foreign key (postolar) references segrt (sifra);
alter table popravak add foreign key (segrt) references segrt (sifra);


# popunjavanje tablica

insert into segrt (sifra, ime , prezime, oib, iban, postolar)
values 
(null, 'Marko', 'Petrović', '91586276972' , 'HR2523600006362943549',1),
(null, 'Ivan', 'Ivković', '82707513398' , 'HR8625000092362517514',2);

insert into popravak (sifra, naziv , trajanje, cijena, segrt)
values 
(null, 'bojanje', '01:00:00', '500.00', 1),
(null, 'zamjena potpetice', '00:45:00', '150.00', 1),
(null, 'zamjena potpetice', '00:45:00', '150.00', 2);

insert into popravak (sifra, naziv , trajanje, cijena, segrt)
values 
(null, 'bojanje', '01:00:00', '500.00', 1),
(null, 'zamjena potpetice', '00:45:00', '150.00', 1),
(null, 'zamjena potpetice', '00:45:00', '150.00', 2);

insert into popravak (sifra, naziv , trajanje, cijena, segrt)
values 
(null, 'bojanje', '01:00:00', '500.00', 1),
(null, 'zamjena potpetice', '00:45:00', '150.00', 1),
(null, 'zamjena potpetice', '00:45:00', '150.00', 2);

