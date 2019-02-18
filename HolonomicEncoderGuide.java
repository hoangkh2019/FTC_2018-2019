package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
@TeleOp(name="Holonomic Encoder Guide")
public class HolonomicEncoderGuide extends LinearOpMode {

    DcMotor driveFL;
    DcMotor driveFR;
    DcMotor driveBR;
    DcMotor driveBL;

    @Override
    public void runOpMode() {
        driveFL = hardwareMap.dcMotor.get("FLmotor");
        driveFR = hardwareMap.dcMotor.get("FRmotor");
        driveBR = hardwareMap.dcMotor.get("BRmotor");
        driveBL = hardwareMap.dcMotor.get("BLmotor");

        driveFL.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        driveFR.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        driveBR.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        driveBL.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        waitForStart();
        driveForward(1000);
        sleep(1000);
        driveBackward(1000);
        sleep(1000);
        driveLeft(1000);
        sleep(1000);
        driveRight(1000);
        sleep(1000);
        driveClockwise(1000);
        sleep(1000);
        driveCounterClockwise(1000);
        sleep(1000);
    }

// + EncoderValue = wheel spins clockwise and needs <
// - EncoderValue = wheel spins counterclockwise and needs >

    public void driveForward (int EncoderValue) {
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

    public void driveBackward (int EncoderValue) {
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

    public void driveLeft (int EncoderValue) {
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

    public void driveRight (int EncoderValue) {
        int TargetFL = driveFL.getCurrentPosition() - EncoderValue;
        int TargetFR = driveFR.getCurrentPosition() - EncoderValue;
        int TargetBR = driveBR.getCurrentPosition() + EncoderValue;
        int TargetBL = driveBL.getCurrentPosition() + EncoderValue;

        driveFL.setPower(0.25);
        driveFR.setPower(0.25);
        driveBR.setPower(0.25);
        driveBL.setPower(0.25);

        while (driveFL.getCurrentPosition() > TargetFL && driveFR.getCurrentPosition() > TargetFR && driveBR.getCurrentPosition() < TargetBR && driveBL.getCurrentPosition() < TargetBL) {
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

    public void driveClockwise (int EncoderValue) {
        int TargetFL = driveFL.getCurrentPosition() - EncoderValue;
        int TargetFR = driveFR.getCurrentPosition() - EncoderValue;
        int TargetBR = driveBR.getCurrentPosition() - EncoderValue;
        int TargetBL = driveBL.getCurrentPosition() - EncoderValue;

        driveFL.setPower(0.25);
        driveFR.setPower(0.25);
        driveBR.setPower(0.25);
        driveBL.setPower(0.25);

        while (driveFL.getCurrentPosition() > TargetFL && driveFR.getCurrentPosition() > TargetFR && driveBR.getCurrentPosition() > TargetBR && driveBL.getCurrentPosition() > TargetBL) {
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

    public void driveCounterClockwise (int EncoderValue) {
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
}
