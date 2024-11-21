import br.com.albertopaim.util.Stream.Pessoas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public static void main(String[] args) {

    List<Pessoas> usuarios = new ArrayList<Pessoas>();

    Pessoas alberto = new Pessoas("Alberto", "Paim");
    Pessoas vinicius = new Pessoas("Vinicius", "Cerqueira");
    Pessoas luana = new Pessoas("Luana", "Paim");

    usuarios.add(alberto);
    usuarios.add(vinicius);
    usuarios.add(luana);

    Stream<Pessoas> usuariosStream = usuarios.stream();

    Stream<String> result = usuariosStream.map(usuario -> {
        return usuario.getNome() + " " + usuario.getSobreNome();
    });

    System.out.println(result.toList());

}





