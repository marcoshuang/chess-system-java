
package chesssystem;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;

/**
 *
 * @author MARCOSHUANG
 */
public class ChessSystem {

    public static void main(String[] args) {
        //Teste
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
    
}
