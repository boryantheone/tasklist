package my.project.tasklist.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "priority", schema = "tasklist")
@NoArgsConstructor
@Setter
@EqualsAndHashCode
public class Priority {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "id", nullable = false)
	private Long id;

	@Basic
	@Column(name = "title", nullable = false, length = 45)
	private String title;

	@Basic
	@Column(name = "color", nullable = false, length = 45)
	private String color;

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getColor() {
		return color;
	}
}
