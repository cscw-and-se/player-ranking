package dev.mtage.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import dev.mtage.entity.Player;

public class PlayerRepository {
	private Player player1 = new Player("Durant", 33, 29.7, 7.9);
	private Player player2 = new Player("Curry", 33, 27.6, 5.4);
	private Player player3 = new Player("Young", 23, 27.2, 6.8);
	private Player player4 = new Player("Davis", 28, 24.3, 10.3);
	
	public List<Player> getAllPlayers() {
		return new ArrayList<Player>(Arrays.asList(player1, player2, player3, player4));
	}
}
