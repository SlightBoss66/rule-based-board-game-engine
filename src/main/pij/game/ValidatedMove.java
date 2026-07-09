package pij.game;

import java.util.List;

import pij.board.Direction;


public record ValidatedMove(String mainWord, List<Placement> placements, Direction direction) {
    public ValidatedMove(String mainWord, List<Placement> placements) {
        this(mainWord, placements, null);
    }
}
