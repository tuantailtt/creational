/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3;
import bt3.Shape;
import bt3.ShapeType;
import bt3.ShapeFactory;
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
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.drawShape(ShapeType.circle);
        
        System.out.println(shape.toString());
        

        
        
    }
    
}
