package frc.robot.util.OI;

import edu.wpi.first.wpilibj2.command.button.Trigger;
import java.util.function.DoubleSupplier;

public interface OI {
    public final Trigger noButton = new Trigger(() -> false);
    public final DoubleSupplier noAxis = () -> 0.0;

    default Trigger button1() {
        return noButton;
    }

    default Trigger button2() {
        return noButton;
    }

    default Trigger button3() {
        return noButton;
    }

    default Trigger button4() {
        return noButton;
    }
}
