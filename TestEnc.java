package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "TestEnc")
public class TestEnc extends LinearOpMode {

    DcMotor lifter;

    public void runOpMode() {
        lifter = hardwareMap.dcMotor.get("BRmotor");
        lifter.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        telemetry.addData("Current", lifter.getCurrentPosition());
        telemetry.update();

        waitForStart();
        lifter.setPower(0.75);
        int Target = lifter.getCurrentPosition() + 2000;

        while (lifter.getCurrentPosition() < Target) {
            lifter.setTargetPosition(-Target);
            telemetry.addData("Current", lifter.getCurrentPosition());
            telemetry.addData("Target", Target);
            telemetry.update();
        }
        lifter.setPower(0);

        telemetry.addData("Current", lifter.getCurrentPosition());
        telemetry.addData("Target", Target);
        telemetry.update();

        sleep(2000);

        lifter.setPower(0.75);
        int Target2 = lifter.getCurrentPosition() - 2000;

        while (lifter.getCurrentPosition() > Target2) {
            lifter.setTargetPosition(-Target2);
            telemetry.addData("Current", lifter.getCurrentPosition());
            telemetry.addData("Target", Target);
            telemetry.update();
        }
        lifter.setPower(0);

        telemetry.addData("Current", lifter.getCurrentPosition());
        telemetry.addData("Target", Target2);
        telemetry.update();


    }

}