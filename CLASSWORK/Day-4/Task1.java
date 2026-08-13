class Task1 {
    public static void main(String[] args) {

        int bal = 1000;
        int withdraw = 5000;

        if (bal >= withdraw) {
            try {
                bal = bal - withdraw;
                System.out.println("Balance after withdrawal: " + bal);
            }
            catch (Exception e) {
                throw new RuntimeException("Error occurred because of insufficient balance");
            }
        }
    }
}