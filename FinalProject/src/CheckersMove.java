class CheckersMove {
     // A CheckersMove object represents a move in the game of Checkers.
   int fromRow, fromCol;  // which piece is being moved
   int toRow, toCol;      // Swhere it is going to
   CheckersMove(int r1, int c1, int r2, int c2) {
        // Constructor.  Just set the values of the instance variables.
      fromRow = r1;
      fromCol = c1;
      toRow = r2;
      toCol = c2;
   }
   boolean isJump() {
        // Test whether this move is a jump.  It is assumed that
        // the move is legal.  In a jump, the piece moves two
        // rows.  (In a regular move, it only moves one row.)
      return (fromRow - toRow == 2 || fromRow - toRow == -2);
   }
}  


