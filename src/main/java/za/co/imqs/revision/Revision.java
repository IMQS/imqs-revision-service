package za.co.imqs.revision;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by BradleyM on 2016-03-01.
 */

@Entity
public class Revision {
    @Id
    @GeneratedValue
    private Long id;
    @Column (nullable = false)
    private String revision;
    @Column (nullable = false)
    private String branch;
    @Column  (nullable = false)
    private String host;

    public Revision(){}



    public Revision(String revision,String branch){
        this.revision = revision;
        this.branch = branch;
    }

    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
}
