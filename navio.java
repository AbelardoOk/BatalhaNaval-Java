public class navio {
    int n = 10;
    int[][] map = generator();
    int naviosRestantes;

    public int[][] generator(){
        System.out.println("Gerando mapa");

        int[][] data = new int[10][10];
        int count = 0;

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                data[i][j] = 0;
            }
        }

        for(int i = 5; i >= 2; i--){
            int x = (int)(Math.random() * 10);
            int y = (int)(Math.random() * 10);
            int lado = (int)(Math.random() * 4);
            boolean aux = true;
            while (aux){
                switch (lado) {
                    case 0:
                    // Direita

                        if(x + i < 10){
                            for(int j = x; j < (x+i); j++){
                                data[j][y] = 1;
                                count++;
                            }
                        } else{
                            x--;
                            break;
                        }
                        
                        aux = false;
                        break;
                    
                    case 1:
                    // Baixo

                        if(y + i < 10){
                            for(int j = y; j < (y+i); j++){
                                data[x][j] = 1;
                                count++;
                            }
                        } else{
                            y--;
                            break;
                        }

                        aux = false;
                        break;

                    case 2:
                    // Esquerda
                        if(x - i >= 0){
                            for(int j = x; j > (x-i); j--){
                                data[j][y] = 1;
                                count++;
                            }
                        } else{
                            y++;
                            break;
                        }

                        aux = false;
                        break;

                    case 3:
                    // Cima
                        if(y - i >= 0){
                            for(int j = y; j > (y-i); j--){
                                data[y][j] = 1;
                                count++;
                            }
                        } else{
                            y++;
                            break;
                        }

                        aux = false;
                        break;

                    default:
                        break;
                }
            }
        }


        this.naviosRestantes = count;
        return data;
    }


}
