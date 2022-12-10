# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Administrator\Documents\GitHub\RadJP\RadJP\Kolokvij\vjezba4.sql

drop database if exists vjezba4;
create database vjezba4;
use vjezba4;

# 0 tablice i veze

create table punac(
    sifra int not null primary key auto_increment,
    treciputa datetime,
    majica varchar (46),
    jmbag char(11) not null,
    novcica decimal (18,7) not null,
    maraka decimal(12,6) not null,
    ostavljen int not null
);

create table ostavljen(
    sifra int not null primary key auto_increment, 
    modelnaocala varchar(43),
    introvertno bit,
    kuna decimal(14,10)
);

create table snasa(
    sifra int not null primary key auto_increment,
    introvertno bit, 
    treciputa datetime,
    haljina varchar(44) not null,
    zena int not null
);

create table becar(
    sifra int not null primary key auto_increment,
    novcica decimal(14,8),
    kratkamajica varchar(48) not null,
    bojaociju varchar(36),
    snasa int not null
);

create table prijatelj(
    sifra int not null primary key auto_increment,
    eura decimal(16,9),
    prstena int not null, 
    gustoca decimal(16,5),
    jmbag char (11) not null,
    suknja varchar(47) not null,
    becar int not null
);

create table zena(
    sifra int not null primary key auto_increment,
    suknja varchar(39) not null,
    lipa decimal(18,7),
    prstena int not null
    );

    create table zena_mladic (
        sifra int not null primary key,
        zena int not null,
        mladic int not null
    );

create table mladic(
    sifra int not null primary key auto_increment,
    kuna decimal(15,9),
    lipa decimal (18,5),
    nausnica int,
    stilfrizura varchar(49),
    vesta varchar(34)
);


alter table punac add foreign key(ostavljen) references ostavljen(sifra);
alter table snasa add foreign key(zena) references zena(sifra);


alter table becar add foreign key(snasa) references snasa(sifra);
alter table prijatelj add foreign key(becar) references becar(sifra);
alter table zena_mladic add foreign key(zena) references zena(sifra);
alter table zena_mladic add foreign key(mladic) references mladic(sifra);

# unos u tablice


insert into ostavljen(sifra, modelnaocala, introvertno, kuna)
values
(null, 'maxmara', 1, '10.53'),
(null, 'rayban', 0, '26.53'),
(null, 'maxmara', 0, '53.53');

insert into punac(sifra, treciputa, majica, jmbag, novcica, maraka, ostavljen)
values 
(null, '2022-02-03 17:00:00', 'zelena', '1234566666', '10', '32','1'),
(null,'2022-02-03 17:00:00', 'plava', '81890337429', '15', '20','2'),
(null, '2022-02-03 17:00:00','žuta', '1234566666', '30', '14','3');

insert into mladic(sifra, kuna, lipa, nausnica, stilfrizura, vesta)
values
(null, 11,63, 1, 'poluduga kosa', 'crvena'),
(null, 12,70, 1, 'kratka kosa', 'plava'),
(null, 13,69, 1, 'kratka kosa', 'zelena');

insert into zena(sifra, suknja, lipa, prstena)
values
(null,'poluduga ','105', 0),
(null,'kratka ','15', 1),
(null,'duga ','1654', 0);


insert into snasa (sifra, introvertno, treciputa, haljina, zena)
values
(null, 0, '2022-01-05 00:00:00' , 'ljubičasta', 1),
(null, 0, '2022-02-05 00:00:00' , 'crvena', 2),
(null, 0, '2022-03-05 00:00:00' , 'plava', 3);

insert into becar(sifra, novcica, kratkamajica, bojaociju, snasa)
values
(null, 223.56, 'pamučna','plava',1),
(null, 236.56, 'poliester','crvena',2),
(null, 159.56, 'lan','plava',3);

insert into prijatelj (sifra, eura, prstena, gustoca, jmbag, suknja, becar)
values
(null, '32.56', '2', '464.5465', '12345678978','dugačka', 1),
(null, '598.56', '2', '345.5465', '94545664548','kratka', 2),
(null, '77896.56', '2', '545.5465', '12344544978','debela', 3);



# update
update punac set majica='Osijek' where sifra in (1,2,3);

# delete
delete from prijatelj where prstena >17;


# select
select haljina from snasa where treciputa  is null;

# 5 zadatak

select a.nausnica, f.jmbag, e.kratkamajica 
from mladic a
inner join zena_mladic b on a.sifra=b.mladic
inner join zena c on b.zena=c.sifra
inner join snasa d on c.sifra=d.zena
inner join becar e on d.sifra=e.snasa
inner join prijatelj f on e.sifra=f.becar 
where c.lipa =! 29 order by e.kratkamajica desc;



# popravci
delete from mladic where sifra in(1,2,3);
update prijatelj set prstena=3 where sifra=1;
update prijatelj set prstena=5 where sifra=3;

# 6 zadatak

select a.lipa, f.prstena
from mladic a 
right join zena_mladic b on a.sifra=b.mladic
right join zena c on b.zena=c.sifra
right join snasa d on c.sifra=d.zena
right join becar e on d.sifra=e.snasa
right join prijatelj f on e.sifra=f.becar;














