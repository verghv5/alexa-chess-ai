package chessAI;

import java.util.Map; 
import java.util.HashMap;

/* 
* 8x8 Chess Board  
* positions numbered as follows: A1 = 1, B1 = 2, ... , A8 = 57, ..., H8 = 64 
* 
*

*/ 

public class ChessBoard implements BoardInterface {
	private Map<Integer, ChessPiece> positions; 
	private Player player; 
	private Player chessBrain; 

	public ChessBoard() { 
		this.positions = new HashMap<Integer, ChessPiece>(); 
		this.player = new Player(true); 
		this.chessBrain = new Player(false); 

		// initialize default positions 
	}
		
	public Map<Integer, ChessPiece> getPositions() { 
		return positions; 
	}
	
		
}


