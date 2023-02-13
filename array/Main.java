package array;

public class Main {
  
    public static void main(String[] args) {
  
       
        Serie listaSeries[]=new Serie[5];
        Videojuego listaVideojuegos[]=new Videojuego[5];
  
        
        listaSeries[0]=new Serie();
        listaSeries[1]=new Serie("Juego de tronos", "George R. R. Martin ");
        listaSeries[2]=new Serie("Los Simpsons", 25, "Humor", "Matt Groening");
        listaSeries[3]=new Serie("Padre de familia", 12 ,"Humor", "Seth MacFarlane");
        listaSeries[4]=new Serie("Breaking Bad", 5, "Thriller", "Vince Gilligan");
  
        listaVideojuegos[0]=new Videojuego();
        listaVideojuegos[1]=new Videojuego("Assasin creed 2", 30, "Aventura", "EA");
        listaVideojuegos[2]=new Videojuego("God of war 3", 30, "Santa Monica", "steam");
        listaVideojuegos[3]=new Videojuego("Super Mario 3DS", 30, "Plataforma", "Nintendo");
        listaVideojuegos[4]=new Videojuego("Final fantasy X", 200, "Rol", "Square Enix");
  
       
        listaSeries[1].entregar();
        listaSeries[4].entregar();
        listaVideojuegos[0].entregar();
        listaVideojuegos[3].entregar();
  
        
  
        int entregados=0;
  
        for(int i=0;i<listaSeries.length;i++){
            if(listaSeries[i].isEntregado()){
                entregados+=1;
                listaSeries[i].devolver();
  
            }
            if(listaVideojuegos[i].isEntregado()){
                entregados+=1;
                listaVideojuegos[i].devolver();
            }
        }
        
         for(int i=0;i<listaSeries.length;i++){
             System.out.println(listaSeries[i]);
         
        }
        for(int i=0;i<listaVideojuegos.length;i++){
            System.out.println(listaVideojuegos[i]);
  
        }
  
        System.out.println("Hay "+entregados+" articulos entregados");
  
        
        Serie serieMayor=listaSeries[0];
        Videojuego videojuegoMayor=listaVideojuegos[0];
  
        
        for(int i=0;i<listaSeries.length;i++){
            if(listaSeries[i].compareTo(serieMayor)==Serie.MAYOR){
                serieMayor=listaSeries[i];
            }
         
        }
        for(int i=0;i<listaVideojuegos.length;i++){
            if(listaVideojuegos[i].compareTo(videojuegoMayor)==Videojuego.MAYOR){
                videojuegoMayor=listaVideojuegos[i];
            }
  
        }
        System.out.println(videojuegoMayor);
        System.out.println(serieMayor);
    }
  
}