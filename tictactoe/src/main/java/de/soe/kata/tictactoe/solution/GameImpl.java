package de.soe.kata.tictactoe.solution;

import de.soe.kata.tictactoe.model.Game;
import de.soe.kata.tictactoe.model.GameBoard;

public class GameImpl implements Game {
	GameBoard currentGameBoard ;

	public GameImpl(GameBoard gameBoard) {
		currentGameBoard = gameBoard;
	}

	@Override
	public void play(GameBoard gameBoard) {
		//validMove(gameBoard);
		//if (isFinished(gameBoard)) gameBoard.setFinished(true);
		System.out.println("in Game play");
		
	}

	@Override
	public boolean isSolved() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public GameBoard toGameBoard() {
		return currentGameBoard;
	}

}
