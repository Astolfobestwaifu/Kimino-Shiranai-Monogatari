
package little.dark.age;

import java.util.ArrayList;
import java.util.Scanner;

public class LittleDarkAge {
    
public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> uf = new ArrayList<>();
        ArrayList<String> popu = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        String answer = "";

        {
            do {
                System.out.println("O nome de uma cidade:");
                name.add(scanner.next());
                System.out.println("Seu UF: ");
                uf.add(scanner.next());
                System.out.println("Sua População: ");
                popu.add(scanner.next());
                System.out.println("Deseja adicionar mais cidades?(sim/não)");
                answer = scanner.next();
            } while (answer.equals("sim"));
            if (answer.equals("sim")); 
            else {

                System.out.println("Sua lista de cidades é:");
                for (int i = 0; i < name.size(); i++) {
                    System.out.print(name.get(i)+"\t");
                    System.out.print(uf.get(i)+"\t");
                    System.out.print(popu.get(i));
                    System.out.println("");
                }
            }


        }

    }
}