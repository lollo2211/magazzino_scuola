package miopackage;

public class Prodotto {
    private int codice;
    private String nome;
    private String marchio;
    private String genere;
    private int pezzi;

    //COSTRUTTORE DI DEFAULT
    public Prodotto() {
        this.codice = 0;
        this.nome = "";
        this.marchio = "";
        this.genere = "";
        this.pezzi = 0;
    }

    //COSTRUTTORE PARAMETRICO
    public Prodotto(int codice, String nome, String marchio, String genere, int pezzi) {
        this.codice = codice;
        this.nome = nome;
        this.marchio = marchio;
        this.genere = genere;
        this.pezzi = pezzi;
    }

    //METODI GETTER
    public int getCodice() {
        return codice;
    }
    public String getNome() {
        return nome;
    }
    public String getMarchio() {
        return marchio;
    }
    public String getGenere() {
        return genere;
    }
    public int getPezzi() {
        return pezzi;
    }

    //METODI SETTER
    public void setCodice(int codice) {
        this.codice = codice;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

}
