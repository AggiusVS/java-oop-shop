import java.util.Random;

public class Prodotto {
    private int codice;
    private String nome;
    private double prezzo;
    private double iva;
    private String descrizione;

    // costruttori
    public Prodotto(String nome, String descrizione, double prezzo, double iva) {
        Random rand = new Random();
        this.codice = rand.nextInt(999999);
        this.descrizione = descrizione;
        this.nome = nome;
        this.iva = iva;
        this.prezzo = prezzo;

    }

    // metodi
    public double prezzoBase() {
        return prezzo;
    }

    public double prezzoIva() {
        return prezzo + (prezzo * iva / 100);
    };

    public String codiceNome() {
        return codice + "-" + nome;
    };

    //getter 

    public int getCodice() {
        return codice;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public String getNome() {
        return nome;
    }

    public double getIva() {
        return iva;
    }

    //setter

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
    

        

}
