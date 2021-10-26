package linojulio.design.patterns.training.strategy.usecase;

import linojulio.design.patterns.training.strategy.boundary.Movement;
import linojulio.design.patterns.training.strategy.usecase.model.Direction;

public class MoveLeft implements Movement {
    @Override
    public Direction move() { return Direction.LEFT; }
}
