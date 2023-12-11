/** The Command for turning off the light - ConcreteCommand #2 */
public class FlipDownCommand implements Command {
    private Valkokangas kangas;

    public FlipDownCommand(Valkokangas kangas) {
    this.kangas = kangas;
}
   @Override    // Command
   public void execute() {
      kangas.turnOff();
   }
}