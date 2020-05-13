/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3;

/**
 *
 * @author 84163
 */
public class Rectangle extends Shape{

    public Rectangle(){
        brush ="Cọ chữ nhật";
        paper=" Giấy chữ nhật";
        frame="Khung chữ nhật";
    }
    @Override
    public void draw() {
        
        System.out.println(" Vẽ hình chữ nhật:");
    }
    
}
