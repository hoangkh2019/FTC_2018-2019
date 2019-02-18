package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

// Written by Team 7618
@TeleOp(name = "TeleOpJava")
public class TeleOpJava extends OpMode {

    DcMotor driveFL;
    DcMotor driveFR;
    DcMotor driveBR;
    DcMotor driveBL;

    DcMotor lifter;
    //DcMotor scorer;
    //DcMotor collection;

    @Override
    public void init() {

        driveFL = hardwareMap.dcMotor.get("FLmotor");
        driveFR = hardwareMap.dcMotor.get("FRmotor");
        driveBR = hardwareMap.dcMotor.get("BRmotor");
        driveBL = hardwareMap.dcMotor.get("BLmotor");
        lifter = hardwareMap.dcMotor.get("Lift");
        //scorer = hardwareMap.dcMotor.get("Score");
        //collection = hardwareMap.dcMotor.get("Collect");

    }

    @Override
    public void loop() {

// Holonomic drive for the cardinal directions
        if (gamepad2.a == true) {
            double drivePower = 0.25;
            float rotatePower = gamepad2.right_stick_x;
            if (rotatePower != 0) {
                driveFL.setPower(rotatePower);
                driveFR.setPower(rotatePower);
                driveBR.setPower(rotatePower);
                driveBL.setPower(rotatePower);
            } else if (gamepad2.dpad_up == true) {
                driveFL.setPower(-drivePower);
                driveFR.setPower(drivePower);
                driveBR.setPower(drivePower);
                driveBL.setPower(-drivePower);
            } else if (gamepad2.dpad_down == true) {
                driveFL.setPower(drivePower);
                driveFR.setPower(-drivePower);
                driveBR.setPower(-drivePower);
                driveBL.setPower(drivePower);
            } else if (gamepad2.dpad_right == true) {
                driveFL.setPower(-drivePower);
                driveFR.setPower(-drivePower);
                driveBR.setPower(drivePower);
                driveBL.setPower(drivePower);
            } else if (gamepad2.dpad_left == true) {
                driveFL.setPower(drivePower);
                driveFR.setPower(drivePower);
                driveBR.setPower(-drivePower);
                driveBL.setPower(-drivePower);
            } else {
                driveFL.setPower(0);
                driveFR.setPower(0);
                driveBR.setPower(0);
                driveBL.setPower(0);
            }
        } else {
            double drivePower = 1;
            float rotatePower = gamepad2.right_stick_x;
            if (rotatePower != 0) {
                driveFL.setPower(rotatePower);
                driveFR.setPower(rotatePower);
                driveBR.setPower(rotatePower);
                driveBL.setPower(rotatePower);
            } else if (gamepad2.dpad_up == true) {
                driveFL.setPower(-drivePower);
                driveFR.setPower(drivePower);
                driveBR.setPower(drivePower);
                driveBL.setPower(-drivePower);
            } else if (gamepad2.dpad_down == true) {
                driveFL.setPower(drivePower);
                driveFR.setPower(-drivePower);
                driveBR.setPower(-drivePower);
                driveBL.setPower(drivePower);
            } else if (gamepad2.dpad_right == true) {
                driveFL.setPower(-drivePower);
                driveFR.setPower(-drivePower);
                driveBR.setPower(drivePower);
                driveBL.setPower(drivePower);
            } else if (gamepad2.dpad_left == true) {
                driveFL.setPower(drivePower);
                driveFR.setPower(drivePower);
                driveBR.setPower(-drivePower);
                driveBL.setPower(-drivePower);
            } else {
                driveFL.setPower(0);
                driveFR.setPower(0);
                driveBR.setPower(0);
                driveBL.setPower(0);
            }
        }

// Lifter with Left Trigger and Right Trigger
        if (gamepad2.left_trigger == 1) {
            lifter.setPower(-1);
        } else if (gamepad2.right_trigger == 1) {
            lifter.setPower(1);
        } else {
            lifter.setPower(0);
        }

/*

// Score with Left Stick Y-value
        float scorePower = gamepad2.left_stick_y;
        scorer.setPower(scorePower);

// Collection with X Button
        if (gamepad2.x == true) {
            collection.setPower(1);
        } else {
            collection.setPower(0);
        }

*/
    }
}
