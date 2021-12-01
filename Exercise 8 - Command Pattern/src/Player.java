import java.util.ArrayList;

import ChessCommands.ChessPieceCommand;
import ChessPieces.ChessPiece;

public class Player {
	
	private String name;
	private ArrayList<ChessPiece> pieces = new ArrayList<>();
	private ArrayList<ChessPieceCommand> commands = new ArrayList<>();
	
	public Player(String name) {
		
		this.name = name;
		
	}
	
	public void move_piece(int id) {
		
		System.out.print(name + ": " + pieces.get(id).getName() + " moves from " + number_to_letter(pieces.get(id).getColumn()) + "" + pieces.get(id).getRow() + " to ");
		commands.get(id).execute();
		System.out.println(number_to_letter(pieces.get(id).getColumn()) + "" + pieces.get(id).getRow());
		
	}
	
	public void undo_move(int id) {
		
		System.out.print(name + ":UNDO: ");
		System.out.print(name + ": " + pieces.get(id).getName() + " moves from " + number_to_letter(pieces.get(id).getColumn()) + "" + pieces.get(id).getRow() + " to ");
		commands.get(id).execute();
		System.out.println(number_to_letter(pieces.get(id).getColumn()) + "" + pieces.get(id).getRow());
		
	}
	
	public void create_piece(ChessPiece piece, int id) {
		
		pieces.add(id, piece);
		
	}
	
	public ChessPiece get_piece(int id) {
		
		return pieces.get(id);
		
	}
	
	
	public void assign_command(ChessPieceCommand command, int id) {
		
		commands.add(id, command);
		
	}
	
	private char number_to_letter(int column_index) {
		
		return (char)(column_index + 65);
		
	}
	

}
