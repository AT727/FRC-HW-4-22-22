class Main {
  public static void main(String[] args) {
    RunDriveTrain driveTrain = new RunDriveTrain();
    RunIntake intake = new RunIntake();
    
    driveTrain.init(5);
    intake.init(1);
    
    while(driveTrain.loop > 0){
      driveTrain.execute();
      driveTrain.isFinished();
      }
    
    driveTrain.end();
    
    while(intake.loop > 0){
      intake.execute();
      intake.isFinished();
    }

    intake.end();
    
  }
}
