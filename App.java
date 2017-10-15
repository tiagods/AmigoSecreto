
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Prolink
 */
public class App {
    
    public static void main(String[] args) {
        new App().iniciar();
    }
    public void iniciar(){
        List<Pessoa> pessoas = new ArrayList();
        pessoas.addAll(Arrays.asList(
                    new Pessoa(1,"Samuel"),
                    new Pessoa(2,"Francisco"),
                    new Pessoa(3,"Natanael"),
                    new Pessoa(4,"Valmir"),
                    new Pessoa(5,"Amilton"),
                    new Pessoa(6,"Fernando"),
                    new Pessoa(7,"Carlos"),
                    new Pessoa(8,"Antonio"),
                    new Pessoa(9,"Joel"),
                    new Pessoa(10,"Marcos")));
        Sorteio sorteio = new Sorteio();
        sorteio.iniciarSorteio(pessoas);
    }
}
