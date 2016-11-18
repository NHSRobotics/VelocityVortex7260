package org.firstinspires.ftc.robotcontroller.internal.VelocityVortex;

import android.provider.Settings;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by 7260 on 10/28/2016.
 */
public class CompetitionTeleOp extends OpMode {

    DcMotor RD;             //Creates the DC Motor for RD ("Right Drive"). This motor is our right hand drive motor.
    DcMotor LD;             //Creates the DC Motor for LD ("Left Drive"). This motor is our left hand drive motor.

    DcMotor L;              //Creates the DC Motor for L ("Launchers"). This motor is our launcher motors for the ball launcher

    DcMotor Con;      //Creates the DC Motor for Con ("Conveyer Belt"). This motor is our conveyer belf motor for the loading mechanism.

    Servo Arm;              //Creates the Servo for Arm ("Servo Arm"). This servo is our loading arm for out loading mechanism.

    boolean ArmPosUp = false;   //Creates the variable for is the arm position up. If true the arm is out, if false then the arm is in.

        long CD = System.currentTimeMillis();   //Creates a variable for the storage of time known as CD ("Cooldown").

public void init() {

    RD = hardwareMap.dcMotor.get("RD");
    LD = hardwareMap.dcMotor.get("LD");

    L = hardwareMap.dcMotor.get("L");

    Con = hardwareMap.dcMotor.get("con");

    Arm = hardwareMap.servo.get("Arm");

    Arm.setPosition(0);


}

    public void loop(){

        if(gamepad1.right_stick_y > 0){

            RD.setPower(1);

        }else if(gamepad1.right_stick_y < 0){

            RD.setPower(-1);

        }else{

            RD.setPower(0);

        }

        if(gamepad1.left_stick_y > 0){

            LD.setPower(-1);

        }else if(gamepad1.left_stick_y < 0){

            LD.setPower(1);

        }else {

            LD.setPower(0);

        }

        if(gamepad1.right_trigger > 0){

            L.setPower(-1);

        }else {

            L.setPower(0);

        }


        if(gamepad1.left_trigger > 0){

            Con.setPower(.5);

        }else if(gamepad1.left_bumper){

            Con.setPower(-.5);

        } else {

            Con.setPower(0);

        }
        if(gamepad1.a && System.currentTimeMillis() - CD > 1000) {
            if (!ArmPosUp) {

                Arm.setPosition(1);

                ArmPosUp = true;

            } else {

                Arm.setPosition(0);

                ArmPosUp = false;

            }
        }



    }




}



