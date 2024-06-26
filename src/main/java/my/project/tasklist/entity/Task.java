package my.project.tasklist.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "task", schema = "tasklist")
@NoArgsConstructor
@Setter
@EqualsAndHashCode
public class Task {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "id", nullable = false)
	private Long id;

	@Basic
	@Column(name = "title")
	private String title;

	@Basic
	@Column(name = "completed")
	private Integer completed;

	@Basic
	@Column(name = "date")
	private Date date;

	@ManyToOne
	@JoinColumn(name = "priority_id", referencedColumnName = "id")
	private Priority priority;

	@ManyToOne
	@JoinColumn(name = "category_id", referencedColumnName = "id")
	private Category category;

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getCompleted() {
		return completed;
	}

	public void setCompleted(Integer completed) {
		this.completed = completed;
	}

	public Date getDate() {
		return date;
	}

	public Priority getPriority() {
		return priority;
	}

	public Category getCategory() {
		return category;
	}
}
