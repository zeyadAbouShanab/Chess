import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Board {
	public boolean end;
	public Cell[][] cells = new Cell[8][8] ;
	public List<Piece> pieces = new ArrayList<Piece>();
	public Board() {
		int i ,j ;
		for(i=0;i<8;i++)
			for(j=0;j<8;j++)
				cells[i][j]= new Cell(i,j) ;
		for(i=0;i<8;i++)
			this.setRow(i);
			
		for(i=0;i<8;i++) {
			setCont(cells[i][1] , new Pawn("b",cells[i][1])) ;
			setCont(cells[i][6] , new Pawn("w",cells[i][6])) ;
		}
		setCont(cells[0][0] , new Rook("b",cells[0][0])) ;
		setCont(cells[7][0] , new Rook("b",cells[7][0])) ;
		setCont(cells[0][7] , new Rook("w",cells[0][7])) ;
		setCont(cells[7][7] , new Rook("w",cells[7][7])) ;
		
		setCont(cells[1][0] , new Knight("b",cells[1][0])) ;
		setCont(cells[6][0] , new Knight("b",cells[6][0])) ;
		setCont(cells[1][7] , new Knight("w",cells[1][7])) ;
		setCont(cells[6][7] , new Knight("w",cells[6][7])) ;
		
		setCont(cells[2][0] , new Bishop("b",cells[2][0])) ;
		setCont(cells[5][0] , new Bishop("b",cells[5][0])) ;
		setCont(cells[2][7] , new Bishop("w",cells[2][7])) ;
		setCont(cells[5][7] , new Bishop("w",cells[5][7])) ;
		
		setCont(cells[3][0] , new Queen("b",cells[3][0])) ;
		setCont(cells[3][7] , new Queen("w",cells[3][7])) ;
		
		setCont(cells[4][0] , new King("b",cells[4][0])) ;
		setCont(cells[4][7] , new King("w",cells[4][7])) ;
		
		this.addpieces();
	}
	public void setRow(int i) {
		int k;
		if(i%2==0) {
			for(k=0;k<7;k=k+2) {
				cells[k][i].color = ". ." ;
				cells[k+1][i].color = "* *" ;
			}
								
		}
		else
			for(k=0;k<7;k=k+2) {
				cells[k][i].color = "* *" ;
				cells[k+1][i].color = ". ." ;
			}
	}

	public void setCont(Cell i , Piece p) {
		i.content = p ;
	}
	
	public void bString() {
		int i ;
		System.out.println("    A      B      C      D      E      F      G      H\n") ;
		for(i=0;i<8;i++)
			this.printRow(i);
	
	}
	
	public void printRow(int i) {
		int k ;
		System.out.print(i+1+"   ");
		for(k=0;k<8;k++)
			System.out.print(cells[k][i] + "    " );
		
		System.out.println("\n") ;
	}
	public void assign(Board b1,Player p1 , Player p2) {
		int i ;
		for(i=0;i<b1.pieces.size();i++)
			if(b1.pieces.get(i).color == "w")
				p1.pieces.add(b1.pieces.get(i)) ;
			else
				p2.pieces.add(b1.pieces.get(i)) ;
	}
	public void addpieces() {
		int i ;
		for(i=0;i<8;i++)
			this.pieces.add(cells[i][0].content);
		for(i=0;i<8;i++)
			this.pieces.add(cells[i][1].content);
		for(i=0;i<8;i++)
			this.pieces.add(cells[i][6].content);
		for(i=0;i<8;i++)
			this.pieces.add(cells[i][7].content);
	}
	
	
}
