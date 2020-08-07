
package acme.features.anonymous.gonzalezBulletin;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.bulletins.GonzalezBulletin;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousGonzalezBulletinRepository extends AbstractRepository {

	@Query("select s from GonzalezBulletin s")
	Collection<GonzalezBulletin> findMany();

}
