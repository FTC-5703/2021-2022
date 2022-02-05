//Import Packages
package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.TouchSensor;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;


@TeleOp(name = "TeleOp_Comp_2021", group = "")
public class TeleOP_Comp_2021 extends LinearOpMode  {

   //Define Motors and Touchsenor
  private DcMotor motorRR;
  private DcMotor motorRF;
  private DcMotor motorLR;
  private DcMotor motorLF;
  //private REVTouchSensor Grabberlimit;
  private DcMotor LiftMotor;
  private DcMotor Duckmotor;
  private CRServo orgServo;
  //private TouchSensor Grabberlimit;

   //Hardware Map
  @Override
  public void runOpMode() {
    motorRR = hardwareMap.dcMotor.get("motorRR");
    motorRF = hardwareMap.dcMotor.get("motorRF");
    motorLR = hardwareMap.dcMotor.get("motorLR");
    motorLF = hardwareMap.dcMotor.get("motorLF");
    orgServo = hardwareMap.crservo.get("orgServo");
    LiftMotor = hardwareMap.dcMotor.get("LiftMotor");
    Duckmotor = hardwareMap.dcMotor.get("Duckmotor");
    //Grabberlimit = hardwareMap.touchSensor.get("Grabberlimit");
       motorLR.setDirection(DcMotor.Direction.REVERSE);
       motorLF.setDirection(DcMotor.Direction.REVERSE);
    
    
    waitForStart();
    if (opModeIsActive()) {
      while (opModeIsActive()) {

    
          //Driving
          motorRR.setPower(gamepad1.right_stick_y);
          motorRF.setPower(gamepad1.right_stick_y);
          motorLR.setPower(gamepad1.left_stick_y);
          motorLF.setPower(gamepad1.left_stick_y);
          
          // lift motor 
          LiftMotor.setPower((double) gamepad1.right_trigger);
          LiftMotor.setPower(((double) gamepad1.left_trigger)*-1);
          
          // Duck motor
          if(gamepad1.right_bumper){
            Duckmotor.setPower(0.7);
          }else{
            Duckmotor.setPower(0);
          }
          
          if(gamepad1.left_bumper){
            Duckmotor.setPower(-0.5);
          }else{
            Duckmotor.setPower(0);
          }
          
        
            }
          
          
       if (gamepad1.y){
             orgServo.setPower(-0.5);
       }else{
         orgServo.setPower(0);
         
       }
          
          if(gamepad1.x){
              orgServo.setPower(0.5);
          }else{    
              orgServo.setPower(0);
          }
      
      
      
      
      /*
          //driving 
        if (gamepad1.dpad_up) {
          motorRR.setPower(1);
          motorRF.setPower(1);
          motorLR.setPower(-1);
          motorLF.setPower(-1);
          
          
        } else {
          motorRR.setPower(0);
          motorRF.setPower(0);
        }
       
       if (gamepad1.dpad_down){
         motorLR.setPower(1);
         motorLF.setPower(1);
       } else {
         motorLR.setPower(0);
         motorLF.setPower(0);
       }
       if (gamepad1.dpad_left){
         motorLR.setPower(1);
         motorLF.setPower(1);
         motorRR.setPower(1);
         motorRF.setPower(1);
       } else {
         motorLR.setPower(0);
         motorLF.setPower(0);
         motorRR.setPower(0);
         motorRF.setPower(0);
       }
       
      if (gamepad1.dpad_right){
         motorLR.setPower(-1);
         motorLF.setPower(-1);
         motorRR.setPower(-1);
         motorRF.setPower(-1);
      } else {
         motorLR.setPower(0);
         motorLF.setPower(0);
         motorRR.setPower(0);
         motorRF.setPower(0);
       }
      
       
        
         if (Grabberlimit.getState()) {
            orgServo.setPower(0);
        }else{
            orgServo.setPower(0.5);
         }
         
        */ 
  
    }
  }
}
