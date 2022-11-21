drop database if exists osnovnaskola;
create database osnovnaskola;
use osnovnaskola;

create table radionica(
    sifra int not null primary key auto_increment,
    naziv varchar (50),
    mjestoodrzavanja varchar(50),
    vrijemeodrzavanja datetime,
    uciteljica int
);

create table dijete(
    sifra int not null primary key auto_increment,
    ime varchar(50),
    prezime varchar(50),
    brojugovora varchar(15)
);

create table uciteljica(
    sifra int not null primary key auto_increment,
    imeu varchar (50),
    prezimeu varchar (50),
    iban char(35)
);

create table polaznciradionice(
    radionica int,
    dijete int,
    datumpocetka date,
    datumkraja datetime
);


# vanjski ključevi

alter table polaznciradionice add foreign key (radionica) references radionica (sifra);
alter table polaznciradionice add foreign key (dijete) references dijete (sifra);
alter table radionica add foreign key (uciteljica) references uciteljica (sifra);
