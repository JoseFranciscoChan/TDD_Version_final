/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author J-CHAN
 */
public class idMaestroAlumno {
    
       public String valorMA(int pos,String clave){
        String tipo = "";
        if(pos==1){
            tipo = Maestro(clave);
        }else if(pos==2){
            tipo = Alumno(clave);
        }else if(pos==3){
            tipo = Intendente(clave);
        }
        return tipo;
      
    }
       
    
    
    
    private String Maestro(String clave){
        
        String tipo = "ERROR01";

        int numero = Integer.parseInt(clave);;
        int A=1000;
        int B=9999;
        
        if(numero>=A && numero<=B){
            tipo = "Maestro";
            System.out.println("Maestro");
        }

      return tipo;
    }
    
    private String Alumno(String clave){
        String tipo = "ERROR02";
        String SubCadena = clave.substring(0, clave.length()-6);
        String numeral = clave.substring(3);
       
        if(SubCadena.equals("al0")&&(numeral.length()==6)){
            tipo = "Alumno";
            System.out.println("Alumno");
        }else{

            return tipo;
        }
        return tipo;
    }
    
    private String Intendente(String clave){
        String tipo = "ERROR03";
        String SubCadena = clave.substring(0, clave.length()-3);
        String SubCadena2 = clave.substring(2);
        int numero = Integer.parseInt(SubCadena2);
        int A=1;
        int B=999;
        
        if(SubCadena.equals("in")&&(numero>=1 && numero<=999)){
            tipo = "Intendente";
            System.out.println("Intendente");
        }else{

            return tipo;
        }
        return tipo;
    }
}
