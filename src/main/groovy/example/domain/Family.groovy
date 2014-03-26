package example.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne
import javax.persistence.OneToMany


@Entity
class Family {
	@Id
	@GeneratedValue
	Long id

	@ManyToOne
	Individual husband

	@ManyToOne
	Individual wife

	@OneToMany
	Set<Individual> children
}
