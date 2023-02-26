/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edunova;

import edunova.util.HibernateUtil;
import edunova.util.PocetniInsert;



/**
 *
 * @author Administrator
 */
public class Start {

    public static void main(String[] args) {
//       PocetniInsert.izvedi();
HibernateUtil.getSession();
    }
}
