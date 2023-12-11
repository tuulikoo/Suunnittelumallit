/** The Command for turning on the light - ConcreteCommand #1 */
public class FlipUpCommand implements Command {
    private Valkokangas kangas;
    
   public FlipUpCommand(Valkokangas kangas) {
      this.kangas = kangas;
}
   @Override    // Command
   public void execute() {
      kangas.turnOn();
   }
}