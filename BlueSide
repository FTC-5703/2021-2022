package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.CRServo;

@Autonomous(name="BlueSide", group = "OpMode" )
public class BlueSide extends LinearOpMode {

   DcMotor motorRR;
   DcMotor LiftMotor;
   DcMotor motorLF;
   DcMotor motorRF;
   DcMotor motorLR;
   CRServo orgServo;
   
   public void runOpMode() throws InterruptedException 
   {
      motorRR = hardwareMap.dcMotor.get("motorRR");
      LiftMotor = hardwareMap.dcMotor.get("LiftMotor");
      motorLF = hardwareMap.dcMotor.get("motorLF");
      motorRF = hardwareMap.dcMotor.get("motorRF");
      motorLR = hardwareMap.dcMotor.get("motorLR");
      orgServo = hardwareMap.crservo.get("orgServo");
      
    // motorRR.setDirection(DcMotor.Direction.REVERSE);
      motorLF.setDirection(DcMotor.Direction.REVERSE);
       motorLR.setDirection(DcMotor.Direction.REVERSE);
   
         telemetry.addData("Mode", "Blue1");
      telemetry.update();
      
      waitForStart();
      
      telemetry.addData("Mode", "Blue1");
      telemetry.update();
   
   
   
    //drive into warehouse
      motorLF.setPower(-.70);
      motorRF.setPower(-1.0);
      motorLR.setPower(-.70);
      motorRR.setPower(-1.0);
      sleep(400);
}}
