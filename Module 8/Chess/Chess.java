class Game {
    Piece [][] board;
    Game() {
    board = new Piece[8][8];
    }
}
    
class Position {
    int row;
    int column;
    Position(int r, int c) {
    this.row = r;
    this.column = c;
    }

public String getPosition() {
    return "(" + this.row + "," + this.column + ")";
}
}
class Piece {
    Position position;
    boolean isValidMove(int row, int column) {
    if(row >= 0 && column >= 0 && row < 8 && column < 8) {
           return true;
        } else {
          return false;
        }
    }  
}

    // boolean isDiagonal(int row , int column) {
    //     if (row== column || row - column ==2 || column - row ==2) {
    //         return true;
    //     }
    //     else {
    //         return false;
    //     }
    // } 

    final class Chess { 
        public static void main(String[] args) {
        //     Piece p = new Piece();
        //     Position testPosition = new Position(3,5);
        //     if(r.isValidMove(testPosition)) {
        //         System.out.println("Yes, I can move there.");
        //     } else {
        //         System.out.println("Nope, can't do!");
        //     }
        // }     
        //Game game = new Game();
        Rock r1 = new Rock(0,0);
        //game.board[0][0] = r1;
        // Rock r2 = new Rock(0,6);
        // game.board[0][6] = r2;
        // //Rock r2 = new Rock(0,5);
        Position newPosRock = new Position(11,0);
        System.out.println("CurrentPosition of Rock: " + r1.row + "," + r1.column);
        if (r1.isValidMove(newPosRock)) {
            System.out.println("Can be moved to " + newPosRock.getPosition());
            r1.changePosition(newPosRock);
        }
        else {
            System.out.println("Cant be moved to " + newPosRock.getPosition());
        }
        System.out.println("CurrentPosition of Rock: " + r1.row +"," + r1.column);
        Queen q = new Queen(0,4);
        System.out.println("CurrentPosition of Queen: " + q.row +"," + q.column);
        Position newPosQueen = new Position(2,6);
        if(q.isValidMove(newPosQueen)) {
            System.out.println("Can be moved to " + newPosQueen.getPosition());
            q.changePosition(newPosQueen);
        }
        else {
            System.out.println("Cant be moved to " + newPosQueen.getPosition());
        }
        System.out.println("CurrentPosition of Queen: " + q.row + "," + q.column);
    }
}