/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.util;

import com.github.javafaker.Faker;
import edunova.model.Grupa;
import edunova.model.Polaznik;
import edunova.model.Predavac;
import edunova.model.Smjer;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Administrator
 */
public class PocetniInsert {

   private  Faker faker;
   private List<Smjer> smjerovi;
   private List <Grupa> grupe;
   private List <Polaznik> polaznici;
   private List <Predavac> predavaci;
    
    public PocetniInsert() {
        
        faker= new Faker();
        smjerovi=new ArrayList<>();
        grupe=new ArrayList<>();
        polaznici=new ArrayList<>();
        predavaci=new ArrayList<>();
        session = HibernateUtil.getSession();
        session.beginTransaction();
        kreirajSmjerove();
    }

    private void kreirajSmjerove() {
            }


    
}
