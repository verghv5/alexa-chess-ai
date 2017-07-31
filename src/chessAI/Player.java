package chessAI;

import java.util.Map;

import chessAI.ChessPiece.PieceType;

import java.util.HashMap; 
import java.util.Arrays;

public class Player implements PlayerInterface {

	// white if true, black if false 
	private boolean color; 
	private ChessPiece[] pieces; 
	private ChessBoard chessBoard; 
	
	public Player(boolean color) {
		this.color = color; 
		pieces = new ChessPiece[16];
	
		this.reset(pieces);
	}

	public static void main(String[] args) { 
		// for testing of course 

	}

	// method turns a position like A1 -> 1, C1 -> 3, A5 -> 33, H8 -> 64 
	private static int convertCoordinateToNumber(char column, int row) { 

		Character[] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
		Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};

		if (Arrays.binarySearch(letters, column) < 0 || Arrays.binarySearch(numbers, row) < 0) { 
			throw new IllegalArgumentException("invalid input");
		}

		int columnValue = Arrays.asList(letters).indexOf(column) + 1;
		int rowValue = row - 1;
		
		return columnValue + 8 * rowValue;
	}

	public void movePiece(char column, int row) { 
		ChessPiece piece = pieces[Player.convertCoordinateToNumber(column, row)]; 
		
		switch (piece.getPieceType()) {
			case PAWN:
				piece.
				break; 
			case ROOK:
				break;
            case KNIGHT:
				break; 
			case QUEEN:
				break; 
			case KING:
				break; 
		}
	}

	// removes all key-value pairs in pieces and puts in starting chess board values 
	private void reset(ChessPiece[] pieces) { 
		for (ChessPiece piece : pieces) { 
			piece = null;
		}

		if (color) { 
			pieces[0] = new ChessPiece(PieceType.ROOK, 0, chessBoard); 

		}
		
		else { 

		}


	}
	
}
