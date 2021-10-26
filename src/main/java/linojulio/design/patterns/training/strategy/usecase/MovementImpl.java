package linojulio.design.patterns.training.strategy.usecase;

import linojulio.design.patterns.training.strategy.boundary.Movement;

public class MovementImpl {
    private Movement movementDirection;

    public MovementImpl(Movement startingDirection) {
        this.movementDirection = startingDirection;
    }

    public Movement getMovementDirection() {
        return movementDirection;
    }

    public void setMovementDirection(Movement movementDirection) {
        this.movementDirection = movementDirection;
    }
}
