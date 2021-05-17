
package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;
/**
 *
 * @author MARCOSHUANG
 */
public abstract class ChessPiece extends Piece{
    private Color color;
    private int moveCount;
    
    public int getMoveCount() {
        return moveCount;
    }

    public void increaseMoveCount() {
        moveCount++;
    }

    public void decreaseMoveCount() {
        moveCount--;
    }
    
    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
    
    protected boolean isThereOpponentPiece(Position position) {
        ChessPiece p = (ChessPiece)getBoard().piece(position);
        return p != null && p.getColor() != color;
    }
    
    public ChessPosition getChessPosition() {
        return ChessPosition.fromPosition(position);
    }
}
