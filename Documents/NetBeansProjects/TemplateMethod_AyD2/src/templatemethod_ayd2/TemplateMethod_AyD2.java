/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod_ayd2;

/**
 *
 * @author RobertoEduardo
 */
public class TemplateMethod_AyD2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Clase1 Objeto1 = new Clase1();
        Clase2 Objeto2 = new Clase2();
        
        //Se obtiene el Resultado de Multiplicar un número por 10 y sumarle 10
        int Numero1 = Objeto1.MetodoTemplate(3);
        System.out.println("El resultado es: "+Numero1);
        
        //Se obtiene el Resultado de Multiplicar un núnero por 100 y sumarle 100
        int Numero2 = Objeto2.MetodoTemplate(3);
        System.out.println("El resultado es: "+ Numero2);
        
        /*
            Si el metodo template se hubiera tenido que haccer
            int Numero1 = Objeto1.Multiplicar(3);
            Numero1 = Objeto1.Sumar(Numero1);
        
            int Numero2 = Objeto2.Multiplicar(3);
            Numero2 = Objeto2.Sumar(Numero2);
        
        
        */
    }
    
}
