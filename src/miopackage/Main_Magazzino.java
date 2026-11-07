package miopackage;

import java.util.Scanner;

public class Main_Magazzino {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Prodotto prodotto1 = new Prodotto();
        Prodotto prodotto2;

        int codice, numeroPezzi;
        String nome, marchio, genere;

        System.out.println("--- MAGAZZINO ---");
        System.out.println("--- PRODOTTO 1 ---");

        System.out.print("Inserisci il codice del primo prodotto (numero intero): ");
        codice = scanner.nextInt();
        prodotto1.setCodice(codice);
        scanner.nextLine();
        System.out.print("Inserisci il nome del primo prodotto: ");
        nome = scanner.nextLine();
        prodotto1.setNome(nome);
        System.out.print("Inserisci il marchio del primo prodotto: ");
        marchio = scanner.nextLine();
        prodotto1.setMarchio(marchio);
        System.out.print("Inserisci il genere del primo prodotto: ");
        genere = scanner.nextLine();
        prodotto1.setGenere(genere);

        do{
            System.out.print("Inserisci il numero dei pezzi del primo prodotto: ");
            numeroPezzi = scanner.nextInt();
            if(numeroPezzi < 0){
                System.out.print("Errore, riprova. ");
            }
        }while(numeroPezzi < 0);
        prodotto1.setNumeroPezzi(numeroPezzi);

        System.out.println("--- PRODOTTO 1 ---");
        System.out.println("Codice prodotto: " + prodotto1.getCodice());
        System.out.println("Nome: " + prodotto1.getNome());
        System.out.println("Marchio: " + prodotto1.getMarchio());
        System.out.println("Genere: " + prodotto1.getGenere());
        System.out.println("Pezzi: " + prodotto1.getNumeroPezzi());

        System.out.println("\n--- PRODOTTO 2 ---");
        System.out.print("Inserisci il codice del secondo prodotto (numero intero): ");
        codice = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Inserisci il nome del secondo prodotto: ");
        nome = scanner.nextLine();
        System.out.print("Inserisci il marchio del secondo prodotto: ");
        marchio = scanner.nextLine();
        System.out.print("Inserisci il genere del secondo prodotto: ");
        genere = scanner.nextLine();

        do{
            System.out.print("Inserisci il numero dei pezzi del secondo prodotto: ");
            numeroPezzi = scanner.nextInt();
            if(numeroPezzi < 0){
                System.out.print("Errore, riprova. ");
            }
        }while(numeroPezzi < 0);

        prodotto2 = new Prodotto(codice, nome, marchio, genere, numeroPezzi);
        System.out.println("\n---PRODOTTO_2---");
        prodotto2.visualizza();
    }
}