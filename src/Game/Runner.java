package Game;

import People.Person;
import Rooms.BattleRoom;
import Rooms.Board;
import Rooms.Room;
import Rooms.WinningRoom;
import People.Inventory;
import java.util.Scanner;

public class Runner {
	

	private static boolean gameOn = true;

	private static int x = (int)(Math.random()*10) +5;
	private static int y = (int)(Math.random()*10) +5;

	private static Room[][] map = new Room[x][y];

	public static int randomGenX(){
		return (int)(Math.random()*map.length);
	}

	public static void main(String[] args)
	{
		Board Board = new Board(map);

		//Fill the building with normal rooms
		for (int x = 0; x<map.length; x++)
		{
			for (int y = 0; y < map[x].length; y++)
			{
				map[x][y] = new Room(x,y);
			}
		}


		//Create a random winning room.
		int x = (int)(Math.random()*map.length);
		int y = (int)(Math.random()*map.length);
		map[x][y] = new WinningRoom(x, y);
		Inventory playerinventory = new Inventory();



		 //Setup player 1 and the input scanner
		Person player1 = new Person("Timothy", "Wry", 0,0);
		map[0][0].enterRoom(player1);
		Scanner in = new Scanner(System.in);
		while(gameOn)
		{
			Board.print();
			System.out.println("Where would you like to move? (Choose N, S, E, W)");
			String move = in.nextLine();
			if(validMove(move, player1, map))
			{
				System.out.println("Your coordinates: row = " + player1.getxLoc() + " col = " + player1.getyLoc());
				
			}
			else {
				System.out.println("Please choose a valid move.");
			}
			
			
		}
		in.close();
	}

	/**
	 * Checks that the movement chosen is within the valid game map.
	 * @param move the move chosen
	 * @param p person moving
	 * @param map the 2D array of rooms
	 * @return
	 */
	public static boolean validMove(String move, Person p, Room[][] map)
	{
		move = move.toLowerCase().trim();
		switch (move) {
			case "n":
				if (p.getxLoc() > 0)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()-1][p.getyLoc()].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}
			case "e":
				if (p.getyLoc()< map[p.getyLoc()].length -1)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()][p.getyLoc() + 1].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}

			case "s":
				if (p.getxLoc() < map.length - 1)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()+1][p.getyLoc()].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}

			case "w":
				if (p.getyLoc() > 0)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()][p.getyLoc()-1].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}
			default:
				break;
					
		}
		return true;
	}
	public static void gameOff()
	{
		gameOn = false;
	}
	


}
