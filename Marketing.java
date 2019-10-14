/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai9_EmployeeManager;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NGOC TY
 */
public class Marketing extends Ban{
    ArrayList<OfficialEmployee> officialList=new ArrayList<>();
    ArrayList<ParttimeEmployee> parrtimeList=new ArrayList<>();
    Scanner scan=new Scanner(System.in);

    public String officialString() {
        return "Marketing{" + "officialList=" + officialList + '}';
    }
    public String parttimetoString() {
        return "Marketing{" + "officialList=" + officialList + '}';
    }


    
    
    

}
