package linojulio.design.patterns.training.strategy;

import linojulio.design.patterns.training.strategy.usecase.*;
import linojulio.design.patterns.training.strategy.usecase.model.Direction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StrategyTest {

    @Test
    public void shouldAssertMovementInitialization() {

        Assertions.assertEquals(
                Direction.UP,
                new MovementImpl(new MoveUp()).getMovementDirection().move()
        );
        Assertions.assertEquals(
                Direction.DOWN,
                new MovementImpl(new MoveDown()).getMovementDirection().move()
        );
        Assertions.assertEquals(
                Direction.LEFT,
                new MovementImpl(new MoveLeft()).getMovementDirection().move()
        );
        Assertions.assertEquals(
                Direction.RIGHT,
                new MovementImpl(new MoveRight()).getMovementDirection().move()
        );
        Assertions.assertNotEquals(
                Direction.RIGHT,
                new MovementImpl(new MoveUp()).getMovementDirection().move()
        );
        Assertions.assertNotEquals(
                Direction.LEFT,
                new MovementImpl(new MoveDown()).getMovementDirection().move()
        );
    }

    @Test
    public void shouldAssertSetMovement() {
        var movement = new MovementImpl(new MoveUp());

        Assertions.assertEquals(
                Direction.UP,
                movement.getMovementDirection().move()
        );
        Assertions.assertNotEquals(
                Direction.RIGHT,
                movement.getMovementDirection().move()
        );

        movement.setMovementDirection(new MoveRight());

        Assertions.assertEquals(
                Direction.RIGHT,
                movement.getMovementDirection().move()
        );
        Assertions.assertNotEquals(
                Direction.UP,
                movement.getMovementDirection().move()
        );
    }

}
