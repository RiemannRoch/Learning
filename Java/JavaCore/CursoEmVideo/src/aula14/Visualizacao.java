package aula14;

public class Visualizacao {
    private Ganfanhoto expectador;
    private Video filme;

    public Visualizacao(Ganfanhoto g,Video f) {
        this.expectador = g;
        this.filme = f;
        this.expectador.setTotAssistido(this.expectador.getTotAssistido()+1);
        this.filme.setViews(this.filme.getViews()+1);
    }

    @Override
    public String toString() {
        return "Visualizacao{" +
                "\nexpectador=" + expectador +
                ",\n filme=" + filme +
                '}';
    }

    void avaliar(){
        this.filme.setAvaliacao(5);
    }

    void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }

    void avaliar(float porc){
        int tot = 0;
        if (porc <= 20){
            tot = 3;
        } else if (porc <= 50){
            tot = 5;
        } else if (porc <= 90){
            tot = 8;
        } else {
            tot =10;
        }
        this.filme.setAvaliacao(tot);
    }

    public Ganfanhoto getExpectador() {
        return expectador;
    }

    public void setExpectador(Ganfanhoto expectador) {
        this.expectador = expectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
}
