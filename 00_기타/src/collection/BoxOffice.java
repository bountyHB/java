package collection;

public class BoxOffice implements Comparable<BoxOffice> {
	
	private int ranking;
	private String title;
	private String director;
	private String genre;
	
	public BoxOffice() {
	}

	public BoxOffice(int ranking, String title, String director, String genre) {
		this.ranking = ranking;
		this.title = title;
		this.director = director;
		this.genre = genre;
	}
	

	public int getRanking() {
		return ranking;
	}

	public String getTitle() {
		return title;
	}

	public String getDirector() {
		return director;
	}

	public String getGenre() {
		return genre;
	}
	
	@Override
	public int compareTo(BoxOffice film) {
		return (this.ranking > film.ranking) ? 1 : (this.ranking == film.ranking) ? 0 : -1;
	}
	

	@Override
	public String toString() {
		return "BoxOffice ranked <" + ranking + "> ["+ title + " directed by " + director + "], " + genre;
	}

}
