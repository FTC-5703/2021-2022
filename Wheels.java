package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.robot.Robot;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.Range;
import java.util.ArrayList;

@TeleOp(name= "Wheels", group= "")

public class Wheels extends LinearOpMode {

private DcMotor motorRR;
private DcMotor motorRF;
private DcMotor motorLR;
private DcMotor motorLF;

//RUN ONCE ON INIT()
 @Override
   public void runOpMode() {
    motorRR = hardwareMap.dcMotor.get("motorRR");
    motorRF = hardwareMap.dcMotor.get("motorRF");
    motorLR = hardwareMap.dcMotor.get("motorLR");
    motorLF = hardwareMap.dcMotor.get("motorLF");


    waitForStart();
     while (opModeIsActive()) {
        
        // Put loop blocks here.
        telemetry.update();
        
         //Driving
       motorRR.setPower(gamepad1.right_stick_y);
       motorRF.setPower(gamepad1.right_stick_y);
       motorLR.setPower(gamepad1.left_stick_y);
       motorLF.setPower(-gamepad1.left_stick_y);        
        
 if (gamepad1.right_bumper){
    motorLR.setPower(-1);
    motorLF.setPower(1);
    motorRR.setPower(-1);
    motorRF.setPower(1);   
 
 } else if (gamepad1.left_bumper){
     motorLR.setPower(1);
     motorLF.setPower(-1);
     motorRR.setPower(1);
     motorRF.setPower(-1); 
     
 }else{
     motorLR.setPower(0);
     motorLF.setPower(0);
     motorRR.setPower(0);
     motorRF.setPower(0); 
  }

}}
 
}