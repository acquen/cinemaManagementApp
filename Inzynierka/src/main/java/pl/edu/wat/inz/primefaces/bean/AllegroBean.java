package pl.edu.wat.inz.primefaces.bean;

import static pl.edu.wat.inz.basic.allegro.AllegroConst.COUNTRY_CODE;
import static pl.edu.wat.inz.basic.allegro.AllegroConst.USER_ID;
import static pl.edu.wat.inz.basic.allegro.AllegroConst.WEB_KEY;

import java.rmi.RemoteException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import pl.edu.wat.inz.spring.service.AllegroService;
import SandboxWebApi.DoGetUserItemsRequest;
import SandboxWebApi.DoGetUserItemsResponse;
import SandboxWebApi.ServiceBindingStub;
import SandboxWebApi.UserItemList;

@ManagedBean(name = "allegroBean")
@SessionScoped
public class AllegroBean {
	@ManagedProperty("#{AllegroService}")
	private AllegroService service;
	private ServiceBindingStub proxy;
	private UserItemList[] itemList;
	private UserItemList item;
	private long userId = -1;
	private int itemNr = -1;

	@PostConstruct
	public void init() {
		if (proxy == null || userId == -1) {
			service.logToAllegro();
			proxy = service.getProxy();
			userId = service.getUserId();
		}
		DoGetUserItemsRequest userItems = new DoGetUserItemsRequest(USER_ID,
				WEB_KEY, COUNTRY_CODE, null, null);
		try {
			DoGetUserItemsResponse userItemResponse = proxy
					.doGetUserItems(userItems);
			itemList = userItemResponse.getUserItemList();
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		if (itemList != null && itemList.length > 0) {
			itemNr = 0;
			item = itemList[itemNr];
		}
	}

	public String getAllegroSandboxUrl() {
		return item == null ? "" : "http://allegro.pl.webapisandbox.pl/i"
				+ item.getItId() + ".html";
	}

	public long getUserId() {
		return userId;
	}

	public long getItemId() {
		return item == null ? 0 : item.getItId();
	}

	public String getItemName() {
		return item == null ? "Brak" : item.getItName();
	}

	public String getThumbUrl() {
		return item == null ? "" : item.getItThumbUrl();
	}

	public float getPrice() {
		return item == null ? 0.0f : item.getItBuyNowPrice();
	}

	public void incrementUserNr() {
		if (itemNr + 1 < itemList.length) {
			itemNr++;
			reloadItem();
		}
	}

	public void decrementUserNr() {
		if (itemNr - 1 >= 0) {
			itemNr--;
			reloadItem();
		}
	}

	private void reloadItem() {
		item = itemList[itemNr];
	}

	public AllegroService getService() {
		return service;
	}

	public void setService(AllegroService service) {
		this.service = service;
	}

}
