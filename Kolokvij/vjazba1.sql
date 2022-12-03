# početak 23:11 H -23:47 H, 9:43 h-10:31h 

# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Administrator\Documents\GitHub\RadJP\RadJP\Kolokvij\vjazba1.sql

# 0
drop database if exists vjezba1;
create database vjezba1;
use vjezba1;


create table sestra(
    sifra int not null PRIMARY key auto_increment,
    introvertno bit,
    haljina varchar(31) not null,
    maraka decimal(16,6),
    hlace varchar(46) not null,
    narukvica int not null
);


create table zena(
    sifra int not null PRIMARY key auto_increment,
    treciputa datetime,
    hlace varchar(46),
    kratkamajica varchar(31) not null,
    jmbag char(11) not null,
    bojaociju varchar(39) not null,
    haljina varchar(44),
    sestra int

);

create table muskarac(
    sifra int not null primary key auto_increment,
    bojaociju varchar(50) not null,
    hlace varchar(30),
    modelnaocala varchar(43),
    marka decimal(14,5) not null,
    zena int not null
);

create table mladic(
    sifra int not null primary key auto_increment,
    suknja varchar(50) not null,
    kuna decimal(16,8) not null,
    drugiputa datetime,
    asocijalno bit,
    ekstroverntno bit not null,
    dukserica varchar(48) not null,
    muskarac int 
);

create table svekar(
    sifra int not null primary key auto_increment,
    bojaociju varchar(40) not null,
    prstena int,
    dukserica varchar(41),
    lipa decimal(13,8),
    eura decimal(12,7),
    majica varchar(35)
);

create table sestra_svekrar(
    sifra int not null primary key auto_increment,
    sestra int not null,
    svekar int not null
);

create table punac(
    sifra int not null primary key auto_increment,
    ogrlica int,
    gustoca decimal(14,9),
    hlace varchar(41) not null
);


create table cura(
    sifra int not null primary key auto_increment,
    novcica decimal(16,5) not null,
    gustoca decimal (18,6) not null,
    lipa decimal (13,10),
    ogrlica int not null,
    bojakose varchar(38),
    suknja varchar(36),
    punac int
);


alter table zena add foreign key(sestra) references sestra(sifra);
alter table muskarac add foreign key(zena) references zena(sifra);
alter table mladic add foreign key (muskarac) references muskarac(sifra);
alter table sestra_svekrar add foreign key (sestra) references sestra(sifra);
alter table sestra_svekrar add foreign key (svekar) references svekar(sifra);
alter table cura add foreign key (punac) references punac (sifra);


# 1 popunjavanje tablica

insert into svekar (sifra, bojaociju, prstena, dukserica, lipa, eura, majica)
values 
(null, 'plava', null, null, null, null, null),
(null, 'smeđa', null, null, null, null, null),
(null, 'plava', null, null, null, null, null);

insert into sestra (sifra, introvertno, haljina, maraka, hlace, narukvica)
values
(null, null, 'žuta na plave točkice', null, 'crvene', 'zlatna'),
(null, null, 'crvena', null, 'plava', 'srebrna'),
(null, null, 'ružičasta', null, 'crvena', 'zlatna');

insert into sestra_svekrar (sifra, sestra, svekar)
values 
(null, 1,1),
(null, 2,2),
(null, 3,3);

insert into zena(sifra, treciputa, hlace, kratkamajica, jmbag, bojaociju, haljina, sestra)
values
(null, null, null, 'crvena', '12345678910', 'zelena', null,1),
(null, null, null, 'žuta', '23569874556', 'ljubičasta', null,2),
(null, null, null, 'crna', '98452365789', 'narančasta', null,3);

insert into muskarac(sifra, bojaociju , hlace, modelnaocala,marka,zena)
values
(null, 'smeđa', null, null, 'rayban', 2),
(null, 'plava', null, null, 'maxmara', 1),
(null, 'plava', null, null, 'rayban', 3);


alter table cura modify column gustoca decimal(18,2) not null;


insert into cura (sifra, novcica, gustoca, lipa, ogrlica, bojakose, suknja, punac)
values
(null,20,15.77, null,23,null, null, 2),
(null,25,15.77, null,254,null, null, 3),
(null,30,15.77, null,45,null, null, 1);


insert into punac(sifra, ogrlica, gustoca, hlace)
values 
(null, null,null, 'crna'),
(null, null,null, 'plava'),
(null, null,null, 'crvena');

insert into mladic(sifra, suknja, kuna, drugiputa, asocijalno, ekstroverntno, dukserica, muskarac)
values
(null, 'crvena', 23.56, null, null, 4, 'plava', 3),
(null, 'zelena', 10.56, null, null, 456, 'žuta', 2),
(null, 'žuta', 40.56, null, null, 56, 'bijela', 1);

# 3
delete from mladic where kuna > 15.78;

#4
select 
kratkamajica from zena 
where hlace like '%ana%';

# 5
select f.dukserica, a.asocijalno, b.hlace
from mladic a 
inner join muskarac b on a.muskarac=b.sifra
inner join zena c on b.zena=c.sifra 
inner join sestra d on c.sestra=d.sifra 
inner join sestra_svekrar e on e.sestra=d.sifra 
inner join svekar f on e.svekar=f.sifra 
where
c.hlace like 'a%' and
d.haljina like '%ba%'
order by b.hlace;

# 6
select haljina, maraka from sestra;