package pl.edu.wat.inz.primefaces.bean.managedBean;

import static pl.edu.wat.inz.basic.AppConst.ERROR;
import static pl.edu.wat.inz.basic.AppConst.SUCCESS;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

import org.primefaces.event.RowEditEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;
import org.springframework.dao.DataAccessException;

import pl.edu.wat.inz.hibernate.data.Breed;
import pl.edu.wat.inz.spring.service.BreedService;

@ManagedBean(name = "breedMB", eager = true)
@ApplicationScoped
public class BreedManagedBean implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManagedProperty(value = "#{BreedService}")
	private BreedService breedService;

	List<Breed> breedList;
	private Breed selectedBreed = new Breed();

	public List<Breed> getBreedList() {
		if (breedList == null) {
			breedList = new ArrayList<Breed>();
			breedList.addAll(getBreedService().getBreeds());
		}
		return breedList;
	}

	public Breed getSelectedBreed() {
		return selectedBreed;
	}

	public void setSelectedBreed(Breed selectedBreed) {
		this.selectedBreed = selectedBreed;
	}

	public void onUserRowUnselect(UnselectEvent event) {
		setSelectedBreed(null);
	}

	public void onCompRowSelect(SelectEvent event) {
		setSelectedBreed((Breed) event.getObject());
	}

	public String addBreed() {
		try {
			getBreedService().addBreed(selectedBreed);
			reset();
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public String updateBreed(Breed Breed) {
		try {
			getBreedService().updateBreed(Breed);
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public String deleteBreed(Breed breed) {
		try {
			getBreedService().deleteBreed(breed);
			breedList = null;
			getBreedList();
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public void onEdit(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Item Edited");
		FacesContext.getCurrentInstance().addMessage(null, msg);
		updateBreed((Breed) event.getObject());
	}

	public void onCancel(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Item Cancelled");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void reset() {
		this.selectedBreed = new Breed();
	}

	public List<Breed> getBreedListForSpecies(long speciesId) {
		breedList = new ArrayList<Breed>();
		breedList.addAll(getBreedService().getBreedsForSpecies(speciesId));
		return breedList;
	}

	public BreedService getBreedService() {
		return breedService;
	}

	public void setBreedService(BreedService BreedService) {
		this.breedService = BreedService;
	}

	public void setBreedList(List<Breed> BreedList) {
		this.breedList = BreedList;
	}

}