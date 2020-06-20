package rs.ac.singidunum.fir.pj.filmovi.entities;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity(name="filmovi")
public class Film {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int film_id;
	private String title;
	private String genre;
	private int length;
	private float rating;
	private int year;
	
	@ManyToMany(cascade={CascadeType.ALL})
	@JoinTable(name = "filmoviglumci", 
	joinColumns =
	@JoinColumn(name = "film_id", referencedColumnName = "film_id"),
	inverseJoinColumns = 
	@JoinColumn (name = "glumac_id", referencedColumnName = "glumac_id"))
	private Set<Glumac> glumci;
	
	public Film(int film_id, String title, String genre, int length, float rating, int year) {
		super();
		this.film_id = film_id;
		this.title = title;
		this.genre = genre;
		this.length = length;
		this.rating = rating;
		this.year = year;
	}
	
	public Film() {
		
	}

	public int getFilm_id() {
		return film_id;
	}

	public void setFilm_id(int film_id) {
		this.film_id = film_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
}
