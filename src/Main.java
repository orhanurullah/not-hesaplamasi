import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        String dersler[] = {"Matematik", "Fizik", "Türkçe", "Kimya", "Müzik"};
        int notlar[] = new int[dersler.length];
        int toplam = 0, average;
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < dersler.length; i++){
            System.out.print(dersler[i] + " notunu girin : ");
            int not = scanner.nextInt();
            if(not < 0 || not > 100){
                continue;
            }
            notlar[i] = not;
            toplam += not;
        }
        average = toplam / notlar.length;
        if(average < 55){
            System.out.println(average + " ortalamasıyla kaldın.");
        }else{
            System.out.println(average + " ortalamasıyla geçtin.");
        }


    }
}
