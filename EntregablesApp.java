public class EntregablesApp {

    public static void main(String[] args) {
        
        Serie listaSeries[]=new Serie[5];
        Videojuego listaVideojuegos[]=new Videojuego[5];
  
        
        listaSeries[0]=new Serie();
        listaSeries[1]=new Serie("Son Como niños", "George R. R. Martin ");
        listaSeries[2]=new Serie("Garra", 25, "Humor", "Matt Groening");
        listaSeries[3]=new Serie("Padre de familia", 12 ,"Humor", "Seth MacFarlane");
        listaSeries[4]=new Serie("Prision Break", 5, "Thriller", "Vince Gilligan");
  
        listaVideojuegos[0]=new Videojuego();
        listaVideojuegos[1]=new Videojuego("Assasin creed Odissey", 30, "Aventura", "EA");
        listaVideojuegos[2]=new Videojuego("God of war", "Santa Monica");
        listaVideojuegos[3]=new Videojuego("Smash", 30, "Plataforma", "Nintendo");
        listaVideojuegos[4]=new Videojuego("Forza Horizon", 200, "Rol", "Square Enix");
  
      
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
  
        System.out.println("Hay "+entregados+" articulos entregados");
  
        
        Serie serieMayor=listaSeries[0];
        Videojuego videojuegoMayor=listaVideojuegos[0];
  
        
        for(int i=1;i<listaSeries.length;i++){
            if(listaSeries[i].compareTo(serieMayor)==Serie.MAYOR){
                serieMayor=listaSeries[i];
            }
            if(listaVideojuegos[i].compareTo(videojuegoMayor)==Videojuego.MAYOR){
                videojuegoMayor=listaVideojuegos[i];
            }
  
        }
  
      
        System.out.println(videojuegoMayor);
        System.out.println(serieMayor);
    }
  
}
        
    
}
