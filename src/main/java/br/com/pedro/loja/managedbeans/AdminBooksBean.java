package br.com.pedro.loja.managedbeans;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import br.com.pedro.loja.models.Book;
import br.com.pedro.loja.models.BookDAO;

@Model
public class AdminBooksBean {
	private Book product = new Book();
	@Inject 
	private BookDAO bookDAO;

	public void save() {
		bookDAO.save(product);
	}

}
