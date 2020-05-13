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
public  abstract class Shape {
    protected String brush="Cọ",paper="Giấy",frame="Khung";
    
    public Shape(){}
    public abstract void draw();

    @Override
    public String toString() {
        return brush +  paper + frame ;
    }
    
    
    
    
}
