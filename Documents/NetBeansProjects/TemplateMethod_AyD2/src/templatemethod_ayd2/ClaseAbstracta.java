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
public abstract class ClaseAbstracta {
    
    
    //Logica comun entre las dos clases
    public int MetodoTemplate(int NumeroRec)
    {
        this.Mensaje();
        
        int Numero = this.Multiplicar(NumeroRec);
        Numero = this.Sumar(Numero);
        return Numero;
                
    }
    
    public void Mensaje()
    {
        System.out.println("Se emperazaran a realizar las operaciones");
    }
    
    //Métodos Abstractos
    
    public abstract int Multiplicar(int numero);
    public abstract int Sumar(int numero);
    
}
