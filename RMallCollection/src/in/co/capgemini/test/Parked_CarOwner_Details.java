package in.co.capgemini.test;

public class Parked_CarOwner_Details {
	private String ownerName;
	private String carModel;
	private int carNo;
	private int ownerMobileNo;
	private String ownerAddress;
	private int token;

	public Parked_CarOwner_Details(String ownerName, String carModel, int carNo, int ownerMobileNo,
			String ownerAddress) {
		super();
		this.ownerName = ownerName;
		this.carModel = carModel;
		this.carNo = carNo;
		this.ownerMobileNo = ownerMobileNo;
		this.ownerAddress = ownerAddress;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public int getCarNo() {
		return carNo;
	}

	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}

	public int getOwnerMobileNo() {
		return ownerMobileNo;
	}

	public void setOwnerMobileNo(int ownerMobileNo) {
		this.ownerMobileNo = ownerMobileNo;
	}

	public String getOwnerAddress() {
		return ownerAddress;
	}

	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}

	public int getToken() {
		return token;
	}

	public void setToken(int token) { 
		this.token = token;
	}

	@Override
	public String toString() {
		return "Parked_CarOwner_Details [ownerName=" + ownerName + ", carModel=" + carModel + ", carNo=" + carNo
				+ ", ownerMobileNo=" + ownerMobileNo + ", ownerAddress=" + ownerAddress + "]";
	}

}
