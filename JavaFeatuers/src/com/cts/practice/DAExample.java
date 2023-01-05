package com.cts.practice;

public class DAExample {

	static long count(int coins[], int n, int sum)
	{
	    // table[i] will be storing the number of solutions for
	    // value i. We need sum+1 rows as the table is
	    // constructed in bottom up manner using the base case
	    // (sum = 0)
	    int table[] = new int[sum + 1];
	 
	    // Base case (If given value is 0)
	    table[0] = 1;
	 
	    // Pick all coins one by one and update the table[]
	    // values after the index greater than or equal to the
	    // value of the picked coin
	    for (int i = 0; i < n; i++)
	        for (int j = coins[i]; j <= sum; j++) {
	            table[j] += table[j - coins[i]];
	               System.out.println(j+":"+table[j]);
	        }
	    return table[sum];
	}
	public static void main(String args[])
    {
        int coins[] = { 1, 2, 3 };
        int n = coins.length;
        int sum = 4;
        System.out.println(count(coins, n, sum));
    }
}
