import java.io.*;

@javax.persistence.Entity
public class Member extends Anggota implements Serializable {

	protected int id;
	public string startDate;
	public string dueDate;
	public int anggotaId;
	public string address;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public string getStartDate() {
		return this.startDate;
	}

	public void setStartDate(string startDate) {
		this.startDate = startDate;
	}

	public string getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(string dueDate) {
		this.dueDate = dueDate;
	}

	public int getAnggotaId() {
		return this.anggotaId;
	}

	public void setAnggotaId(int anggotaId) {
		this.anggotaId = anggotaId;
	}

	public string getAddress() {
		return this.address;
	}

	public void setAddress(string address) {
		this.address = address;
	}

	/**
	 * 
	 * @param dueDate
	 */
	public void perpanjang(string dueDate) {
		// TODO - implement Member.perpanjang
		throw new UnsupportedOperationException();
	}

}