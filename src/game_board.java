public class game_board {
    public class tile{
        public boolean isMine;
        public int tile_value;

        public tile(){
            isMine = false;
            tile_value = 0;
        }
    }
    int x_size, y_size;
    int mine_count;
    tile[][] board;

    public game_board(int par_board_x, int par_board_y, int par_mine_count){
        mine_count = 0;
        x_size = par_board_x;
        y_size = par_board_y;
        board = new tile [par_board_x][par_board_y];
        for(int i=0; i<x_size;i++){
            for(int j=0; j<y_size;j++){
                    board[i][j] = new tile();
            }
        }
        plant_mines(par_mine_count);
        set_numbers();

    }

    private void plant_mines(int par_mine_count){
        for(int i=0; i<x_size;i++){
            for(int j=0; j<y_size;j++){
                if(Math.random()<0.5 && mine_count<par_mine_count){
                    board[i][j].isMine = true;
                    mine_count++;
                }
            }
        }
    }

    private void set_numbers(){
        for(int i=0; i<x_size;i++){
            for(int j=0; j<y_size;j++){
                if(!board[i][j].isMine){
                    check_for_mines(board[i][j], i, j);
                }
            }
        }
    }

    private void check_for_mines(tile par_tile, int x, int y){
        for(int i=x-1; i<=x+1;i++){
            for(int j=y-1; j<=y+1;j++){
                if(i<x_size && i>=0 && j<y_size && j>=0){
                    if(board[i][j].isMine) par_tile.tile_value++;
                }
            }
        }
    }

    public void print_board(){
        for(int i=0; i<x_size;i++){
            for(int j=0; j<y_size;j++){
                if(board[i][j].isMine) System.out.print("X   ");
                else if(!board[i][j].isMine) System.out.print(board[i][j].tile_value + "   ");
            }
            System.out.println();
        }
    }
}
