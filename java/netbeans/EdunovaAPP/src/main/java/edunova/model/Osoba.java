/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.model;

import jakarta.persistence.Entity;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Administrator
 */
@Entity
public class Osoba {
    
    private Integer sifra;
    private String ime;
    private String prezime;
    private BigDecimal primanja;
    private Boolean aktivan;
    private Date datumRodenja;
    
    
    public Integer getSifra(){
        return sifra;
    }
}
