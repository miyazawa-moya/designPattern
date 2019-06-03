import java.util.ArrayList;
import java.util.List;

class GameListAggregate implements Aggregate {
	private List<Game> list = new ArrayList<>();
	//private Game[] list = new Game[20];
	private int numberOfStock;

	@Override
	public Iterator createIterator(){
		return new GameListIterator(this);
	}

	public void add(Game game){
		list.add(game);
		numberOfStock += 1;
	}

	public Object getAt(int number){
		return list.get(number);
	}

	public int getNumberOfStock(){
		return numberOfStock;
	}

	public void sort(){list.sort((a,b)-> a.getPrice() - b.getPrice());}
}
