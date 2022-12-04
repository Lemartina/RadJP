
# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Administrator\Documents\GitHub\RadJP\RadJP\Kolokvij\vjezba2.sql

drop database if exists vjezba2;
create database vjezba2;
use vjezba2;

create table brat(
    sifra int not null primary key auto_increment,
    suknja varchar(47),
    ogrlica int not null,
    asocijalno bit not null,
    neprijatelj int not null
);

create table neprijatelj(
    sifra int not null primary key auto_increment,
    majica varchar(32),
    haljina varchar(43) not null,
    lipa decimal(16,8),
    modelnaocala varchar (49) not null,
    kuna decimal(12,6) not null,
    jmbag char(11),
    cura int not null

);

create table cura(
    sifra int not null primary key auto_increment,
    haljina varchar (33) not null,
    drugiputa datetime not null,
    suknja varchar(38),
    narukvica int,
    introvertno bit,
    majica varchar(40) not null,
    decko int 
);

create table decko(
    sifra int not null primary key auto_increment,
    indiferentno bit,
    vesta varchar(34),
    asocijalno bit 
);


create table decko_zarucnica(
    sifra int not null primary key auto_increment,
    decko int not null,
    zarucnica int not null
);


create table zarucnica(
    sifra int not null primary key auto_increment,
    narukvica int,
    bojakose varchar(37) not null,
    novcica decimal(15,9),
    lipa decimal (15,8) not null,
    indiferentno bit not null
);


create table prijatelj(
    sifra int not null primary key auto_increment,
    modelnaocala varchar(37),
    treciputa datetime not null,
    ekstroverntno bit not null,
    prviputa datetime,
    svekar int not null

);


create table svekar(
    sifra int not null primary key auto_increment,
    stilfrizura varchar(48),
    ogrlica int not null,
    asocijalno bit not null
);


# vanjski ključevi

alter table brat add foreign key(neprijatelj) references neprijatelj(sifra);
alter table neprijatelj add foreign key (cura) references cura(sifra);
alter table cura add foreign key (decko) references decko(sifra);
alter table decko_zarucnica add foreign key (decko) references decko(sifra);
alter table decko_zarucnica add foreign key (zarucnica) references zarucnica (sifra);
alter table prijatelj add foreign key (svekar) references svekar(sifra);

# unos u tablice

insert into zarucnica (sifra, narukvica, bojakose, novcica, lipa, indiferentno)
values
(null, 23, 'plava', 15.3, 153.00, 0),
(null, 50, 'crna', 20.3, 203.00, 0),
(null, 63, 'crvena', 17.5, 175.00, 0);

insert into decko(sifra, indiferentno, vesta, asocijalno)
values 
(null, 1, 'debela', 0),
(null, 0, 'tanka', 0),
(null, 1, 'crvena', 1);


insert into decko_zarucnica (sifra, decko, zarucnica)
values 
(null, 1,1),
(null, 2,2),
(null, 3,3);

insert into cura (sifra, haljina, drugiputa, suknja, narukvica, introvertno, majica, decko)
values
(null, 'siva','2022-01-15 00:00:00', 'zelena',13223254558, 0, 'plava', 1 ),
(null, 'crna','2022-02-15 00:00:00', 'ljubičasta',18223254558, 0, 'siva', 2 ),
(null, 'narančasta','2022-03-15 00:00:00', 'tirkizna',18223654558, 0, 'smeđa', 3 );

insert into neprijatelj (sifra, majica, haljina, lipa, modelnaocala, kuna, jmbag, cura)
values
(null, 'dugačka', 'velika', '100', 'guci', 20.30,  '12345678945', 1),
(null, 'plava', 'dugačka', '200', 'maxmara', 20.30,  '12345688945', 2),
(null, 'siva', 'kratka', '400', 'rayban', 20.30,  '12355678945', 3);

insert into svekar (sifra, stilfrizura, ogrlica, asocijalno)
values
(null, 'duga kosa', 236, 1),
(null, 'kratka kosa', 54, 0),
(null, 'poluduga kosa', 8979, 1);

insert into prijatelj (sifra, modelnaocala, treciputa, ekstroverntno, prviputa, svekar)
values
(null, 'rayban', '2020-04-30 00:00:00',0, '2020-05-03 00:00:00', 1),
(null, 'maksmara', '2020-04-30 00:00:00',1, '2020-05-03 00:00:00', 3),
(null, 'rayban', '2020-04-30 00:00:00',1, '2020-05-03 00:00:00', 2);



# brisanje




insert into brat (sifra, suknja, ogrlica, asocijalno, neprijatelj)
values 
(null, 'zelena', 1, 0,1),
(null, 'žuta', 14, 0,1),
(null, 'plava', 1, 0,1);


delete from brat where ogrlica !=14;

# izlistanje uz uvijet
select * from cura where drugiputa is null;

# join


select f.novcica, a.neprijatelj, b.haljina
from brat a
inner join neprijatelj b on a.neprijatelj=b.sifra 
inner join cura c on b.cura=c.sifra 
inner join decko d on c.decko=d.sifra
inner join decko_zarucnica e on d.sifra=e.decko 
inner join zarucnica f on e.zarucnica=f.sifra 
where c.drugiputa is not null and d.vesta like '%ba%';

# zadnji izlist
select vesta, asocijalno from decko;