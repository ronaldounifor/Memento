public class App {
    public static void main(String[] args) throws Exception {
        HistoricoVisita historico = new HistoricoVisita(new PaginaVisita("https://refactoring.guru/"));//0

        historico.visitar("https://refactoring.guru/refactoring");//1
        historico.visitar("https://refactoring.guru/refactoring/technical-debt");//2
        historico.visitar("https://refactoring.guru/refactoring/when");//3
        historico.visitar("https://refactoring.guru/design-patterns");//4
        historico.visitar("https://refactoring.guru/design-patterns/what-is-pattern");//5

        historico.undo();
        historico.undo();
        historico.redo();
        historico.redo();
    }
}