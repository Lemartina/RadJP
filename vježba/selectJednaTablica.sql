
# Do sada radili
select * from smjer;

# minimalni oblik select naredbe
select 1;

# filtiranje kolona - select lista
# 1. nazivi kolona odvojeni zarezom
select sifra,naziv from smjer;
select sifra,naziv,sifra from smjer;
# 2. * sve kolone
select *,naziv from smjer;
# 3. konstanta
select naziv, 'Osijek' from smjer;
# zamjenos ime kolone
select naziv, 'Osijek' as mjesto from smjer;
# 4. izraz
select naziv, 
length(naziv) as duzina from smjer;

# ispišite imena i prezimena osoba
select ime,prezime from osoba;


# FILTRIRANJE REDOVA
select * from osoba;

# od prošli puta
select * from osoba 
where sifra=1;

# Operatori uspoređivanje 
# (=, <, >, <=, >=, !=)
select * from osoba
where sifra<5;

select * from osoba
where ime='Kristijan';

# logički operatori (and, or, not) čitati: https://i.ytimg.com/vi/7dvqfpXEjdg/maxresdefault.jpg

select * from osoba
where ime='Kristijan' 
and prezime='Vidaković';


select * from osoba
where ime='Kristijan'
or ime='Karlo';

select * from osoba
where not (ime='Kristijan');

select * from osoba
where ((ime='Kristijan' and sifra<10)
or (sifra>=12 and ime='Ivan'));


# ostali operatori (like, between, in, is null, is not null)
# sve osobe čije ime počinje s slovom K
select * from osoba
where prezime like 'K%';

# Sve ženske osobe s najmanjom mogućnošću greške
select * from osoba
where ime like '%a';


# sve osobe koje sadrže u prezimenu nt
select * from osoba
where prezime like '%vid%';
# Ovaj upit ne vraća rezultate jer u bazi nemamo osobu čije prezime zadrži nt niz znakova 

select * from grupa;

# unijeti tri nove grupe, 
# svaka u različiton godini (2019,2020,2021)

select * from grupa
where datumpocetka>='2020-01-01' 
and datumpocetka <= '2020-12-31';


select * from grupa
where datumpocetka 
between '2020-01-01' and '2020-12-31'; 

select * from osoba
where sifra between 3 and 9;

# izlistajte sve grupe kojima se ne zna
# predavac
select * from grupa
where predavac is not null;

# Unestite novog predavača
# Shaquille O'Neal   shaki@gmail.com
insert into osoba(ime,prezime,email)
values
('Shaquille','O''Neal','shaki@gmail.com');

select * from osoba
where ime ='Shaquille';

insert into predavac (osoba)
values (16);

select * from predavac 
where osoba=16;

update grupa set predavac=2 
where sifra=2;


#### BAZA mjesta

# izlistajte sva mjesta 
# u Osječko baranjskoj županiji




# Koliko mjesta u hrvatskoj bi bili
# pobjednici igre kaladont?




#### BAZA knjiznica

# Izlistajte sve autore koji su rođeni
# 1980 godine



# Dečka je ostavila cura, jadan pati
# što bi mu preporučili za čitanje
# operator in



# Izlistajte sve izdavače koji su 
# društvo s ograničenom odgovornošću


# unesite sebe kao autora


# Obrišite sve kataložne zapise koji govore o smrti


