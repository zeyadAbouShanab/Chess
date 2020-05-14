
public class Rook extends Piece{
	
	
	
	
	public Rook() {
		this.name = "R" ;
	}
	
	public Rook(String c , Cell p) {
		this.color = c ;
		this.name="R" ;
		this.pos=p ;
	}

	@Override
	public boolean canmove(Cell nwp) {
		int i ;
		
		if(nwp.content!=null&&nwp.content.color==this.color)
			return false ;
		if(nwp.x==this.pos.x&&nwp.y!=this.pos.y)
			return true ;
		if(nwp.y==this.pos.y&&nwp.x!=this.pos.x)
			return true ;
		else
			return false ;
	}

}
