package za.co.imqs.revision;

import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by BradleyM on 2016-03-02.
 */
public interface RevisionRepository extends CrudRepository<Revision, Long> {

    public Revision findByHost(String host);
}
