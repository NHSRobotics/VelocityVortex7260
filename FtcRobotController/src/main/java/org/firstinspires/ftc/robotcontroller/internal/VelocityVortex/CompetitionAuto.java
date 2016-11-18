package org.firstinspires.ftc.robotcontroller.internal.VelocityVortex;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcontroller.internal.general.MovementAuto;


/**
 * Created by 7260 on 10/29/2016.
 */
public class CompetitionAuto extends OpMode {
    MovementAuto chassis;
    double counts = 0;
    int state = 0;
    long CD = System.currentTimeMillis();   //Creates a variable for the storage of time known as CD ("Cooldown").

    public void init(){

        chassis = new  MovementAuto(hardwareMap.dcMotor.get("LD"), hardwareMap.dcMotor.get("RD"), 4, 1, 560);

    }

    public void loop(){


            switch (state) {
                case 0:
                    CD = System.currentTimeMillis();
                    state++;
                    break;

                case 1:
                    chassis.leftMotor.setPower(.6);
                    chassis.rightMotor.setPower(.6);
                    break;

                default:
                    break;

        }
    }

}


