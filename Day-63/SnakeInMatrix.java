//https://leetcode.com/contest/weekly-contest-410/problems/snake-in-matrix/

class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int x = 0;
        int y = 0;

        for (String command : commands) {
            if (command.equals("UP")) {
                x = x - 1;
            } else if (command.equals("DOWN")) {
                x = x + 1;
            } else if (command.equals("RIGHT")) {
                y = y + 1;
            } else if (command.equals("LEFT")) {
                y = y - 1;
            }
        }

        int position = (x * n) + y;

        return position;

    }
}

// There is a snake in an n x n matrix grid and can move in four possible
// directions. Each cell in the grid is identified by the position: grid[i][j] =
// (i * n) + j.

// The snake starts at cell 0 and follows a sequence of commands.

// You are given an integer n representing the size of the grid and an array of
// strings commands where each command[i] is either "UP", "RIGHT", "DOWN", and
// "LEFT". It's guaranteed that the snake will remain within the grid boundaries
// throughout its movement.

// Return the position of the final cell where the snake ends up after executing
// commands.

// Example 1:

// Input: n = 2, commands = ["RIGHT","DOWN"]

// Output: 3