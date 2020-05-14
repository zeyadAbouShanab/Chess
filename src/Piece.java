
public abstract class Piece {
	String name ;
	String color ;
	Cell pos ;
	Player player ;
	Board board ;
	@Override
	public String toString() {
		return this.color + this.name + " ";
	}
	
	public void move(Cell nwp) {
		if(nwp.content!=null&&nwp.content.name=="K") {
			this.pos.content = null ;
			this.pos = nwp ;
			nwp.content=this ;
			this.board.end =true ;
		}
		else
			this.pos.content = null ;
			this.pos = nwp ;
			nwp.content=this ;
	}
	
	public boolean canmove(Cell nwp) {
		if(nwp.content.color==this.color)
			return false;
		else
			return true;
					
	}

}
