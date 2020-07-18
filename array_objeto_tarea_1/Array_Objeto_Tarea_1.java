/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_objeto_tarea_1;

/**
 *
 * @author User
 */
class Sistema_Diagnostico{
    public int codigo;
    public String nombre_sistema;
    
    Sistema_Diagnostico(int codigo, String nombre_sistema){
        this.codigo = codigo;
        this.nombre_sistema = nombre_sistema;
    }
}
class Sistema_Encendido{
    public int codigoE;
    String componentes_SE;
    
    Sistema_Encendido(int codigoE, String componentes_SE){
        this.codigoE = codigoE;
        this.componentes_SE = componentes_SE;
    }
    
}

class Sistema_Combustible{
    public int codigoC;
    String componentes_SC;
    
    Sistema_Combustible(int codigoC, String componentes_SC){
        this.codigoC = codigoC;
        this.componentes_SC = componentes_SC;
    }
    
}

class Sistema_Trasmision{
    public int codigoT;
    String componentes_ST;
    
    Sistema_Trasmision(int codigoT, String componentes_ST){
        this.codigoT = codigoT;
        this.componentes_ST = componentes_ST;
    }
    
}
public class Array_Objeto_Tarea_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("    Universidad de las Fuerzas Armadas ESPE");
        System.out.println("Apellido y Nombre:Morales Esteban");
        System.out.println("NRC:7450\n");
        
        
        
        System.out.println(" Red neuronal de un sistema de diagnostico Automotriz\n");
        System.out.println("*Tipos de sistemas que conforman el Diagnostico Automotriz ");
        Sistema_Diagnostico[] arreglo;
        arreglo = new Sistema_Diagnostico[4];
        arreglo[1] = new Sistema_Diagnostico(110," Encendido, ");
        arreglo[2] = new Sistema_Diagnostico(120,"Combustible,");
        arreglo[3] = new Sistema_Diagnostico(130,"Transmision,");
        
        for(int i=1; i<arreglo.length; i++){
            System.out.println(+i+ ".-Sistema de " +arreglo[i].nombre_sistema
                    + " teniendo el numero  " + arreglo[i].codigo+ " como codigo de identificacion");
        } 
        
        System.out.println("\n*Componentes del Sistema de " +arreglo[1].nombre_sistema);
        Sistema_Encendido[] arreglo1;
        arreglo1 = new Sistema_Encendido[4];
        arreglo1[1] = new Sistema_Encendido(111,"Bateria");
        arreglo1[2] = new Sistema_Encendido(112,"Interruptor de llave");
        arreglo1[3] = new Sistema_Encendido(113,"Motor de arranque");
        
        for(int j=1; j<arreglo1.length; j++){
            System.out.println("Componente numero " +j+ " del sistema de encendido es la "
                    + "" +arreglo1[j].componentes_SE+ " con codigo de identificacion "
                            + "" +arreglo1[j].codigoE);
        }
        
        System.out.println("\n*Componentes del Sistema de " +arreglo[2].nombre_sistema);
        Sistema_Combustible[] arreglo2;
        arreglo2 = new Sistema_Combustible[4];
        arreglo2[1] = new Sistema_Combustible(121,"Bomba de gasolina");
        arreglo2[2] = new Sistema_Combustible(122,"filtros de gasolina");
        arreglo2[3] = new Sistema_Combustible(123,"Inyectores");
        
        for(int k=1; k<arreglo1.length; k++){
            System.out.println("Componente numero " +k+ " del sistema de combustible es la "
                    + "" +arreglo2[k].componentes_SC+ " con codigo de identificacion "
                            + "" +arreglo2[k].codigoC);
        }
        
        System.out.println("\n*Componentes del Sistema de " +arreglo[3].nombre_sistema);
        Sistema_Trasmision[] arreglo3;
        arreglo3 = new Sistema_Trasmision[4];
        arreglo3[1] = new Sistema_Trasmision(131,"Embrague");
        arreglo3[2] = new Sistema_Trasmision(132,"Caja de cambios");
        arreglo3[3] = new Sistema_Trasmision(133,"Diferencial");
        
        for(int m=1; m<arreglo1.length; m++){
            System.out.println("Componente numero " +m+ " del sistema de combustible es la "
                    + "" +arreglo3[m].componentes_ST+ " con codigo de identificacion "
                            + "" +arreglo3[m].codigoT);
        }
    } 
}
