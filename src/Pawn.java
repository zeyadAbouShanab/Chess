
public class Pawn extends Piece{
	
	
	
	
	public Pawn() {
		this.name = "P" ;
	}
	
	public Pawn(String c , Cell p) {
		this.color = c ;
		this.name="P" ;
		this.pos=p ;
		
	}
	@Override
	public boolean canmove(Cell nwp) {
		if(nwp.content!=null&&nwp.content.color==this.color)
			return false ;
		if(this.pos.x != nwp.x && nwp.content==null)
			return false ;
		if(this.color=="w" && Math.abs(nwp.x-this.pos.x)==1 && nwp.y==this.pos.y-1 &&nwp.content.color=="b" &&nwp.content!=null||this.color=="b" && Math.abs(nwp.x-this.pos.x)==1 && nwp.y==this.pos.y+1 &&nwp.content.color=="w"&&nwp.content!=null)
			return true ;
		
			
		if(nwp.x != this.pos.x || this.pos.y-nwp.y>1 || this.pos.y-nwp.y<-1 || nwp.content != null) {
			return false ;
		}
		else
			if(nwp.content==null) {
				return true ;}
			else
				if(nwp.content.color==this.color) {
					return false;}
				else
					return true ;
		
	}
	}
