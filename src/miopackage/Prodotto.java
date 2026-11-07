package miopackage;

public class Prodotto {
    // ATTRIBUTI
    private int codice;
    private String nome;
    private String marchio;
    private String genere;
    private int numeroPezzi;

    //COSTRUTTORE DEFAULT
    public Prodotto(){
        codice = 0;
        nome = "";
        marchio = "";
        genere = "";
        numeroPezzi = 0;
    }
    //COSTRUTTORE PARAMETRICO
    public Prodotto(int codice, String nome, String marchio, String genere, int numeroPezzi){
        this.codice = codice;
        this.nome = nome;
        this.marchio = marchio;
        this.genere = genere;
        this.numeroPezzi = numeroPezzi;
    }

    // GETTER
    int getCodice(){
        return codice;
    }
    String getNome(){
        return nome;
    }
    String getMarchio(){
        return marchio;
    }
    String getGenere(){
        return genere;
    }
    int getNumeroPezzi(){
        return numeroPezzi;
    }

    // SETTER
    void setCodice(int codice){
        this.codice = codice;
    }
    void setNome(String nome){
        this.nome = nome;
    }
    void setMarchio(String marchio){
        this.marchio = marchio;
    }
    void setGenere (String genere){
        this.genere = genere;
    }
    void setNumeroPezzi(int numeroPezzi){
        this.numeroPezzi = numeroPezzi;
    }

    // VISUALIZZA
    void visualizza(){
        System.out.println("Codice prodotto: "+codice);
        System.out.println("Nome: "+nome);
        System.out.println("Marchio: "+marchio);
        System.out.println("Genere: "+genere);
        System.out.println("Pezzi: "+numeroPezzi);
    }
}
