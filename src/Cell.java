
public class Cell {
	
	String color ;
	Piece content ;
	int row ;
	char col ;
	int x , y ;

	public Cell() {
		
	}
	public Cell(int X , int Y) {
		this.x=X ;
		this.y=Y ;
	}
	@Override
	public String toString() {
		if(this.content==null)
			return this.color ;
		else
			return this.content.toString() ;
	}
	
		
}

