/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt2;

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
        MyStringBuilder myString = new MyStringBuilder.Builder()
                .addString("String")
                .addFloat(3f)
                .addBool(true)
                .build();
        System.out.println(myString.toString());
    }
    
}
