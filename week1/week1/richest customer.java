class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        
        // Iterate through each customer
        for (int i = 0; i < accounts.length; i++) {
            int currentWealth = 0;
            
            // Calculate the sum of all bank accounts for the current customer
            for (int j = 0; j < accounts[i].length; j++) {
                currentWealth += accounts[i][j];
            }
            
            // Update maxWealth if the current customer is richer
            if (currentWealth > maxWealth) {
                maxWealth = currentWealth;
            }
        }
        
        return maxWealth;
    }
}
