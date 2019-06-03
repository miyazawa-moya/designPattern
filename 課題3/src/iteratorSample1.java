public class iteratorSample1 {

	public static void main(String[] args) {
		GameListAggregate gameListAggregate = new GameListAggregate();
		Iterator iterator = gameListAggregate.createIterator();
		gameListAggregate.add(new Game("小説",800));
		gameListAggregate.add(new Game("漫画",400));
		gameListAggregate.add(new Game("絵本",1000));
		gameListAggregate.add(new Game("同人誌",500));

		gameListAggregate.sort();

		iterator.first();
		while (! iterator.isDone()){
			Game game = (Game)iterator.getItem();
			System.out.println(game.getName());
			iterator.next();
		}
	}

}
