package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

// Written by Team 7618 on 1/10/19

@Autonomous(name = "AutonomousDepotJava")
public class AutoDepotJava extends LinearOpMode {

    DcMotor driveFL;
    DcMotor driveFR;
    DcMotor driveBR;
    DcMotor driveBL;

    //DcMotor lifter;
    //Servo servo1;

    public void runOpMode() {

        driveFL = hardwareMap.dcMotor.get("FLmotor");
        driveFR = hardwareMap.dcMotor.get("FRmotor");
        driveBR = hardwareMap.dcMotor.get("BRmotor");
        driveBL = hardwareMap.dcMotor.get("BLmotor");
        //lifter = hardwareMap.dcMotor.get("Lift");
        //servo1 = hardwareMap.servo.get("servo1");

        driveFL.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        driveFR.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        driveBR.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        driveBL.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        //lifter.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        //servo1.setPosition(0);

        waitForStart();

        //liftUp(4800);
        //driveLeft(500);
        //liftDown(4200);

        driveForward(1000);
        driveLeft(1000);
        driveBackward(1000);
        //driveLeft(800);


        //driveCounterClockwise(200);
        //servoDrop();
        //driveBackward(2800);
    }
/*
    public void liftUp (int EncoderValue) {
        int TargetLifter = lifter.getCurrentPosition() - EncoderValue;
        lifter.setPower(0.5);
        while (lifter.getCurrentPosition() > TargetLifter) {
            lifter.setTargetPosition(-TargetLifter);
        }
        lifter.setPower(0);
    }

    public void liftDown (int EncoderValue) {
        int TargetLifter = lifter.getCurrentPosition() + EncoderValue;
        lifter.setPower(0.5);
        while (lifter.getCurrentPosition() < TargetLifter) {
            lifter.setTargetPosition(-TargetLifter);
        }
        lifter.setPower(0);
    }

    /*public void servoDrop() {
        servo1.setPosition(0.4);
    }*/

    public void driveCounterClockwise(int EncoderValue) {
        int TargetFL = driveFL.getCurrentPosition() + EncoderValue;
        int TargetFR = driveFR.getCurrentPosition() + EncoderValue;
        int TargetBR = driveBR.getCurrentPosition() + EncoderValue;
        int TargetBL = driveBL.getCurrentPosition() + EncoderValue;

        driveFL.setPower(0.25);
        driveFR.setPower(0.25);
        driveBR.setPower(0.25);
        driveBL.setPower(0.25);

        while (driveFL.getCurrentPosition() < TargetFL && driveFR.getCurrentPosition() < TargetFR && driveBR.getCurrentPosition() < TargetBR && driveBL.getCurrentPosition() < TargetBL) {
            driveFL.setTargetPosition(-TargetFL);
            driveFR.setTargetPosition(-TargetFR);
            driveBR.setTargetPosition(-TargetBR);
            driveBL.setTargetPosition(-TargetBL);
        }

        driveFL.setPower(0);
        driveFR.setPower(0);
        driveBR.setPower(0);
        driveBL.setPower(0);
    }

    public void driveLeft(int EncoderValue) {
        int TargetFL = driveFL.getCurrentPosition() + EncoderValue;
        int TargetFR = driveFR.getCurrentPosition() + EncoderValue;
        int TargetBR = driveBR.getCurrentPosition() - EncoderValue;
        int TargetBL = driveBL.getCurrentPosition() - EncoderValue;

        driveFL.setPower(0.25);
        driveFR.setPower(0.25);
        driveBR.setPower(0.25);
        driveBL.setPower(0.25);

        while (driveFL.getCurrentPosition() < TargetFL && driveFR.getCurrentPosition() < TargetFR && driveBR.getCurrentPosition() > TargetBR && driveBL.getCurrentPosition() > TargetBL) {
            driveFL.setTargetPosition(-TargetFL);
            driveFR.setTargetPosition(-TargetFR);
            driveBR.setTargetPosition(-TargetBR);
            driveBL.setTargetPosition(-TargetBL);
        }

        driveFL.setPower(0);
        driveFR.setPower(0);
        driveBR.setPower(0);
        driveBL.setPower(0);
    }

    public void driveForward(int EncoderValue) {
        int TargetFL = driveFL.getCurrentPosition() - EncoderValue;
        int TargetFR = driveFR.getCurrentPosition() + EncoderValue;
        int TargetBR = driveBR.getCurrentPosition() + EncoderValue;
        int TargetBL = driveBL.getCurrentPosition() - EncoderValue;

        driveFL.setPower(0.25);
        driveFR.setPower(0.25);
        driveBR.setPower(0.25);
        driveBL.setPower(0.25);

        while (driveFL.getCurrentPosition() > TargetFL && driveFR.getCurrentPosition() < TargetFR && driveBR.getCurrentPosition() < TargetBR && driveBL.getCurrentPosition() > TargetBL) {
            driveFL.setTargetPosition(-TargetFL);
            driveFR.setTargetPosition(-TargetFR);
            driveBR.setTargetPosition(-TargetBR);
            driveBL.setTargetPosition(-TargetBL);
        }

        driveFL.setPower(0);
        driveFR.setPower(0);
        driveBR.setPower(0);
        driveBL.setPower(0);
    }

    public void driveBackward(int EncoderValue) {
        int TargetFL = driveFL.getCurrentPosition() + EncoderValue;
        int TargetFR = driveFR.getCurrentPosition() - EncoderValue;
        int TargetBR = driveBR.getCurrentPosition() - EncoderValue;
        int TargetBL = driveBL.getCurrentPosition() + EncoderValue;

        driveFL.setPower(0.25);
        driveFR.setPower(0.25);
        driveBR.setPower(0.25);
        driveBL.setPower(0.25);

        while (driveFL.getCurrentPosition() < TargetFL && driveFR.getCurrentPosition() > TargetFR && driveBR.getCurrentPosition() > TargetBR && driveBL.getCurrentPosition() < TargetBL) {
            driveFL.setTargetPosition(-TargetFL);
            driveFR.setTargetPosition(-TargetFR);
            driveBR.setTargetPosition(-TargetBR);
            driveBL.setTargetPosition(-TargetBL);
        }

        driveFL.setPower(0);
        driveFR.setPower(0);
        driveBR.setPower(0);
        driveBL.setPower(0);
    }
}
