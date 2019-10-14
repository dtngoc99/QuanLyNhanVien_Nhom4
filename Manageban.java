/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai9_EmployeeManager;

import java.util.Scanner;

/**
 *
 * @author NGOC TY
 */
public class Manageban {
    Scanner scan=new Scanner(System.in);
    
    Marketing ma=new Marketing();
    KeToan kt=new KeToan();
    
    public void in()
    {
        int x;
        while(true){
            System.out.println("Loai nhan vien(1 Official/2 parttime): ");
            x=scan.nextInt();
            if(x==1){
                OfficialEmployee of=new OfficialEmployee();
                of.input();
                while(true)
                {
                    System.out.println("Ban(1 marketing/2ketoan)");
                    x=scan.nextInt();
                    if(x==1){
                        ma.officialList.add(of);
                        return;
                    }else if(x==2){
                        kt.officialList.add(of);
                        return;
                    }

                
                }
            }
            else if(x==2){
                ParttimeEmployee pt=new ParttimeEmployee();
                pt.input();
                while(true)
                {
                    System.out.println("Ban(1 marketing/2ketoan)");
                    x=scan.nextInt();
                    if(x==1){
                        ma.parrtimeList.add(pt);
                        return;
                    }else if(x==2){
                        kt.parrtimeList.add(pt);
                        return;
                    }

                
                }
            }
        }
    }
    
    public void Menu()
    {
        int x;
        while(true)
        {
                
            System.out.printf("\n\t1.Nhap nhan vien ");
            System.out.printf("\n\t2.Xuat nhan vien");
            System.out.printf("\n\t0.Thoat");
            System.out.printf("\nNhap lua chon: ");
            x = scan.nextInt();
            switch(x)
            {
                case 1:
                    in();
                    break;
                case 2:
                    output();
                    break;
                case 0:
                    return;
            }
        }
    }
    
    public void nvct()
    {
        for(OfficialEmployee o:ma.officialList){
            o.output();
        }
        for(OfficialEmployee o:kt.officialList){
            o.output();
        }
        
    }
    public void nvtv()
    {
        for(ParttimeEmployee o:ma.parrtimeList){
            o.output();
        }
        for(ParttimeEmployee o:kt.parrtimeList){
            o.output();
        }
    }public void nvmk()
    {
        for(OfficialEmployee o:ma.officialList){
            o.output();
        }
        for(ParttimeEmployee o:ma.parrtimeList){
            o.output();
        }
    }public void nvkt()
    {
        for(OfficialEmployee o:kt.officialList){
            o.output();
        }
        for(ParttimeEmployee o:kt.parrtimeList){
            o.output();
        }
    }
    
    public void output(){
        
        while(true){
            int x;
            System.out.print("\n\t1.Xuat Danh sach nhan vien chinh thuc");
            System.out.print("\n\t2.Xuat Danh sach Nhan vien thoi vu");
            System.out.print("\n\t3.Xuat Danh sach Nhan vien ban Marketing");
            System.out.print("\n\t4.Xuat Danh sach Nhan vien ban Ketoan");
            System.out.print("\n\t0.thoat");
            System.out.printf("\nNhap lua chon: ");
            x=scan.nextInt();
            switch (x) {
                case 1:
                    nvct();
                    break;
                case 2:
                    nvtv();
                    break;
                case 3:
                    nvmk();
                    break;
                case 4:
                    nvkt();
                    break;
                case 0:
                    return;
                default:
                    break;
            }
      
        }
    }
}
