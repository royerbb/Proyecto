
package camisa;


public class CamisaTipo {
    private double precioTotal;

    public CamisaTipo() {
    }
   
    
    
    public CamisaTipo(int identificador,int cantidad){
        precioTotal= CalcularPrecio(identificador ,cantidad);
        System.out.println("precio unitario = " + precioTotal);
   
    }
    public static void sumaCamisa(double camisa1,double camisa2,double camisa3){
        System.out.println("Precio total = " + (camisa1+camisa2+camisa3));
    }
    public double CalcularPrecio(int identificador, int cantidad) throws NullPointerException {
        double temporal=0;
        if(identificador==1){
            if(cantidad<=2){
                temporal = 300*cantidad;

            }else if(cantidad>=3 && cantidad<=5){
                temporal =  (300*cantidad)-(300*cantidad*0.05);

            }
            else if(cantidad>5){
                temporal =  (300*cantidad)-(300*cantidad*0.08);
            }
        }else if(identificador==2){
            if(cantidad<=2){
              temporal =  (230*cantidad);

            }else if(cantidad>=3 && cantidad<=5){
                temporal =  (230*cantidad)-(230*cantidad*0.05);
            }
            else if(cantidad>5){
                temporal =  (230*cantidad)-(230*cantidad*0.08);
            }
            
        }else if(identificador==3){
            temporal = 310*cantidad;
            if(cantidad<=2){
                temporal =  (310*cantidad);
            }else if(cantidad>=3 && cantidad<=5){
                temporal =  (310*cantidad)-(310*cantidad*0.05);
            }
            else if(cantidad>5){
                temporal =  (310*cantidad)-(310*cantidad*0.08);
            }
        }
        return temporal;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

   

    @Override
    public String toString() {
        return "camisaTipo{" + "precioTotal=" + precioTotal + '}';
    }
    
 
}
