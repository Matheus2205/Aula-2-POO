import java.util.Scanner;

public class Questao3 {
       public static void main(String[] args) {
        String frase;
        int cont=0;
        Scanner ler = new Scanner(System.in); //padrão
        System.out.println("Digite uma frase: ");
        frase = ler.nextLine();
        for (int i=0;i<frase.length();i++){
            if(frase.charAt(i)=='a' || frase.charAt(i)=='e' || frase.charAt(i)=='i' \\ )
                cont++;
        }
System.out.println("Total de vogais: "+cont);

    }
}
