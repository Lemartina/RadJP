# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Administrator\Documents\GitHub\RadJP\RadJP\Kolokvij\vjezba6.sql

drop database if exists vjezba6; 
create database vjezba6;
use vjezba6;

create table punac(
    sifra int not null primary key auto_increment,
    ekstroventno bit not null,
    suknja varchar(30) not null,
    majica varchar(44) not null,
    prviputa datetime not null
);

create table svekrva(
    sifra int not null primary key auto_increment,
    hlace varchar(48) not null,
    suknja varchar(32) not null,
    ogrlica int not null,
    treciputa datetime not null,
    dukserica int not null,
    punac int
);

create table ostavljena(
    sifra int not null primary key auto_increment,
    prviputa datetime not null,
    kratkamajica varchar(39) not null,
    drugiputa datetime,
    maraka decimal(14,10)
    );

    create table prijatelj(
        sifra int not null primary key auto_increment,
        haljina varchar(35),
        prstena int not null,
        introvertno bit,
        stilfrizura varchar(36) not null

    );

    create table prijatelj_ostavljena(
        sifra int not null primary key auto_increment,
        prijatelj int not null,
        ostavljena int not null
        );




        create table brat(
            sifra int not null primary key auto_increment,
            nausnica int not null,
            treciputa datetime not null,
            narukvica int not null,
            hlace varchar(31),
            prijatelj int not null
    
        );

        create table zena(
            sifra int not null primary key auto_increment,
            novcica decimal(14,8) not null,
            narukvica int not null,
            dukserica varchar(40) not null,
            haljina varchar(30),
            hlace varchar(32), 
            brat int not null
        );

        create table decko(
            sifra int not null primary key auto_increment,
            prviputa datetime,
            modelnaocala varchar(41),
            nausnica int,
            zena int not null
        );

        # veze

        alter table prijatelj_ostavljena add foreign key (prijatelj) references prijatelj(sifra);
        alter table prijatelj_ostavljena add foreign key (ostavljena) references ostavljena(sifra);
        alter table brat add foreign key (prijatelj) references prijatelj(sifra);
        alter table zena add foreign key (brat) references brat(sifra);
        alter table decko add foreign key (zena) references zena(sifra);
        alter table svekrva add foreign key(punac) references punac(sifra);

        # 1 

insert into ostavljena (sifra, prviputa, kratkamajica, drugiputa, maraka)
values
(null, '2022-10-23 00:00:00', 'crna', '2022-11-02',10),
(null, '2022-05-27 00:00:00', 'crna', '2022-06-12',15),
(null, '2022-03-11 00:00:00', 'crna', '2022-02-02',20);


insert into prijatelj (sifra, haljina, prstena, introvertno, stilfrizura)
values
(null, 'duga', 10, 0,'kratka'),
(null, 'zelena', 30, 1,'poluduga'),
(null, 'crvena', 40, 0,'kratka');

insert into prijatelj_ostavljena (sifra, prijatelj, ostavljena)
values
(null, 1, 1),
(null, 2, 2),
(null, 3, 3);

insert into brat(sifra, nausnica, treciputa, narukvica, hlace, prijatelj)
values
(null, 10, '2021-10-03 00:01:01',20, 'plave', 1),
(null, 02, '2022-09-23 00:01:01',20, 'zelene',2),
(null, 20, '2021-11-02 00:01:01',20, 'lubičaste', 3);




