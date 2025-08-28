public class Jogador {

    int[][] jogadas = generator();
    int acertos = 0;


    public int[][] generator(){
        int[][] data = new int[10][10];
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                data[i][j] = 0;
            }
        }
        return data;
    }

    public boolean jogar(int[][] map){
        int x = (int)(Math.random() * 10);
        int y = (int)(Math.random() * 10);

        System.out.println("Jogador escolheu as coordenadas: " + x + " " + y);
        this.jogadas[x][y] = 1;

        if(map[x][y] == 1){
            System.out.println("Navio abatido\n");
            this.acertos++;
            return true;
            
        } else
            System.out.println("Mirou no vento!\n");
            return false;
            
    }
}
