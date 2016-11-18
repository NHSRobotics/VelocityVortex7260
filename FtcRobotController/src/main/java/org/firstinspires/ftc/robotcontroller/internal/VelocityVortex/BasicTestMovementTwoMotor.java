package org.firstinspires.ftc.robotcontroller.internal.VelocityVortex;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by 7260 on 9/28/2016.
 */
public class BasicTestMovementTwoMotor  extends OpMode{

    DcMotor RightMotor1;                //Right hand front Motor.
    DcMotor RightMotor2;                //Right hand rear Motor.

    DcMotor LeftMotor1;                 //Left hand front Motor.
    DcMotor LeftMotor2;                 //Left hand rear Motor.

    public void init(){

        //Initilizes hardware.

        RightMotor1 = hardwareMap.dcMotor.get("Right Motor 1");
        RightMotor2 = hardwareMap.dcMotor.get("Right Motor 2");

        LeftMotor1 = hardwareMap.dcMotor.get("Left Motor 1");
        LeftMotor2 = hardwareMap.dcMotor.get("Left Motor 2");

    }

    public void loop(){

        //Determines if the right stick is pushed up or down on the Y & drives in the given direction.

        if (gamepad1.right_stick_y > 0){

            RightMotor1.setPower(0.5);
            RightMotor2.setPower(0.5);

        }else if (gamepad1.right_stick_y < 0){

            RightMotor1.setPower(-0.5);
            RightMotor2.setPower(-0.5);

        }else {

            RightMotor1.setPower(0.0);
            RightMotor2.setPower(0.0);

        }

        //Determines if the left stick is pushed up or down on the Y & drives in the given direction.

        if (gamepad1.left_stick_y > 0){

            LeftMotor1.setPower(-0.5);
            LeftMotor2.setPower(-0.5);

        }else if (gamepad1.left_stick_y < 0){

            LeftMotor1.setPower(0.5);
            LeftMotor2.setPower(0.5);

        }else {

            LeftMotor1.setPower(0.0);
            LeftMotor2.setPower(0.0);

        }

    }

}
