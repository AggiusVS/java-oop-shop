import java.util.Random;

public class Prodotto {
    public int codice;
    public String nome;
    public double prezzo;
    public double iva;
    public String descrizione;

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
    public double prezzoBase(){
        return prezzo;
    }
    
    public double prezzoIva(){
        return prezzo + (prezzo * iva / 100);
    };
    public String codiceNome(){
        return codice + "-" + nome;
    };
    
}
