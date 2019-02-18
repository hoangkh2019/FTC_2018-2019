package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;

@TeleOp
public class ColorSensorJava extends OpMode {

    ColorSensor colorSensor;

    @Override
    public void init() {

        colorSensor = hardwareMap.get(ColorSensor.class, "colorsensor1");

    }

    @Override
    public void loop() {

        runSampling();

    }

    public void runSampling() {

        telemetry.addLine()
                .addData("a", "%.3f", colorSensor.alpha())
                .addData("r", "%.3f", colorSensor.red())
                .addData("g", "%.3f", colorSensor.green())
                .addData("b", "%.3f", colorSensor.blue());
        telemetry.update();

        int blueValue = colorSensor.blue();
        if (blueValue > 50) {
            //Push center / move to depot   driveLeft()
        } else {
            //Move right    driveForward()
            if (blueValue > 50) {
                //Push right    driveLeft()
                //Move to center    driveBackward()
                //Move to depot     driveLeft()
            } else {
                //Move left     driveBackward()
                if (blueValue > 50) {
                    //Push left     driveLeft()
                    //Move to center    driveForward()
                    //Move to depot     driveLeft()
                } else {
                    //Move to center   driveForward()
                    //Push center / move to depot   driveLeft()
                }
            }
        }
    }
}