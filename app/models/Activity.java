import java.io.*;

@javax.persistence.Entity
public class Activity implements Serializable {

	protected int id;
	public string checkIn;
	public string checkOut;
	Anggota anggota;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public string getCheckIn() {
		return this.checkIn;
	}

	public void setCheckIn(string checkIn) {
		this.checkIn = checkIn;
	}

	public string getCheckOut() {
		return this.checkOut;
	}

	public void setCheckOut(string checkOut) {
		this.checkOut = checkOut;
	}

	@javax.persistence.ManyToOne(optional=false)
	public Anggota getAnggota() {
		return this.anggota;
	}

	public void setAnggota(Anggota anggota) {
		this.anggota = anggota;
	}

}