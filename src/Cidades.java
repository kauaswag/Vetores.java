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
    }
}