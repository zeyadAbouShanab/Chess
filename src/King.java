
public class King extends Piece{

	
	

	public King() {
		this.name = "K" ;
	}
	
	public King(String c , Cell p) {
		this.color = c ;
		this.name="K" ;
		this.pos=p ;
	}
	public boolean canmove(Cell nwp) {
		if(nwp.content!=null&&nwp.content.color==this.color)
			return false ;
		if(Math.abs(nwp.x-this.pos.x)==1&&Math.abs(nwp.y-this.pos.y)==1)
			return true ;
		if(Math.abs(nwp.x-this.pos.x)==1&&nwp.y==this.pos.y)
			return true ;
		if(Math.abs(nwp.y-this.pos.y)==1&&nwp.x==this.pos.x)
			return true ;
		else
			return false ;
	}

}
