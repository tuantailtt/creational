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
public class Triangle extends Shape{

    public Triangle(){
        brush ="Cọ tam giác";
        paper=" Giấy tam giác";
        frame="Khung tam giác";
    }
    @Override
    public void draw() {
        System.out.println("Vẽ hình tam giác:");

    }
    
}
