public class RunDriveTrain implements Command {
  String motor1;
  double motorPower;
  int loop;
  
  RunDriveTrain() {
    this.init(loop);
  }

  @Override
  public void init(int loop) {
    this.motor1 = "motor1";
    this.motorPower = 1;
    this.loop = loop;
  }

  @Override
  public void execute(){
    System.out.println("Drivetrain is running. Motor power is " + motorPower);
    }

  @Override
  public boolean isFinished() {
    this.loop--;
    return this.loop == 0;
  }

  @Override
  public void end() {
    System.out.println("Drivetrain ended");
  }
}
