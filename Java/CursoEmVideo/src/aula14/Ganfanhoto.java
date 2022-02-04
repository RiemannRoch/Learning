package aula14;

public class Ganfanhoto extends Pessoa{
    private String login;
    private int totAssistido;

    public Ganfanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }


    public void viuMaisUm(){
        this.totAssistido++;
    }

    @Override
    public String toString() {
        return "Ganfanhoto{\n" +
                "login='" + login + '\'' +
                ",\n totAssistido=" + totAssistido +
                ",\n nome='" + nome + '\'' +
                ",\n idade=" + idade +
                ",\n sexo='" + sexo + '\'' +
                ",\n experiencia=" + experiencia +
                '}';
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
}
