package de.soe.kata.tictactoe.solution;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.soe.kata.tictactoe.model.Game;
import de.soe.kata.tictactoe.model.GameBoard;


public class GameTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void toGameBoardReturnsGameBoard() {
		GameBoard gameBoard = new GameBoard();
		Game game = new GameImpl(gameBoard);
		assertThat(game.toGameBoard(), is(gameBoard));
		
	}

}
