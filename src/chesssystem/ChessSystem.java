
package chesssystem;

import chess.ChessException;
import java.util.Scanner;
import chess.ChessPiece;
import chess.ChessPosition;
import chess.ChessMatch;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author MARCOSHUANG
 */
public class ChessSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        List<ChessPiece> captured = new ArrayList<>();

        while (!chessMatch.getCheckMate()) {
            try{
                UI.clearScreen();
                UI.printMatch(chessMatch,captured);
                System.out.println();
                System.out.print("Source: ");
                ChessPosition source = UI.readChessPosition(sc);

                boolean[][] possibleMoves = chessMatch.possibleMoves(source);
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces(), possibleMoves);
                
                System.out.println();
                System.out.print("Target: ");
                ChessPosition target = UI.readChessPosition(sc);

                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
                
                if (capturedPiece != null) {
                    captured.add(capturedPiece);
                }
            }
            catch (ChessException | InputMismatchException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
            UI.clearScreen();
            UI.printMatch(chessMatch, captured);
        }
      }
    }
    

