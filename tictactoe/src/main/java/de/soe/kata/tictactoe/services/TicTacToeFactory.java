package de.soe.kata.tictactoe.services;

import org.springframework.stereotype.Component;

import com.google.common.base.Optional;

import de.soe.kata.tictactoe.model.Game;
import de.soe.kata.tictactoe.model.GameBoard;
import de.soe.kata.tictactoe.solution.GameImpl;

@Component
public class TicTacToeFactory implements GameFactory {
    @Override
    public Optional<Game> create(final GameBoard gameBoard) {
        return  Optional.of((Game)(new GameImpl(gameBoard)));
    }
}
