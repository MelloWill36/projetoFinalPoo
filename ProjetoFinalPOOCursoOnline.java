package projetofinalpoo.cursoonline;

public class ProjetoFinalPOOCursoOnline {

    public static void main(String[] args) {
        Video v[] = new Video[5];
        v[0] = new Video("Aula 01");
        v[1] = new Video("Aula 02");
        v[2] = new Video("Aula 03");
        v[3] = new Video("Aula 04");
        
        Gafanhoto g[] = new Gafanhoto[5];
        g[0] = new Gafanhoto("Anna",31,"F","ninha");
        g[1] = new Gafanhoto("Victor",32,"M","vi");
        
        System.out.println(g[0].toString());
        
        Visualizacao vis = new Visualizacao(g[0],v[3]);
        
      }
 
        
    }
  
