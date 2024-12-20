import java.util.Scanner;

public class LaskinApp {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String input;
        int counter = 0;

        laskin laskin1 = new laskin();
        yhteenlasku yhteenlasku1 = new yhteenlasku();
        miinuslasku miinuslasku1 = new miinuslasku();
        kertolasku kertolasku1 = new kertolasku();
        jakolasku jakolasku1 = new jakolasku();

        // Alkutervehdys
        System.out.println(" ");
        System.out.println("***********************");
        System.out.println(" Tervetuloa laskimeen!");
        System.out.println("***********************");
        System.out.println(" ");

        //Laskimen käyttö ja looppaus
        while(counter < 10){
        System.out.println("Valitse yksi seuraavista numeroista sen perusteella, mitä haluat laskea:");
        System.out.println("numero 1. jos haluat laskea yhteenlaskun (+)");
        System.out.println("numero 2. jos haluat laskea vähennyslaskun (-)");
        System.out.println("numero 3. jos haluat laskea kertolaskun (*)");
        System.out.println("numero 4. jos haluat laskea jakolaskun (/)");
        System.out.println("numero 5. jos haluat poistua laskimesta");
        System.out.println("Kirjoita numero valintasi: ");
        input = in.nextLine();
        int result = Integer.parseInt(input);

        counter ++;
        if (result == 5){
            System.out.println("Heippa!");
            break;
        }

        System.out.println("Ilmoita ensimmäinen numero jonka haluat laskutoimitukseen:");
        input = in.nextLine();
        double numero1 = Double.parseDouble(input);

        System.out.println("Ilmoita toinen numero jonka haluat laskutoimitukseen:");
        input = in.nextLine();
        double numero2 = Double.parseDouble(input);

        if (result == 1){

            yhteenlasku1.numero1 = numero1;
            yhteenlasku1.numero2 = numero2;
            yhteenlasku1.laskutapahtuma(numero1, numero2);
            
        }
        if (result == 2){
            
            miinuslasku1.numero1 = numero1;
            miinuslasku1.numero2 = numero2;
            miinuslasku1.laskutapahtuma(numero1, numero2);
        }
        if (result == 3){
            kertolasku1.numero1 = numero1;
            kertolasku1.numero2 = numero2;
            kertolasku1.laskutapahtuma(numero1, numero2);
            
        }
        if (result == 4){
            jakolasku1.numero1 = numero1;
            jakolasku1.numero2 = numero2;
            jakolasku1.laskutapahtuma(numero1, numero2);
            
        }
    
    }
    System.out.println("Kiitos kun käytit laskinta!");
    }
} // end of main 

//Kantaluokka
class laskin{

    public double numero1;
    public double numero2;

    public laskin(){
        numero1 = 0; 
        numero2 = 0;
    }

    public laskin(double n1, double n2){
        this.numero1 = n1;
        this.numero2 = n2;
    }


} // end of Laskin
class yhteenlasku extends laskin{

    public yhteenlasku(){
        super();
    }
    public yhteenlasku(double n1, double n2){
        this.numero1 = n1; 
        this.numero2 = n2;
    }

    public void laskutapahtuma(double n1, double n2){
        double tulos = n1 + n2;
        System.out.println(n1 + " + " + n2 + " = " + tulos);
    }


} // end of yhteenlasku
class miinuslasku extends laskin{

    public miinuslasku(){
        super();
    }
    public miinuslasku(double n1, double n2){
        this.numero1 = n1; 
        this.numero2 = n2;
    }

    public void laskutapahtuma(double n1, double n2){
        double tulos = n1 - n2;
        System.out.println(n1 + " - " + n2 + " = " + tulos);
    }


} // end of miinulasku

class kertolasku extends laskin{
 
    public kertolasku(){
        super();
    }
    public kertolasku(double n1, double n2){
        this.numero1 = n1;
        this.numero2 = n2;
    }
 
    public void laskutapahtuma(double n1, double n2){
        double tulos = n1 * n2;
        System.out.println(n1 + " * " + n2 + " = " + tulos);
    }
 
 
} // end of kertolasku

class jakolasku extends laskin{
 
    public jakolasku(){
        super();
    }
    public jakolasku(double n1, double n2){
        this.numero1 = n1;
        this.numero2 = n2;
    }
 
    public void laskutapahtuma (double n1, double n2){
        double tulos = n1 / n2;
        System.out.println(n1 + " / " + n2 + " = " + tulos);
    }
 
 
} // end of jakolasku



