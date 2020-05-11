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
public class CTHD {
    //sản phẩm, số lượng, đơn giá, chiết khấu
    String sanPham;
    int soLuong;
    float chietKhau;
    
    protected CTHD(Builder builder){
        this.sanPham=builder.sanPham;
        this.soLuong=builder.soLuong;
        this.chietKhau=builder.chietKhau;
                
    }
    
    @Override
    public String toString() {
        return "CTHD{" + "sanPham=" + sanPham + ", soLuong=" + soLuong + ", chietKhau=" + chietKhau + '}';
    }

    public static class Builder{
        String sanPham;
        int soLuong;
        float chietKhau;
        public Builder(){}
        public Builder addSanPham(String sanPham){
            this.sanPham=sanPham;
            return this;
        }
        public Builder addSoLuong(int soLuong){
            this.soLuong=soLuong;
            return this;
        }
        public Builder addChietKhau(float chietKhau){
            this.chietKhau=chietKhau;
            return this;
        }
        public CTHD build(){
            return new CTHD(this);
        }
    }
    
    
    
}
