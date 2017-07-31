package chessAI;

public class ChessPiece implements PieceInterface {
	private PieceType pieceType; 
	
	// each piece has a reference to the current state of the board it's on 
	private ChessBoard board; 

	public enum PieceType { 
		PAWN,
		ROOK,
		KNIGHT,
		QUEEN,
		KING
	}

	public ChessPiece(PieceType pieceType, int pos, ChessBoard board) { 
		this.pieceType = pieceType; 
		// this.pos = pos; 
		this.board = board; 
	}


	public PieceType getPieceType() { 
		return pieceType; 
	}

	// for the player to move one space forward, add 8 to the piece position 
	// for the player to move one space backward, subtract 8 from the piece position 

	// for the player to move diagonally to the right, add 9 
	// for the player to move diagonally to the left, add 7 


	
	
}
