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
public class Circle extends Shape{

    public Circle (){
         brush ="Cọ tròn";
        paper=" Giấy tròn";
        frame="Khung tròn";
    }
    @Override
    public void draw() {
        
        System.out.println("Vẽ hình tròn:");
     }
    
}
