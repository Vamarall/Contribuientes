import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<pessoa> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tax payers: ");
        int taxPayers = sc.nextInt();

        for (int i = 0; i < taxPayers; i++) {
            System.out.printf("Tax payer # %d", i + 1, " data:");
            System.out.println("Individual or company(i/c)?");
            char type = sc.next().charAt(0);

            if (type == 'i') {
                System.out.println("Name: ");
                String name = sc.next();

                System.out.println("Anual income: ");
                double renda = sc.nextDouble();

                System.out.println("Healthexpenditures: ");
                double gastosSaude = sc.nextDouble();

                PessoaFisica pessoaFisica = new PessoaFisica(name, renda, gastosSaude);

                list.add(pessoaFisica);

            } else if (type == 'c') {
                System.out.println("Name: ");
                String name = sc.next();

                System.out.println("Anual income: ");
                double renda = sc.nextDouble();

                System.out.println("Nummber of employees: ");
                int funcionarios = sc.nextInt();

                PessoaJuridica pessoaJuridica = new PessoaJuridica(name, renda, funcionarios);

                list.add(pessoaJuridica);
            }

        }

        for (pessoa p : list) {
            System.out.print("TAXES PAID: ");
            System.out.println(p);

        }

        double totalTaxes = 0;
        for (pessoa p : list) {
            totalTaxes += p.calcImposto();
        }
        System.out.println();
        System.out.println("Total Taxes: " + String.format("%.2f", totalTaxes));

        sc.close();

    }

}