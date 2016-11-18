package org.firstinspires.ftc.robotcontroller.internal.VelocityVortex;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by 7260 on 9/28/2016.
 */
public class BasicTestMovement extends OpMode {

    /*A Basic movement class for team 7260.
        Used with one motor on the right or
        with both right motors to one port on the right.
     */

    DcMotor RightMotor;             //Right hand motor(s).
    DcMotor LeftMotor;              //Left hand motor(s).

    public void init(){

        //Initilizes hardware.

        RightMotor = hardwareMap.dcMotor.get("Right Motor");
        LeftMotor = hardwareMap.dcMotor.get("Left Motor");

    }

    public void loop(){

        if(gamepad1.right_stick_y > 0){

            RightMotor.setPower(0.5);

        }else if(gamepad1.right_stick_y < 0){

            RightMotor.setPower(-0.5);

        }else {

            RightMotor.setPower(0.0);

        }


        if(gamepad1.left_stick_y > 0){

            LeftMotor.setPower(0.5);

        }else if(gamepad1.left_stick_y < 0){

            LeftMotor.setPower(-0.5);

        }else {

            LeftMotor.setPower(0.0);

        }

    }

}
