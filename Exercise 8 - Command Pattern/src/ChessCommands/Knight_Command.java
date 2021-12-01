package ChessCommands;

import ChessPieces.ChessPiece;

public class Knight_Command implements ChessPieceCommand {
	
	ChessPiece cp;

	public Knight_Command(ChessPiece chess_piece) {
		
		cp = chess_piece;
		
	}

	public void execute() {
		
		cp.changePosition(2,1);
		
	}

	public void undo() {
	
		cp.changePosition(-2,-1);
		
	}	

}
