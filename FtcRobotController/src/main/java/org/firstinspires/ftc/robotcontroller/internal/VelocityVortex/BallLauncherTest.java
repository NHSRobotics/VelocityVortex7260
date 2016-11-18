package org.firstinspires.ftc.robotcontroller.internal.VelocityVortex;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by 7260 on 10/7/2016.
 */
public class
BallLauncherTest extends OpMode {

    DcMotor RightLauncher; //Right Hand Launching Motor
    DcMotor LeftLauncher; //Left Hand Launching Motor

    Boolean Forward;

    public void init(){

        RightLauncher = hardwareMap.dcMotor.get("RL");      //Initilizes the Right Launcher (RL)
        LeftLauncher = hardwareMap.dcMotor.get("LL");       //Initilizes the Left Launcher (LL)

        RightLauncher.setPower(-1);                          //Sets basic right launcher's power to full.
        LeftLauncher.setPower(1);                           //Sets basic left launcher's power to full.

        Forward = true;                                     //Sets the toggle direction for Forward

    }

    public void loop(){

        if(gamepad1.a = true) {

            if (Forward = true) {

                RightLauncher.setPower(-1);
                LeftLauncher.setPower(1);

                Forward = false;

            }else if (Forward = false){

                RightLauncher.setPower(-1);
                LeftLauncher.setPower(1);

                Forward = true;

            }
        }


    }

}
