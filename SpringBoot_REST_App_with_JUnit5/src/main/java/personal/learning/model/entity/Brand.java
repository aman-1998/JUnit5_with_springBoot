package personal.learning.model.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.hateoas.Link;

@Entity(name = "BRAND")
@Table(name = "BRAND")
public class Brand {
	
	@Id
	@Column(name="BRAND_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "brand_generator")
	@SequenceGenerator(name = "brand_generator", sequenceName = "BRAND_SEQUENCE", allocationSize = 1)
	private int brandId;
	
	@Column(name="BRAND_NAME")
	private String brandName;
	
	@Transient
	private List<Link> listOflinks;
	
	public Brand(int brandId, String brandName) {
		this.brandId = brandId;
		this.brandName = brandName;
	}
	
	public Brand() {
		this.brandId = 0;
		this.brandName = "####";
	}

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public List<Link> getListOflinks() {
		return listOflinks;
	}

	public void setListOflinks(List<Link> listOflinks) {
		this.listOflinks = listOflinks;
	}

	@Override
	public String toString() {
		return "Brand [brandId=" + brandId + ", brandName=" + brandName + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(brandId, brandName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Brand other = (Brand) obj;
		return brandId == other.brandId && Objects.equals(brandName, other.brandName);
	}
	
	
	
}
