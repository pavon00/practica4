package practica4.db_driven_adapter.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import practica4.core.domain.Book;

@Entity

public class BookEntity {

	@Id

	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long id;

	@Column(name = "name")

	private String name;

//constructors //getters and setters 

	public Book toBook() {

		return new Book(this.id, this.name);

	}

}
