package pl.edu.wat.inz.primefaces.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.RowEditEvent;
import org.springframework.dao.DataAccessException;

import pl.edu.wat.inz.hibernate.data.Animal;
import pl.edu.wat.inz.spring.service.AnimalService;

@ManagedBean(name = "animalMB")
@RequestScoped
public class AnimalManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private static final String SUCCESS = "success";
	private static final String ERROR = "error";

	@ManagedProperty(value = "#{AnimalService}")
	AnimalService animalService;

	List<Animal> animalList;
	private int id;
	private String name;

	public String addAnimal() {
		try {
			Animal Animal = new Animal();
			Animal.setAnimalName(getName());
			getAnimalService().addAnimal(Animal);
			reset();
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public String updateAnimal(Animal Animal) {
		try {
			getAnimalService().updateAnimal(Animal);
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public String deleteAnimal(Animal animal) {
		try {
			getAnimalService().deleteAnimal(animal);
			animalList = null;
			getAnimalList();
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public void onEdit(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Item Edited");
		FacesContext.getCurrentInstance().addMessage(null, msg);
		updateAnimal((Animal) event.getObject());
	}

	public void onCancel(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Item Cancelled");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void reset() {
		this.setId(0);
		this.setName("");
	}

	public List<Animal> getAnimalList() {
		if (animalList == null) {
			animalList = new ArrayList<Animal>();
			animalList.addAll(getAnimalService().getAnimals());
		}
		return animalList;
	}

	public AnimalService getAnimalService() {
		return animalService;
	}

	public void setAnimalService(AnimalService AnimalService) {
		this.animalService = AnimalService;
	}

	public void setAnimalList(List<Animal> AnimalList) {
		this.animalList = AnimalList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}