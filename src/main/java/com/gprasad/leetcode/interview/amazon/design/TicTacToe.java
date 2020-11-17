package com.gprasad.leetcode.interview.amazon.design;

public class TicTacToe {

    private int[] rows;
    private int[] cols;
    private int diagLeaft;
    private int diagRight;
    private int dimension;

    /**
     * Initialize your data structure here.
     */
    public TicTacToe(int n) {
        rows = new int[n];
        cols = new int[n];
        dimension = n;
    }

    /**
     * Player {player} makes a move at ({row}, {col}).
     *
     * @param row    The row of the board.
     * @param col    The column of the board.
     * @param player The player, can be either 1 or 2.
     * @return The current winning condition, can be either:
     * 0: No one wins.
     * 1: Player 1 wins.
     * 2: Player 2 wins.
     */
    public int move(int row, int col, int player) {
        int move = player==1?1:-1;
        rows[row] += move;
        cols[col] += move;
        if(row==col) diagLeaft+=move;
        if((row+col)==(dimension-1)) diagRight+=move;
        if(rows[row]== dimension|| cols[col]==dimension || diagLeaft==dimension || diagRight == dimension) return player;
        if(rows[row]== -dimension|| cols[col]== -dimension || diagLeaft==-dimension || diagRight == -dimension) return player;
        return 0;
    }
}
