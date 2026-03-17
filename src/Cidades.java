import java.util.ArrayList;

public class Cidades {
    public static void main(String[] args) {

        ArrayList<String> cidades = new ArrayList<>();

        cidades.add("Campinas");
        cidades.add("São Paulo");
        cidades.add("Santos");
        cidades.add("Ribeirão Preto");

        System.out.println("Lista inicial: " + cidades);

        System.out.println("Cidade no índice 2: " + cidades.get(2));

        cidades.set(3, "Mirassol");

        System.out.println("Lista atualizada: " + cidades);

        cidades.remove(1);
        System.out.println(cidades);

        System.out.println("Número de cidades: " + cidades.size());

        System.out.println("Lista de Cidades com laço for:");
        for (int i = 0 ; i < cidades.size(); i++) {
            System.out.println(cidades.get(i));
        }

        System.out.println("Lista de Cidades com laço for-each:");
        for (String cidade : cidades) {
            System.out.println(cidade);
        }
    }
}