package tictactoe

class TicTacToe {
    private val board = Array(3) { Array(3) { "" } }
    private var currentPlayer = "X"

    fun playMove(row: Int, col: Int): String {
        if (board[row][col].isEmpty()) {
            board[row][col] = currentPlayer
            if (checkWinner()) return "$currentPlayer wins!"
            currentPlayer = if (currentPlayer == "X") "O" else "X"
        }
        return "Next: $currentPlayer"
    }

    private fun checkWinner(): Boolean {
        for (i in 0..2) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0].isNotEmpty()) return true
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i].isNotEmpty()) return true
        }
        return (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0].isNotEmpty()) ||
               (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2].isNotEmpty())
    }
}
