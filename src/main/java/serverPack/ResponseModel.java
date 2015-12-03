package serverPack;

import java.net.URL;
import java.util.LinkedList;

public class ResponseModel {

	private LinkedList<URL> bestOptionsList;
	private LinkedList<String> movieNames;

	public ResponseModel(LinkedList<String> names, LinkedList<URL> bestOptions) {
		this.bestOptionsList = bestOptions;
		this.movieNames = names;
	}

	public LinkedList<URL> getBestOptionsList() {
		return bestOptionsList;
	}

	public void setBestOptionsList(LinkedList<URL> bestOptionsList) {
		this.bestOptionsList = bestOptionsList;
	}

	public LinkedList<String> getMovieNames() {
		return movieNames;
	}

	public void setMovieNames(LinkedList<String> movieNames) {
		this.movieNames = movieNames;
	}

}
