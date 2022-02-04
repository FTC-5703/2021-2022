package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.CRServo;
@Autonomous(name="Moving_two_wheels21", group = "OpMode" )

public class Moving_two_wheels21 extends LinearOpMode {
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
      
      //sleep(1000);
      
      //drives forward 40"
     LiftMotor.setPower(-.4);
      motorLF.setPower(-.5);
      motorRF.setPower(-.65);
      motorLR.setPower(-.5);
      motorRR.setPower(-.65);
      sleep(1232);
      LiftMotor.setPower(-0.6);
      sleep(240);
      //brake function:
        motorRR.setPower(.010);
       LiftMotor.setPower(0.0);
      motorLF.setPower(.010);
        motorRF.setPower(.010);
       motorLR.setPower(.010);
      
      sleep(100);
      
    
      /*
      //drives back ~27"
        motorRR.setPower(-.5);
      //  LiftMotor.setPower(.5);
        motorLF.setPower(-.5);
        motorRF.setPower(-.5);
       motorLR.setPower(-.5);
      
      sleep(900);
      
      
      //brake function:
      motorRR.setPower(.010);
     // LiftMotor.setPower(0.3);
      motorLF.setPower(.010);
      motorRF.setPower(.010);
       motorLR.setPower(.010);
      
      sleep(100);
      */
      //allows the motors to stop spinning
      motorRR.setPower(0.0);
      LiftMotor.setPower(0.0);
      motorLF.setPower(0.0);
      motorRF.setPower(0.0);
      
      sleep(100);
      
      //turns right almost 90 degrees
      motorRR.setPower(0.65);
     // LiftMotor.setPower(0.3);
      motorLF.setPower(-0.65);
      motorRF.setPower(0.65);
      motorLR.setPower(-0.65);
      
      sleep(333);
      
        //brake function:
        motorRR.setPower(.010);
       LiftMotor.setPower(0.0);
      motorLF.setPower(.010);
        motorRF.setPower(.010);
       motorLR.setPower(.010);
      
      motorRR.setPower(0.0);
      LiftMotor.setPower(0.0);
      motorLF.setPower(0.0);
      motorRF.setPower(0.0);
     
      sleep(2000);
      
    //  LiftMotor.setPower(.9);
      sleep(235);
      
      
      //drives forward 6"
    motorRR.setPower(-.5);
     //LiftMotor.setPower(.9);
      motorLF.setPower(-.5);
      motorRF.setPower(-.5);
      motorLR.setPower(-.5);
       
      sleep(235);
      
    
      //brake function:
        motorRR.setPower(.010);
       LiftMotor.setPower(0.0);
      motorLF.setPower(.010);
        motorRF.setPower(.010);
       motorLR.setPower(.010);
      
      sleep(100);
      
      //motors stop moving
        motorRR.setPower(0.0);
        motorLR.setPower(0.0);
      LiftMotor.setPower(0.0);
      motorLF.setPower(0.0);
      motorRF.setPower(0.0);
       orgServo.setPower(-0.5);
     sleep(2000);
     
     /*
      //turns right almost 90 degrees
      motorRR.setPower(-1.0);
     // LiftMotor.setPower(0.3);
      motorLF.setPower(1.0);
      motorRF.setPower(-1.0);
      motorLR.setPower(1.0);
      sleep(500);
      
      //drives backward 40"
     LiftMotor.setPower(0.1);
      motorLF.setPower(0.1);
      motorRF.setPower(0.1);
      motorLR.setPower(0.1);
      
      sleep(1232);
      
      //brake function:
        motorRR.setPower(-.010);
       LiftMotor.setPower(0.0);
      motorLF.setPower(-.010);
        motorRF.setPower(-.010);
       motorLR.setPower(-.010);
      
      sleep(100);
      
   }  
      */
      
      
      
      


    
}}
