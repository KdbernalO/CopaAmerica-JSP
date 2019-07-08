
package copaprueba;

import java.util.Scanner;

public class Partido {
    Paises cuartos[] = new Paises[8]; 
    Paises semifinal[] = new Paises[4]; 
    Paises finales[] = new Paises[2];
    Paises Campeon[] = new Paises[1];
    int j=0;
        
    public Partido(){
        cuartos[0] = new Paises("Brasil","Brasil.png",0);
        cuartos[1] = new Paises("Paraguay","Paraguay.jpg",0);
        cuartos[2] = new Paises("Venezuela","Venezuela.png",0);
        cuartos[3] = new Paises("Argentina","Argentina.jpg",0);
        cuartos[4] = new Paises("Colombia","Colombia.png",0);
        cuartos[5] = new Paises("Chile","Chile.jpg",0);
        cuartos[6] = new Paises("uruguay","Uruguay.jpg",0);
        cuartos[7] = new Paises("Peru","Peru.jpg",0);
    }
    
    
    public void cuartos(){
        j=0;
       semifinal = ingresarmarcador(0,cuartos);    
    }
    
    public void semifinal(){
        j=0;
        finales = ingresarmarcador(0, semifinal);
    }
    
    public void finale(){
        j=0;
        Campeon = ingresarmarcador(0, finales);
        
        System.out.println("El ganador de la copa es "+ Campeon[0].nombre);
        
        
    }
    
    public Paises[] ingresarmarcador(int k, Paises concursante[]){
        Paises siguientefase[] = new Paises[concursante.length/2];
        Scanner sc = new Scanner(System.in);
        for(int i=k; i<concursante.length-1;i=i+2){
            System.out.println(concursante[i].nombre +" vs "+ concursante[i+1].nombre);
            System.out.println("Ingrese los goles de "+concursante[i].nombre);
            concursante[i].goles = sc.nextInt();
            System.out.println("Ingrese los goles de "+concursante[i+1].nombre);
            concursante[i+1].goles = sc.nextInt();
            if(concursante[i].goles == concursante[i+1].goles){
                siguientefase[j]=penaltys(concursante[i], concursante[i+1]);
                j++;
            }else{
                siguientefase[j] =comparar(concursante[i], concursante[i+1]);
                j++;
            }
        }
        return siguientefase;
    }
    
    public Paises comparar(Paises cont1,Paises cont2){
        if(cont1.goles>cont2.goles){
            return cont1;
        }
        else{
            return cont2;
        }
        
    }
    
    public Paises penaltys(Paises cont1,Paises cont2){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println(cont1.nombre +" vs "+ cont2.nombre);
            System.out.println("Ingrese los goles de "+cont1.nombre);
            cont1.goles = sc.nextInt();
            System.out.println("Ingrese los goles de "+cont2.nombre);
            cont2.goles = sc.nextInt();
            if(cont1.goles!=cont2.goles){
                 return comparar(cont1, cont2);
                
            }
        }
    }
}
