//Import Packages
package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.hardware.rev.RevTouchSensor;
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
  private TouchSensor Grabberlimit;
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
    Grabberlimit = hardwareMap.touchSensor.get("Grabberlimit");
       motorLR.setDirection(DcMotor.Direction.REVERSE);
       motorLF.setDirection(DcMotor.Direction.REVERSE);
    
    
    waitForStart();
      while (opModeIsActive()) {

          //Improved driving
          float left = -gamepad1.left_stick_y  - gamepad1.left_stick_x;
          float right = -gamepad1.left_stick_y  + gamepad1.left_stick_x;
          motorRR.setPower(right); motorRF.setPower(right); //right motors
          motorLR.setPower(left);  motorLF.setPower(left);  //left motors

          //telemetry nonsense
          telemetry.addData("Encoder Ticks", motorRR.getCurrentPosition());
          telemetry.addData("Servo Power: ", orgServo.getPower());
          telemetry.addData("Touch State: ", Grabberlimit.getValue());
          telemetry.update();

          // lift motor
          if(gamepad1.dpad_up){
              LiftMotor.setPower(1);
          } else if(gamepad1.dpad_down){
              LiftMotor.setPower(-1);
          } else{
              LiftMotor.setPower(0);
          }

          // Duck motor
          if (gamepad1.right_trigger > .1) {
              Duckmotor.setPower(0.7);
          } else if (gamepad1.left_trigger > .1) {
              Duckmotor.setPower(-0.5);
          } else {
              Duckmotor.setPower(0);
          }
          
          
          // 0.5 - in
          // -0.5 - out
          if (gamepad1.y) {
              orgServo.setPower(-0.5);
          } else if (gamepad1.x){
              while(Grabberlimit.getValue() !=  1){
                orgServo.setPower(0.5);
              }
          } else {
              orgServo.setPower(0);
          }

      }
   }
} 