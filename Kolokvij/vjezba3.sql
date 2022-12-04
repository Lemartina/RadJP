# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Administrator\Documents\GitHub\RadJP\RadJP\Kolokvij\vjezba3.sql

drop database if exists vjezba3;
create database vjezba3;
use vjezba3;

# 0

create table svekar(
    sifra int not null primary key auto_increment,
    novcica decimal(16,8) not null,
    suknja varchar(44) not null,
    bojakose varchar(36),
    prstena int,
    narukvica int not null,
    cura int not null

);


create table cura(
    sifra int not null primary key auto_increment,
    dukserica varchar (49),
    maraka decimal(13,7),
    drugiputa datetime,
    majica varchar(49),
    novcica decimal(15,8),
    ogrlica int not null
);



create table punica(
    sifra int not null primary key auto_increment,
    asocijalno bit, 
    kratkamajica varchar(44),
    kuna decimal(13,8) not null,
    vesta varchar(32) not null,
    snasa int
);

create table snasa(
    sifra int not null primary key auto_increment,
    introvertno bit,
    kuna decimal(15,6) not null,
    eura decimal(12,9) not null,
    treciputa datetime,
    ostavljena int
);

create table ostavljena(
    sifra int not null primary key auto_increment,
    kuna decimal(17,5),
    lipa decimal(15,6),
    majica varchar(36),
    modelnaocala varchar(31) not null,
    prijatelj int
);


create table prijatelj(
    sifra int not null primary key auto_increment,
    kuna decimal(16,10),
    haljina varchar (37),
    lipa decimal (13,10),
    dukserica varchar(31),
    indiferentno bit not null
);


create table prijatelj_brat(
    sifra int not null primary key auto_increment,
    prijatelj int not null,
    brat int not null
);

create table brat(
    sifra int not null primary key auto_increment,
    jmbag char(11),
    ogrlica int not null,
    ekstroverntno bit not null
);

# vanjski ključevi


alter table svekar add foreign key (cura) references cura (sifra);
alter table prijatelj_brat add foreign key (prijatelj) references prijatelj(sifra);
alter table prijatelj_brat add foreign key (brat) references brat (sifra);
alter table ostavljena add foreign key (prijatelj) references prijatelj(sifra);
alter table snasa add foreign key (ostavljena) references ostavljena(sifra);
alter table punica add foreign key (snasa) references snasa(sifra);


# 1

insert into cura (sifra, dukserica, maraka, drugiputa, majica, novcica, ogrlica)
values
(null, 'crvena', 45, '2022-05-13 00:00:00', 'prugasta', 69, 56 ),
(null, 'crvena', 56, '2022-06-13 00:00:00', 'tičkasta', 6, 651 ),
(null, 'crvena', 23, '2022-07-13 00:00:00', 'debela', 6546, 54 );

insert into svekar (sifra, novcica, suknja, bojakose, prstena, narukvica, cura)
values
(null, 20.5, 'plava', 'plava', 5656, 5, 1),
(null, 20.5, 'crvena', 'plava', 554656, 6, 2),
(null, 20.5, 'žuta', 'plava', 554, 3, 3);


insert into brat( sifra, jmbag, ogrlica, ekstroverntno)
values
(null, null, 55, 1),
(null, null, 23, 0),
(null, null, 65, 1);

insert into prijatelj (sifra, kuna, haljina, lipa, dukserica, indiferentno)
values
(null, null, null, null, null, 1),
(null, null, null, null, null, 0),
(null, null, null, null, null, 1);


insert into prijatelj_brat(sifra, prijatelj, brat)
values
(null, 1,1),
(null,2,2),
(null, 3,3);


insert into ostavljena  (sifra, kuna, lipa , majica , modelnaocala , prijatelj)
values
(null, null, null, null, 'prvi model', 1),
(null, null, null, null, 'drugi model', 2),
(null, null, null, null, 'treći model', 3);

insert into snasa(
sifra, introvertno, kuna, eura, treciputa, ostavljena)
values
(null, 0, 70.50, 10, null,1),
(null, 0, 140.50, 20, null,2),
(null, 0, 45.50, 5, null,3);

insert into punica (
sifra, asocijalno, kratkamajica, kuna, vesta, snasa)
values
(null, null, 'ab', 10, 'crvena',1),
(null, null, 'cd', 20, 'plava',2),
(null, null, 'ef', 5, 'žuta',3);




# 2
#update svekar set suknja='Osijek' where sifra in(1,2,3);

# 3
delete  from punica  where kratkamajica ='ab';


# 4


update ostavljena set lipa = 10 where sifra =1;
update ostavljena set lipa = 15 where sifra =2;
update ostavljena set lipa = 40 where sifra =3;
select * from ostavljena where lipa not in (9,10,20,30,35);

#5
select a.ekstroverntno , f.vesta, e.kuna
from brat a
inner join prijatelj_brat b on a.sifra=b.brat 
inner join prijatelj c  on b. prijatelj=c.sifra
inner join ostavljena d on c.sifra=d.prijatelj 
inner join snasa e  on d.sifra=e.ostavljena 
inner join punica f on e.sifra=f.snasa 
where 
d.lipa != 91 and c.haljina like '%ba%';

# 6

select haljina, lipa from prijatelj;