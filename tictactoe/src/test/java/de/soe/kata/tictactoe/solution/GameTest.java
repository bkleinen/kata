package de.soe.kata.tictactoe.solution;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;

import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.soe.kata.tictactoe.model.Game;
import de.soe.kata.tictactoe.model.GameBoard;

public class GameTest {
	GameImpl toTest;
	GameBoard gameBoard = new GameBoard();
	
	@Before
	public void setUp() throws Exception {
		toTest = new GameImpl(gameBoard);
	}

	@Test
	public void toGameBoardReturnsGameBoard() {
		assertThat(toTest.toGameBoard(), is(gameBoard));

	}

	@Test
	public void gameBoardToMatrixShouldCreateMatrix() {
		gameBoard.getFields().get(0).setContent("X");
		gameBoard.getFields().get(1).setContent("O");
		
		int[][] field = toTest.gameBoardToMatrix(gameBoard);
		assertThat(field[0][0],is(1));
		assertThat(field[0][1],is(8));
		
	}

	@Test
	public void copyConstructorCreatesClone() {
		gameBoard.getFields().get(0).setContent("X");
		gameBoard.getFields().get(4).setContent("X");
			int[][] field = toTest.gameBoardToMatrix(gameBoard);
		GameBoard clone = toTest.matrixToGameBoard(field);
		assertThat(clone == gameBoard, is(false));
		assertThat(clone, is(gameBoard));
		gameBoard.getFields().get(5).setContent("O");
		assertThat(clone, is(not(gameBoard)));
				

	}

}
