
import java.util.*;
import java.util.logging.Logger;


/**
 *
 * @author Prolink
 */
public class Sorteio {
    public void iniciarSorteio(List<Pessoa> pessoas){
        List<Pessoa> embaralhar = new ArrayList<>();
        embaralhar.addAll(pessoas);
        Collections.shuffle(embaralhar);
        sortear(embaralhar, embaralhar.get((embaralhar.size()-1)));
    }
    private void sortear(List<Pessoa> pessoas, Pessoa p1){
        if(pessoas.size()<3) {
            System.out.println("O minimo de participantes deve ser 3 pessoas");
            return;
        }
        Pessoa p2 = pessoas.get(0);
        if(p2==p1) p2 = pessoas.get(1); 
        p1.setSorteado(p2);
        System.out.println(p1+" tirou "+p2);
        pessoas.remove(p2);
        if(!pessoas.isEmpty())
            sortear(pessoas, p2);        
    }
    public void alguemSaiu(Pessoa pessoa,List<Pessoa> pessoas){
        pessoas.remove(pessoa);
        iniciarSorteio(pessoas);
        ordenarSorteio(pessoas);
    }
    public void ordenarSorteio(List<Pessoa> pessoas){
        Comparator<Pessoa> comparator = (Pessoa o1, Pessoa o2) -> o1.getNome().compareTo(o2.getNome());
        pessoas.sort(comparator);
    }
}
