import javax.persistence.*;
import java.io.*;
import java.util.*;

@javax.persistence.Entity
@javax.persistence.Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Anggota implements Serializable {

	protected int id;
	public string name;
	public string phone;
	Collection<Activity> activity;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public string getName() {
		return this.name;
	}

	public void setName(string name) {
		this.name = name;
	}

	public string getPhone() {
		return this.phone;
	}

	public void setPhone(string phone) {
		this.phone = phone;
	}

	@javax.persistence.OneToMany(mappedBy="anggota")
	public Collection<Activity> getActivity() {
		return this.activity;
	}

	public void setActivity(Collection<Activity> activity) {
		this.activity = activity;
	}

	public void checkIn() {
		// TODO - implement Anggota.checkIn
		throw new UnsupportedOperationException();
	}

	public void checkOut() {
		// TODO - implement Anggota.checkOut
		throw new UnsupportedOperationException();
	}

}