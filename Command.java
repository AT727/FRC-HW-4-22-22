public interface Command {
  public void init(int loop);
  public void execute();
  public boolean isFinished();
  public void end();
}
