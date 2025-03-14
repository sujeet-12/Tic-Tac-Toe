const game = new TicTacToe();
const board = document.getElementById("game-board");

function renderBoard() {
    board.innerHTML = "";
    for (let i = 0; i < 3; i++) {
        for (let j = 0; j < 3; j++) {
            const cell = document.createElement("div");
            cell.classList.add("w-16", "h-16", "flex", "items-center", "justify-center", "border", "text-2xl");
            cell.addEventListener("click", () => {
                const result = game.playMove(i, j);
                cell.innerText = game.getBoard()[i][j];
                if (result.includes("wins")) alert(result);
            });
            board.appendChild(cell);
        }
    }
}

document.getElementById("reset").addEventListener("click", () => {
    game.reset();
    renderBoard();
});

renderBoard();
