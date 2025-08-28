public class Main {
    public static void main(String[] args){
        navio navios = new navio();
        Jogador player = new Jogador();

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.print(navios.map[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Navios restantes:" + navios.naviosRestantes);
        for(int i = 0; i < 5; i++){
            player.jogar(navios.map);
        }

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.print(player.jogadas[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nAcertos: " + player.acertos);
    }
}