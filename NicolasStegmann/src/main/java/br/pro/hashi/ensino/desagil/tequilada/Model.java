package br.pro.hashi.ensino.desagil.tequilada;

public class Model {
	private Board board;
	private Player cpuPlayer;
	private Player humanPlayer;

	public Model() {
		board = new Board("board.txt");

		cpuPlayer = new CpuPlayer(board.getNumRows() - 1, board.getNumCols() - 1);
		humanPlayer = new HumanPlayer(0, 0);
	}

	public void update(int rowShift, int colShift) {
		humanPlayer.move(rowShift, colShift);;
	}
	public Board getBoard() {
		return board;
	}
	public Player getCpuPlayer() {
		return cpuPlayer;
	}
	public Player getHumanPlayer() {
		return humanPlayer;
	}
}
