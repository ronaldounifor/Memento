import java.util.ArrayList;

public class HistoricoVisita {
    private ControladorVisita controlador;
    private ArrayList<PaginaVisita> historico;
    private int paginaAtual;

    public HistoricoVisita(PaginaVisita pagina) {
        controlador = new ControladorVisita(pagina);

        paginaAtual = -1;

        historico = new ArrayList<>();
        visitar(pagina.getEndereco());
    }

    public void visitar(String novoEndereco) {     
        historico.add(controlador.salvar(novoEndereco));
        paginaAtual++;
    }

    public void undo(){
        paginaAtual--;
        controlador.restaurar(historico.get(paginaAtual));
    }

    public void redo(){
        paginaAtual++;
        controlador.restaurar(historico.get(paginaAtual));
    }

    public void goTo(int paginaAlvo){
        paginaAtual = paginaAlvo;
        controlador.restaurar(historico.get(paginaAtual));
    }

    
    
}