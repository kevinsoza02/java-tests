import java.util.Scanner;
import java.time.YearMonth;

public class exercicios {

    // Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
    // mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
    // (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)

    static int idadeDias(){
        Scanner myObj = new Scanner(System.in);
        String data;

        System.out.println("Entre com uma data(use DD/MM/AAAA):");
        data = myObj.nextLine();

        String[] separado = data.split("/");

        if (separado.length != 3) {
            System.out.println("Data invalida.");
        } else {
            int dias = Integer.parseInt(separado[0]);
            int mes = Integer.parseInt(separado[1]);
            int ano = Integer.parseInt(separado[2]);

            if (dias > 31 || dias < 0 || mes > 12 || mes < 0 || ano < 0 ) {
                System.out.println("Data invalida.");
            } else {
                int year = YearMonth.now().getYear();
                int month = YearMonth.now().getMonthValue();
                System.out.println(dias);
                System.out.println((12 - mes)*30);
                System.out.println((year-ano));
                int resultado = dias - ((12 - mes)*30) + ((12 - month)*30)  + ((year-ano) * 365);
                return resultado;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int resultado = idadeDias();
        if (resultado != 0){
            System.out.println(Integer.toString(resultado) + " Dias");
        }
    }
    
}
