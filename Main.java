public class Main {
    public static void main(String[] args){
        navio navios = new navio();

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.print(navios.map[i][j] + " ");
            }
            System.out.println();
        }
    }
}