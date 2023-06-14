public class Main {
    public static void main(String[] args) {
        // Create a new blockchain
        double startingAmount = 100.0;
        Blockchain blockchain = new Blockchain(startingAmount);

        System.out.println("Dominik's Balance: " + blockchain.getSenderBalance("Dominik"));
        System.out.println("Marcel's Balance: " + blockchain.getSenderBalance("Marcel"));
        System.out.println("Artur's Balance: " + blockchain.getSenderBalance("Artur"));

        // Add some blocks to the blockchain
        blockchain.addBlock("Dominik", "Marcel", 20.0);
        blockchain.addBlock("Marcel", "Artur", 10.0);
        blockchain.addBlock("Artur", "Dominik", 50.0);
        blockchain.addBlock("Dominik", "Marcel", 10.0);

        // Validate the blockchain integrity
        boolean isValid = blockchain.isChainValid();
        System.out.println("Is blockchain valid? " + isValid);

        // Print total currency balance for each sender
        System.out.println("Dominik's Balance: " + blockchain.getSenderBalance("Dominik"));
        System.out.println("Marcel's Balance: " + blockchain.getSenderBalance("Marcel"));
        System.out.println("Artur's Balance: " + blockchain.getSenderBalance("Artur"));
    }
}
