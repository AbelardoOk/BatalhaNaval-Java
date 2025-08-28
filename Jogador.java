public class Jogador {

    public int[][] generator(){
        int[][] data = new int[10][10];
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                data[i][j] = 0;
            }
        }
        return data;
    }

    int[][] jogadas = generator();
}
