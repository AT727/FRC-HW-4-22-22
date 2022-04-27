class RunIntake implements Command {
  String intake;
  double intakePower;
  int loop;
  
  RunIntake() {
    this.init(loop);
  }

  @Override
  public void init(int loop) {
    this.intake = "intake1";
    this.intakePower = 1;
    this.loop = loop;
  }

  @Override
  public void execute() {
    System.out.println("intake is running. intake power is " + intakePower);
  }

  @Override
  public boolean isFinished() {
    this.loop--;
    return this.loop == 0;
  }

  @Override
  public void end() {
   System.out.println("Intake ended");
  }
}
