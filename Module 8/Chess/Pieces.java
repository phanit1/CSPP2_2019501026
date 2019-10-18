class Rock extends Piece {
    //String name ="Rock";
    //boolean isAlive;
    int row;
    int column;
    Rock (int r, int c) {
        this.row = r;
        this.column = c;
    }
    // String getPosition() {
    //     return "(" + this.row + "," + this.column + ")";
    // }
    boolean isValidMove(Position newPosition) {
        if (super.isValidMove(newPosition.row, newPosition.column)) {
            if(newPosition.column == this.column || newPosition.row == this.row) {
            return true;
        }
        else {
            System.out.println("Warning Rock can only move in straight (left,right,front,back)");
            return false;
        }

        } else {
            System.out.println("Sorry Out of Bounds");
            return false;

        }
    }
    void changePosition(Position p) {
        this.column = p.column;
        this.row = p.row;
    }
}
class Queen extends Piece {
        int row;
        int column;
        Queen(int r, int c) {
            this.row = r;
            this.column =c;
        }
        boolean isValidMove(Position p) {
            if (super.isValidMove(p.row,p.column)) {
                if(p.column == this.column || p.row == this.row) {
                    return true;
                }
                if (Math.abs(p.row - this.row) ==Math.abs( p.column - this.column )) {
                    return true;
                }
                System.out.println("Warning Queen cant be moved");
                return false;
            }
                else {
                    System.out.println("Running out of boatd");
                    return false;
                }
            }
            void changePosition(Position p) {
                this.column = p.column;
                this.row = p.row;
            }
        }