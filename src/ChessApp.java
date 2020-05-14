import java.util.Scanner;
public class ChessApp {

	public static void main(String[] args) {
	
		int turn =0 ;
		int i  ;
		int x1 = 0 ;
		int x2 = 0 ;
		int y1 = 0 ;
		int y2 = 0 ;
		
		Board b1=new Board() ;
		Player player1 = new Player() ;
		Player player2 = new Player() ;
		for(i=0;i<b1.pieces.size();i++)
			b1.pieces.get(i).board=b1;
		Scanner input = new Scanner(System.in);
		
		b1.assign(b1, player1, player2); // assigning the pieces to players
		System.out.println("\t\t\t\t\tWelcome to Simple Chess Game !\n");
		System.out.println("Piece Movement : add the old position of the piece followed by space then the new position "
				+ ", example: A7 A6 \n\n");
		
	while(b1.end != true) {		
		b1.bString(); //Printing the board
		if(turn%2==0)
			System.out.println("White Player : ") ;
		else
			System.out.println("Black Player : ") ;
		String opos = input.next() ;
		String nwpo = input.next() ;
		
		if(opos.charAt(0)=='A')
			x1=0 ;
		if(opos.charAt(0)=='B')
			x1=1 ;
		if(opos.charAt(0)=='C')
			x1=2 ;
		if(opos.charAt(0)=='D')
			x1=3 ;
		if(opos.charAt(0)=='E')
			x1=4 ;
		if(opos.charAt(0)=='F')
			x1=5 ;
		if(opos.charAt(0)=='G')
			x1=6 ;
		if(opos.charAt(0)=='H')
			x1=7 ;
		
		if(nwpo.charAt(0)=='A')
			x2=0 ;
		if(nwpo.charAt(0)=='B')
			x2=1 ;
		if(nwpo.charAt(0)=='C')
			x2=2 ;
		if(nwpo.charAt(0)=='D')
			x2=3 ;
		if(nwpo.charAt(0)=='E')
			x2=4 ;
		if(nwpo.charAt(0)=='F')
			x2=5 ;
		if(nwpo.charAt(0)=='G')
			x2=6 ;
		if(nwpo.charAt(0)=='H')
			x2=7 ;
		
		y1 = Integer.parseInt(String.valueOf(opos.charAt(1)))-1 ;
		y2 = Integer.parseInt(String.valueOf(nwpo.charAt(1)))-1 ;
		
		if(y1<8 && y2<8) {
			
			if(b1.cells[x1][y1].content != null) {
				if((turn%2==0 && b1.cells[x1][y1].content.color =="w") || (turn%2!=0 && b1.cells[x1][y1].content.color =="b") ) {
					if(b1.cells[x1][y1].content.canmove(b1.cells[x2][y2])) {
						b1.cells[x1][y1].content.move(b1.cells[x2][y2]);
						turn++ ;}
					else
						System.out.println("Invalid move");
					}
			
				else
					System.out.println("Not your color");
			}
			
			else
				System.out.println("Cell empty");
		
			}
		else
			System.out.println("Cell not found");
		
	}
	if(turn%2==0)
		System.out.println("\t Congratulations Black Player Have won ! \n") ;
	else
		System.out.println("\t Congratulations White Player Have won ! \n") ;
	System.out.print("  _____                             ____                 \r\n" + 
			"  / ____|                           / __ \\                \r\n" + 
			" | |  __  __ _ _ __ ___   ___      | |  | |_   _____ _ __ \r\n" + 
			" | | |_ |/ _` | '_ ` _ \\ / _ \\     | |  | \\ \\ / / _ \\ '__|\r\n" + 
			" | |__| | (_| | | | | | |  __/     | |__| |\\ V /  __/ |   \r\n" + 
			"  \\_____|\\__,_|_| |_| |_|\\___|      \\____/  \\_/ \\___|_|   \r\n" + 
			"                                                          ");
	                                                          
	
	                                                           
	                                                           
}
}