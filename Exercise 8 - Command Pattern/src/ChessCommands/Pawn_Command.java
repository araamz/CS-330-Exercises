package ChessCommands;

import ChessPieces.ChessPiece;

public class Pawn_Command implements ChessPieceCommand {
	
	ChessPiece cp;

	public Pawn_Command(ChessPiece chess_piece) {
		
		cp = chess_piece;
		
	}

	public void execute() {
		
		cp.changePosition(1,0);
		
	}

	public void undo() {
	
		cp.changePosition(-1,0);
		
	}	

}
