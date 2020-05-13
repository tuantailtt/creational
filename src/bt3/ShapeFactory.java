/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3;

import static bt3.ShapeType.rectangle;
import static bt3.ShapeType.triangle;
import static bt3.ShapeType.circle;
/**
 *
 * @author 84163
 */
public class ShapeFactory  {
    
    public  ShapeFactory(){}
    public Shape drawShape(ShapeType type){
        Shape shape = null;
        if(type == rectangle){
            shape = new Rectangle();        
        }
        if(type== triangle){
            shape = new Triangle();
        }
         if(type== circle){
            shape = new Circle();
        }
        shape.draw();
        return shape;
        
    }
}
