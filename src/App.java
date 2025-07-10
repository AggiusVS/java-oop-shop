public class App {
    public static void main(String[] args) throws Exception {
        
        Prodotto prodotto1 = new Prodotto("Tastiera", "Tastiera meccanica", 70.99, 22);

        System.out.println("Codice: " + prodotto1.codice);
        System.out.println("Nome: " + prodotto1.nome);
        System.out.println("Descrizione: " + prodotto1.descrizione);
        System.out.println("Prezzo Base: " + prodotto1.prezzoBase());
        System.out.println("Prezzo con iva: " + prodotto1.prezzoIva());
        System.out.println("Nome con codice: " + prodotto1.codiceNome());
        
    }
}
