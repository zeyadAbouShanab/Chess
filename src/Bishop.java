
public class Bishop extends Piece {

	
	
	

	public Bishop() {
		this.name = "B" ;
	}
	
	public Bishop(String c , Cell p) {
		this.color = c ;
		this.name="B" ;
		this.pos=p ;
	}
	public boolean canmove(Cell nwp) {
		if(nwp.content!=null&&nwp.content.color==this.color)
			return false ;
		if(Math.abs(nwp.x-this.pos.x)==Math.abs(nwp.y-this.pos.y))
			return true ;
		else
			return false ;
	}
}
