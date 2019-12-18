public class Address {
	private String street_name , building_num ,level;
	private String region_name;
	private String governorate_name;



	public Address(String street_name, String building_num, String level, String region_name, String governorate_name) {
		this.street_name = street_name;
		this.building_num = building_num;
		this.level = level;
		this.region_name = region_name;
		this.governorate_name = governorate_name;
	}

	// ------------------------------------------------------
	public String getStreet_number() {
		return street_name;
	}

	public String getBuilding_num() {
		return building_num;
	}

	public void setBuilding_num(String building_num) {
		this.building_num = building_num;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public void setStreet_number(String street_number) {
		this.street_name = street_number;
	}

	public String getRegion_name() {
		return region_name;
	}

	public void setRegion_name(String region_name) {
		this.region_name = region_name;
	}

	public String getGovernorate_name() {
		return governorate_name;
	}

	public void setGovernorate_name(String governorate_name) {
		this.governorate_name = governorate_name;
	}
	// ------------------------------------------------------------

	@Override
	public String toString() {
		return "Address [getStreet_number()=" + getStreet_number() + ", getRegion_name()=" + getRegion_name()
				+ ", getGovernorate_name()=" + getGovernorate_name() + "]";
	}
	
}
