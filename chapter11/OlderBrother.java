package day11;

interface OlderBrother {
	void playGame();

}
interface LittleBrother {
	void playSports();
}
interface MyBrother extends OlderBrother, LittleBrother {
	void playChess();
}
class Brotherhood1 implements MyBrother{

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playSports() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playChess() {
		// TODO Auto-generated method stub
		
	}
	
}
