public class ControladorVisita {
    private PaginaVisita paginaAtual;
    
    public ControladorVisita(PaginaVisita pagina) {
        this.paginaAtual = pagina;
    }

    public PaginaVisita salvar(String novoEndereco) {
        paginaAtual.setEndereco(novoEndereco);

        PaginaVisita paginaNova = new PaginaVisita(paginaAtual.getEndereco());

        return paginaNova;
    }

    public void restaurar(PaginaVisita pagina) {
        paginaAtual = pagina;
    }
}
