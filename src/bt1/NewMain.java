/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

/**
 *
 * @author 84163
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CTHD cthd1 = new CTHD.Builder()
                .addSanPham("sp1")
                .addSoLuong(10)
                .addChietKhau(0.1f)
                .build();
        CTHD cthd2 = new CTHD.Builder()
                .addSanPham("sp2")
                .addSoLuong(10)
                .addChietKhau(0.1f)
                .build();
        CTHD cthd3 = new CTHD.Builder()
                .addSanPham("sp3")
                .addSoLuong(10)
                .addChietKhau(0.1f)
                .build();
        HoaDonHeader hoaDon = new HoaDonHeader.Builder()
                .AddMaHD("hoaDon1")
                .AddNgayBan("11-5")
                .AddtenKH("kh1")
                .AddCTHD(cthd1)
                .AddCTHD(cthd2)
                .AddCTHD(cthd3)
                .build();
        
        
        hoaDon.xuat();
        
    }
    
}
