/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

import java.util.ArrayList;

/**
 *
 * @author 84163
 */
public class HoaDonHeader {
   // mã hóa đơn, ngày bán, tên khách hàng
    String maHD,ngayBan,tenKH;

    ArrayList<CTHD> dshd = new ArrayList<>();
    
    public  void xuat(){
        System.out.println("HoaDonHeader{" + "maHD=" + maHD + ", ngayBan=" + ngayBan + ", tenKH=" + tenKH + '}');
        for(int i=0;i<dshd.size();i++){System.out.println(dshd.get(i).toString());}
    }

    @Override
    public String toString() {
        return "HoaDonHeader{" + "maHD=" + maHD + ", ngayBan=" + ngayBan + ", tenKH=" + tenKH + '}';
    }
    
    
    protected HoaDonHeader(Builder build){
        this.maHD=build.maHD;
        this.ngayBan=build.ngayBan;
        this.tenKH=build.tenKH;
        this.dshd=build.dshd;
    }
    
    public static class Builder
    {
        ArrayList<CTHD> dshd = new ArrayList<>();
        String maHD,ngayBan,tenKH;
        public Builder(){}

        public Builder AddMaHD(String maHD){
            this.maHD = maHD;
            return this;
        }
        public  Builder AddNgayBan(String ngayBan){
            this.ngayBan = ngayBan;
            return this;
        }
        public Builder AddtenKH(String tenKH){
            this.tenKH = tenKH;
            return this;
        }
        public Builder AddCTHD(CTHD cthd){
            dshd.add(cthd);
            this.dshd=dshd;
            return this;
        }
        public HoaDonHeader build(){
            return new HoaDonHeader(this);
        }
        
        
    }

    
}
