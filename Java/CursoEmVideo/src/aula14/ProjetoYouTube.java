package aula14;

public class ProjetoYouTube {
    public static void main(String[] args) {
        Video[] v = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML");

        Ganfanhoto[] g = new Ganfanhoto[2];
        g[0] = new Ganfanhoto("Jubileu", 22,"M","Juba");
        g[1] = new Ganfanhoto("Creuza",12,"F","Creuzita");

        /*
        System.out.println("----------------Videos---------------");
        System.out.println(v[0]);
        System.out.println(v[1]);
        System.out.println(v[2]);
        System.out.println("--------------Gafanhotos-------------");
        System.out.println(g[0]);
        System.out.println(g[1]);*/
        Visualizacao[] vis = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0],v[2]);
        vis[0].avaliar();
        System.out.println(vis[0]);
        vis[1] = new Visualizacao(g[0],v[1]);
        vis[1].avaliar(10);
        System.out.println(vis[0]);
    }

}
