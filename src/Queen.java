
public class Queen extends Piece {

	
	

	public Queen() {
		this.name = "Q" ;
	}
	
	public Queen(String c , Cell p) {
		this.color = c ;
		this.name="Q" ;
		this.pos=p ;
	}
	public boolean canmove(Cell nwp) {
		if(nwp.content!=null&&nwp.content.color==this.color)
			return false ;
		if(Math.abs(nwp.x-this.pos.x)==Math.abs(nwp.y-this.pos.y))
			return true ;
		if(nwp.x==this.pos.x&&nwp.y!=this.pos.y)
			return true ;
		if(nwp.y==this.pos.y&&nwp.x!=this.pos.x)
			return true ;
		else
			return false ;
	}
}
