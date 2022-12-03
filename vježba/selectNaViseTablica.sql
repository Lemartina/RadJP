
# Izlistajte sve grupe smjera 
# Java programiranje
select * from smjer;

select * from grupa where smjer=1;

select a.naziv, b.*
from smjer a
inner join grupa b on a.sifra=b.smjer
where a.naziv='Java programiranje';



# unesite smjer Serviser
insert into smjer (naziv,cijena,certificiran)
values ('Serviser',5000,false);

select a.naziv, b.*
from smjer a
left join grupa b on a.sifra=b.smjer
where b.sifra is null;


select a.naziv, b.*
from smjer a
inner join grupa b on a.sifra=b.smjer
where a.naziv='Java programiranje';

# postavite Tomislav Jakopec predavač JP27

select b.sifra 
from osoba a
inner join predavac b on a.sifra=b.osoba
where
a.ime='Tomislav' and a.prezime='Jakopec';

update grupa set predavac=1
where naziv='JP27';


select a.naziv as smjer, 
b.naziv as grupa, 
concat(d.ime,' ', d.prezime) as predavac
from smjer a
inner join grupa b on a.sifra=b.smjer
inner join predavac c on b.predavac = c.sifra
inner join osoba d on c.osoba=d.sifra
where a.naziv='Java programiranje';

# Izlistajte sve šifra polaznika
# čije ime počinje slovom M

select a.sifra
from polaznik a
inner join osoba b on a.osoba=b.sifra
where b.ime like 'M%';


# Izlistajte sve polaznike na smjeru
# Java programiranje

select e.ime, e.prezime
from smjer a
inner join grupa b on a.sifra=b.smjer
inner join clan c on b.sifra=c.grupa
inner join polaznik d on c.polaznik=d.sifra
inner join osoba e on d.osoba=e.sifra
where
a.naziv ='Java programiranje';

# alternative
select smjer.naziv, grupa.naziv
from smjer inner join grupa
on smjer.sifra=grupa.smjer;

select smjer.naziv, grupa.naziv
from smjer, grupa
where smjer.sifra=grupa.smjer;


# BAZA KNJIŽNICA

# Izlistati sve naslove autora 
# August Šenoa


# nastavno na prethodni upit
# Gdje je August izdao ove naslove?

# nastavno na prethodni upit
# Tko je izdao ove naslove?

# Izlistajte imena i prezimena autora
# čije knjige su izdane u mjestu 
# koje počinje slovom A



# BAZA SAKILA

# izlistajte sve glumce


# Postoji li u bazi moj omiljeni glumac


# unesite glumca Brad Pitt

# U kojim je sve filmovima glumio 
# BURT	POSEY



# Ispišite imena i prezimena kupaca
# koji su posuđivali filmove
# u kojima je glumio 
# BURT	POSEY



# Agregiranje rezultata, grupiranje
# i filtriranje agregranih vrijednosti

select a.last_name, sum(c.amount) 
from customer a
inner join rental b on a.customer_id =b.customer_id 
inner join payment c on b.rental_id =c.rental_id
group by a.last_name
having sum(c.amount) between 100 and 110
order by 2 desc;
