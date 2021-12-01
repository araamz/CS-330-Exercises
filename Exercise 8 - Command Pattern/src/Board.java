import ChessCommands.Knight_Command;
import ChessCommands.Pawn_Command;
import ChessPieces.Knight;
import ChessPieces.Pawn;

public class Board {
	
	private Player p1;
	private Player p2;
	
	public Board(Player p1, Player p2) {
		
		this.p1 = p1;
		this.p2 = p2;
		
		p1.create_piece(new Knight(0,0), 0);
		p1.assign_command(new Knight_Command(p1.get_piece(0)), 0);
		p1.create_piece(new Pawn(1,0), 1);
		p1.assign_command(new Pawn_Command(p1.get_piece(1)), 1);
		p1.create_piece(new Pawn(2,0), 2);
		p1.assign_command(new Pawn_Command(p1.get_piece(2)), 2);
		
		p2.create_piece(new Knight(1,2), 0);
		p2.assign_command(new Knight_Command(p2.get_piece(0)), 0);
		p2.create_piece(new Pawn(1,0), 1);
		p2.assign_command(new Pawn_Command(p2.get_piece(1)), 1);
		
	}
	
	public void play() {
		
		p1.move_piece(0);
		p2.move_piece(1);
		p1.move_piece(1);
		p1.undo_move(1);
		p1.move_piece(2);
		
	}
	

}
