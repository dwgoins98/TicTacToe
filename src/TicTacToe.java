import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		
		char [][] board = new char[3][3];
		
		boolean playerMove = true;
		boolean computerMove = true;
		boolean checkHorizontalPlayer = checkHorizontalPlayer(board);
		boolean checkVerticalPlayer = checkVerticalPlayer(board);
		boolean checkDiagonalPlayer = checkDiagonalComputer(board);
		boolean checkHorizontalComputer = checkHorizontalComputer(board);
		boolean checkVerticalComputer = checkVerticalComputer(board);
		boolean checkDiagonalComputer = checkDiagonalComputer(board);
		
		//initialize board
		initializeBoard(board);
		
		
				
		do	{
		
		//get playerMove or computerMove
			if (playerMove	) {
				
				playerMove = getPlayerMove(board);
				
				
			}	else if(computerMove)	{
				
				computerMove = getComputerMove(board);
				
			}	else	{
				
				playerMove = true;
				
			}
			
			//display board
			printBoard(board);
			
		// check for winner
			checkVerticalPlayer = checkVerticalPlayer(board);	
			checkHorizontalPlayer = checkHorizontalPlayer(board);
			checkDiagonalPlayer = checkDiagonalComputer(board);
			checkVerticalComputer = checkVerticalComputer(board);
			checkHorizontalComputer = checkHorizontalComputer(board);
			checkDiagonalComputer = checkDiagonalComputer(board);
			
			 if(checkVerticalPlayer || checkHorizontalPlayer || checkDiagonalPlayer )	{
				
				System.out.println("OMG! You won!");
				break;
				
			}	else if(checkVerticalComputer || checkHorizontalComputer || checkDiagonalComputer)	{
				
				System.out.println("Oof. Better luck next time.");
				break;
				
			}
			
		
		}	while (true);	
		
	}
	
	public static void initializeBoard(char[][] board) {
		
		for(int i = 0; i<3; i++)	{
			for(int j = 0; j < 3; j++)	{
				
				board[i][j] = '-';
				
			}
		}
		
		System.out.print("\n\n");
	}
	
	public static void printBoard( char[][] board)	{
		
		for (int i = 0; i < 3; i++)	{
			for(int j = 0; j < 3; j++)	{
				
				System.out.print(board[i][j] );
				if (j != 2)	{
					System.out.print("	|	");
				}
				
			}
			if (i != 2)	{
			System.out.println("\n------------------------------------");
			}
		}
		
		System.out.println("\n\n");
		
	}
	
	public static boolean checkVerticalPlayer(char[][] board)	{
		
		if(board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X')	{
			
			return true;
			
		}	else if (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X')	{
			
			return true;
			
		}	else if (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X')	{
			
			return true;
			
		}	else	{
			
			return false;
		}
		
	}
	
public static boolean checkHorizontalPlayer(char[][] board)	{
		
		if(board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X')	{
			
			return true;
			
		}	else if(board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X')	{
			
			return true;
			
		}	else if(board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X')	{
			
			return true;
			
		}	else	{
			
			return false;
			
		}
		
	}

public static boolean checkDiagonalPlayer(char[][] board)	{
	
	if(board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X')	{
		
		return true;
		
	}	else if(board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X')	{
		
		return true;
		
	}	else	{
		
		return false;
		
	}
	
}
	
	public static boolean getPlayerMove(char[][] board)	{
		
		Scanner keyboard = new Scanner(System.in);
	
	System.out.println("");
	System.out.println("");
	
	System.out.print("Enther your row: ");
	
	int row = keyboard.nextInt();
	
	System.out.println("");
	
	System.out.print("Enter your col(left to right is 0-2): ");
	
	int col = keyboard.nextInt();
	
	if (board[row][col] == '-' ) {
		
		board[row][col] = 'X';
		return false ;
		
	}	else	{
	
		//already taken
		return true;
		
	}
		
	}
	
	public static boolean getComputerMove(char[][] board)	{
		
		Random rand = new Random();
		
		int row = rand.nextInt(2)+1;
		int col = rand.nextInt(2)+1;
		
		if (board[row][col] == '-')	{
			
			board[row][col] = 'O';
			return false;
			
		}	else if (board[row][col] == 'X')	{
			
			return true;
			
		}	else	{
			
			return true;
			
		}
		
	}
	
	public static boolean checkHorizontalComputer(char[][] board)	{
		
		if(board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O')	{
			
			return true;
			
		}	else if(board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O')	{
			
			return true;
			
		}	else if(board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O')	{
			
			return true;
			
		}	else	{
			
			return false;
			
		}
		
	}
	
public static boolean checkVerticalComputer(char[][] board)	{
		
		if(board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O')	{
			
			return true;
			
		}	else if (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O')	{
			
			return true;
			
		}	else if (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O')	{
			
			return true;
			
		}	else	{
			
			return false;
		}
		
	}


public static boolean checkDiagonalComputer(char[][] board)	{
	
	if(board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O')	{
		
		return true;
		
	}	else if(board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O')	{
		
		return true;
		
	}	else	{
		
		return false;
		
	}
}

}
