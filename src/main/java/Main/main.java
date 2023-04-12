
package Main;

import camisa.CamisaTipo;


public class main {
    public static void main(String[] args) {
        CamisaTipo camisa1 = new CamisaTipo(1,3);
        CamisaTipo camisa2 = new CamisaTipo(2,5);
        CamisaTipo camisa3 = new CamisaTipo(3,2);
       
        CamisaTipo.sumaCamisa(camisa1.getPrecioTotal(),camisa2.getPrecioTotal() , camisa3.getPrecioTotal());
        
    }
}
