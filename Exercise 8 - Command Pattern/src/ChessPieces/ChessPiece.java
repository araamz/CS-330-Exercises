package ChessPieces;

public abstract class ChessPiece {

	private int position[] = new int[2];
	private String name;
	
	public int getRow() {

		return position[0];
    
	} 

	public int getColumn() {

		return position[1];
    
	}
	public String getName() {
		
		return name;
		
	}


	public void setRow(int row_position) {

		position[0] = row_position;
    
	} 

	public void setColumn(int column_position) {

		position[1] = column_position;
    
	}
	public void setName(String name) {
		
		this.name = name;
		
	}


	public void changePosition(int row_modifier , int column_modifier) {
		
		position[0] = row_modifier + position[0];
		position[1] = column_modifier + position[1];
    
	}
  
}