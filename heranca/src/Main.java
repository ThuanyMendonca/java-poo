public class Main {
    public static void main(String[] args) {
        Serie serie = new Serie();
        serie.setNome("Lost");
        serie.setAnoDeLancamento(2000);
        serie.exibeFichaTecnica();

        serie.setTemporadas(10);
        serie.setEpisodiosPorTemporada(5);
        serie.setMinutosPorEpisodio(40);

        System.out.println("Duração da série: " + serie.getNome() + " duração:" + serie.getDuracaoEmMinutos());

    }
}