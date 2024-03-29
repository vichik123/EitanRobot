package frc.robot;

public class Ports {
    public static final int XBOX = 0;

    public static final int RIGHT_JOYSTICK = 0;
    public static final int LEFT_JOYSTICK = 0;
    public static final int ADDITIONAL_JOYSTICK = 0;

    public static class Drivetrain {
        public static final int FR_MOTOR = 0;
        public static final int FL_MOTOR = 0;
        public static final int RR_MOTOR = 0;
        public static final int RL_MOTOR = 0;

        public static final boolean FR_INVERTED = false;
        public static final boolean FL_INVERTED = false;
        public static final boolean RR_INVERTED = false;
        public static final boolean RL_INVERTED = false;

        public static final boolean FR_SENSOR_PHASE = false;
        public static final boolean FL_SENSOR_PHASE = false;
        public static final boolean RR_SENSOR_PHASE = false;
        public static final boolean RL_SENSOR_PHASE = false;

    }

    public static class Intake {
        public static final int MOTOR_MAIN = 0;

        public static final boolean INVERTED = false;
        public static final boolean SENSOR_PHASE = false;
    }

    public static class Turret {
        public static final int MOTOR_MAIN = 0;
        public static final int MOTOR_AUX = 0;

        public static final boolean MAIN_INVERTED = false;
        public static final boolean AUX_INVERTED = false;

        public static final boolean MAIN_SENSOR_PHASE = false;
        public static final boolean AUX_SENSOR_PHASE = false;
    }

    public static class Funnel {
        public static final int MOTOR_MAIN = 0;

        public static final boolean MAIN_INVERTED = false;
        public static final boolean MAIN_SENSOR_PHASE = false;
    }

    public static class Shooter {
        public static final int MOTOR_MAIN = 0;
        public static final int MOTOR_AUX1 = 0;
        public static final int MOTOR_AUX2 = 0;

        public static final boolean MAIN_INVERTED = false;
        public static final boolean AUX1_INVERTED = false;
        public static final boolean AUX2_INVERTED = false;

        public static final boolean MAIN_SENSOR_PHASE = false;
        public static final boolean AUX1_SENSOR_PHASE = false;
        public static final boolean AUX2_SENSOR_PHASE = false;
    }
}
