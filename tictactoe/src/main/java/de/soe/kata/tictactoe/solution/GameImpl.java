package de.soe.kata.tictactoe.solution;

import java.util.List;

import de.soe.kata.tictactoe.model.Field;
import de.soe.kata.tictactoe.model.Game;
import de.soe.kata.tictactoe.model.GameBoard;

public class GameImpl implements Game {
	public static final int winning_lines[][] = 
		{{0,1,2},{3,4,5},{6,7,8},
		 {0,3,6},{1,4,7},{2,5,8},
		 {0,4,8},{2,4,6}};
	private int current_field[][] = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
	GameBoard currentGameBoard;

	public GameImpl(GameBoard gameBoard) {
		currentGameBoard = gameBoard;
	}
	
	@Override
	public void play(GameBoard gameBoard) {
		
		int[][] new_field = gameBoardToMatrix(gameBoard);
		if (!validMove(current_field,new_field)) 
			return;		
		current_field = new_field;
	//	if (isFinished(current_field)) gameBoard.setFinished(true);
		System.out.println("in Game play");

	}

    boolean validMove(int[][] last_field, int[][] new_field) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSolved() {
		// TODO Auto-generated method stub
		//throw new IllegalArgumentException("Illegal Move");
		
		return false;
	}

	@Override
	public GameBoard toGameBoard() {
		return currentGameBoard;
	}

	int[][] gameBoardToMatrix(GameBoard gameBoard) {
		List<Field> fields = gameBoard.getFields();
		int result[][] = new int[3][3];
		for (int i = 0; i < fields.size(); i++) {
			result[i / 3][i % 3] = fieldToInt(fields.get(i));
		}
		return result;
	}

	 GameBoard matrixToGameBoard(int[][] matrix) {
		GameBoard result = new GameBoard();
		List<Field> fields = result.getFields();
		for (int i = 0; i < fields.size(); i++) {
			fields.get(i).setContent(intToField(matrix[i / 3][i % 3]));
		} 
		return result;
	}
	int fieldToInt(Field field) {
		if ("X".equals(field.getContent()))
			return 1;
		else if ("O".equals(field.getContent()))
			return 8;
		return 0;
	}
	 String intToField(int i) {
		switch (i) {
		case 0:
			return null;
		case 1:
			return "X";
		case 8: 
			return "O";
				}
		return null;
	}

}
