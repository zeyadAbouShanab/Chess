
public class Knight extends Piece {

	
	public Knight() {
		this.name = "N" ;
	}
	
	public Knight(String c , Cell p) {
		this.color = c ;
		this.name="N" ;
		this.pos=p ;
	}
	
	public boolean canmove(Cell nwp) {
		if(nwp.content!=null&&nwp.content.color==this.color)
			return false ;
		if(Math.abs(nwp.x-this.pos.x)==2 && Math.abs(nwp.y-this.pos.y)==1)
			return true ;
		if(Math.abs(nwp.y-this.pos.y)==2 && Math.abs(nwp.x-this.pos.x)==1)
			return true ;
		else
			return false ;
	}
}
