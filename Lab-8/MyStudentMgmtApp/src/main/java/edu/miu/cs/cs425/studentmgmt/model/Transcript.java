package edu.miu.cs.cs425.studentmgmt.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name = "transcript")
public class Transcript {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long trancriptId;

	@NotBlank(message = "degreeTitle required")
	private String degreeTitle;

	public Transcript(long trancriptId, @NotBlank(message = "degreeTitle required") String degreeTitle) {
		super();
		this.trancriptId = trancriptId;
		this.degreeTitle = degreeTitle;
	}

	public Transcript(@NotBlank(message = "degreeTitle required") String degreeTitle) {
		super();
		this.degreeTitle = degreeTitle;
	}
	
	

	public Transcript() {
		super();
	}

	public long getTrancriptId() {
		return trancriptId;
	}

	public void setTrancriptId(long trancriptId) {
		this.trancriptId = trancriptId;
	}

	public String getDegreeTitle() {
		return degreeTitle;
	}

	public void setDegreeTitle(String degreeTitle) {
		this.degreeTitle = degreeTitle;
	}

	@Override
	public String toString() {
		return String.format("Transcript [trancriptId=%s, degreeTitle=%s]", trancriptId, degreeTitle);
	}
}
