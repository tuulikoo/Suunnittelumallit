public class Hyvaksymispyynto {
    private double amount;
    private String purpose;

    public Hyvaksymispyynto(double amount, String purpose) {
        this.amount = amount;
        this.purpose = purpose; }

        public double getAmount() {
            return amount; }

        public void setAmount(double amt) { 
            amount = amt; }

        public String getPurpose() {
            return purpose; }

        public void setPurpose(String reason) {
            purpose = reason; }
}