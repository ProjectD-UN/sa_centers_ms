package sa.course.model;

import javax.persistence.*;

@Entity
@Table(name = "courses")
@NamedQueries({@NamedQuery(name = Course.FIND_ALL, query = "SELECT u FROM Course u")})
public class Course {

    public static final String FIND_ALL = "Course.findAll";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;

    private String name;
    private double lat;
    private double lng;
    private String address;
    private String city;

    public Long getCode() {
        return code;
    }
    public void setCode(Long code) {
        this.code = code;
    }

    public String getName(){
      return name;
    }
    public void setName(String name){
      this.name = name;
    }
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLng() {
		return lng;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	    
}