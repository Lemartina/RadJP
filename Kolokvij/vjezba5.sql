# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Administrator\Documents\GitHub\RadJP\RadJP\Kolokvij\vjezba5.sql

drop database if exists vjezba5;
create database vjezba5;
use vjezba5;

create table cura(
    sifra int not null primary key auto_increment,
    carape varchar(41) not null,
    maraka decimal(17,10) not null,
    asocijalno bit, 
    vesta varchar(47) not null
);

create table svekar(
    sifra int not null primary key auto_increment,
    bojakose varchar(33),
    majica varchar(31),
    carape varchar(31) not null,
    haljina varchar(43),
    narukvica int,
    eura decimal(14,5) not null
);

create table svekar_cura( 
    sifra int not null primary key auto_increment,
    svekar int not null,
    cura int not null
);

create table punac(
    sifra int not null primary key auto_increment,
    dukserica varchar (33),
    prviputa datetime not null,
    majica varchar(36),
    svekar int not null
 );

create table punica(
    sifra int not null primary key auto_increment,
    hlace varchar(43) not null,
    nausnica int not null,
    ogrlica int,
    vesta varchar(49) not null,
    modelnaocala varchar(31) not null,
    treciputa int not null,
    punac int not null
);

create table ostavljena (
    sifra int not null primary key auto_increment,
    majica varchar(33),
    ogrlica int not null,
    carape varchar(44),
    stilfrizura varchar(42),
    punica int not null
);

create table mladic(
    sifra int not null primary key auto_increment,
    kratkamajica varchar(48) not null,
    haljina varchar(30),
    asocijano bit,
    zarucnik int
);

create table zarucnik(
    sifra int not null primary key auto_increment,
    jmbag char (11),
    lipa decimal (12,8),
    indiferentno bit
);

alter table svekar_cura add foreign key (svekar) references svekar(sifra);
alter table svekar_cura add foreign key (cura) references cura(sifra);
alter table punac add foreign key (svekar) references svekar(sifra);
alter table punica add foreign key (punac) references punac(sifra);
alter table ostavljena add foreign key(punica) references punica(sifra);
alter table mladic add foreign key (zarucnik) references zarucnik(sifra);

insert  into cura(sifra, carape, maraka, asocijalno, vesta)
values
(null, 'debela', 20.05, 0, 'vunena'),
(null, 'prozirne', 289.05, 0, 'pamučna'),
(null, 'tanke', 4654.64, 0, 'lanena');



insert  into svekar(sifra, bojakose, majica, carape, haljina, narukvica, eura)
values
(null, 'plava','crvena', 'bozićne', 'plišana', 25, 30.05),
(null, 'crvena','zelena', 'jesenje', 'filc', 30, 89.05),
(null, 'crna','žuta', 'proljetne', 'poliester', 60, 30578.05);

insert into svekar_cura (sifra, svekar, cura)
values
(null, 1,1),
(null, 2,2),
(null, 3,3);


insert into punac (sifra, dukserica, prviputa, majica, svekar)
values
(null, 'crna', '2022-03-15 00:00:00', 'kratka', 1),
(null, 'plava', '2022-10-15 00:00:00', 'dugačka', 2),
(null, 'zelena', '2022-06-15 00:00:00', 'ljetna', 3);



insert into punac(sifra, dukserica, prviputa, majica, svekar)
values
(null, 'dugačka', '2022-03-25 00:00:00', 'crna',1),
(null, 'kratka', '2022-04-25 00:00:00', 'plava',3),
(null, 'tanka', '2022-07-25 00:00:00', 'žuta',2);

insert into punica (sifra, hlace, nausnica, ogrlica, vesta, modelnaocala, treciputa, punac)
values
(null,'dugačke',2, 3, 'debela', 'ray ban', '2022-02-15 00:00:00'  ,1),
(null,'kratke',6, 9, 'tanka', 'max mara', '2022-03-15 00:00:00' ,  2),
(null,'jeans',7, 3, 'debela', 'ray ban', '2022-04-15 00:00:00' ,  3);

insert into ostavljena(sifra, majica, ogrlica, carape,stilfrizura, punica)
values
(null, 'plava', 2, ' debele', 'duga plava', 1),
(null, 'žuta', 2, ' tanke', 'duga crna', 2),
(null, 'crvena', 2, ' debele', 'kratka plava', 3)
;

insert into zarucnik (sifra, jmbag, lipa, indiferentno)
values
(null, '13245678978', 30, 0),
(null, '56445646456',25, 0),
(null, '54654645454', 63,1);



insert into mladic (sifra, kratkamajica, haljina, asocijano, zarucnik)
values
(null, 'da', 'ne', 0, 1),
(null, 'ne', 'da', 1, 2),
(null, 'da', 'ne', 0, 3);


update mladic set haljina = 'Osijek' where sifra  in (1,2,3);
delete from ostavljena where ogrlica =17;
select majica from punac where prviputa is null;




select a.asocijalno , f.stilfrizura, e.nausnica
from cura a 
inner join svekar_cura b on a.sifra = b.cura
inner join svekar c on b.svekar =c.sifra 
inner join punac d on c.sifra=d.svekar
inner join punica e on d.sifra=e.punac
inner join ostavljena f on e.sifra=f.punica
where c.majica like '%ba%' order by e.nausnica;

select majica, carape from svekar;
