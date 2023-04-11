--pregled dijete posjeta

--IZVJEŠTAJ PREGLED DIJETE POSJETA
select a.ime, a.prezime, a.oib , a.imeRoditelja, a.telefonRoditelja, c.datumVrijemeDolaska ,
c.datumVrijemeOdlaska 
from dijete a
inner join dijeteposjeta b on a.sifra =b.dijete 
inner join posjeta c  on b.posjeta1 =c.sifra 
group by a.ime , a.prezime 

-- GRAF BROJ DOLAZAKA
select a.ime, a.prezime, count(c.datumVrijemeDolaska) as brojDolazaka
from dijete a
inner join dijeteposjeta b on a.sifra =b.dijete 
inner join posjeta c  on b.posjeta1 =c.sifra 
group by a.ime , a.prezime 


--GRAF BROJ TERMINA PO USLUGAMA
select c.naziv, count(a.datumVrijemeDolaska) as brojDogovorenihTermina
from posjeta a 
inner join uslugaposjeta b on a.sifra =b.posjeta2 
inner join usluga c  on b.usluga = c.sifra 
group by c.naziv 






select * from uslugaposjeta  