/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.org.nbn.nbnv.jpa.nbncore;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Paul Gilbertson
 */
@Entity
@Table(name = "AccessRequestRole")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AccessRequestRole.findAll", query = "SELECT a FROM AccessRequestRole a"),
    @NamedQuery(name = "AccessRequestRole.findById", query = "SELECT a FROM AccessRequestRole a WHERE a.id = :id"),
    @NamedQuery(name = "AccessRequestRole.findByLabel", query = "SELECT a FROM AccessRequestRole a WHERE a.label = :label")})
public class AccessRequestRole implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "label")
    private String label;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "accessRequestRole")
    private Collection<UserAccessRequest> userAccessRequestCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "accessRequestRole")
    private Collection<OrganisationAccessRequest> organisationAccessRequestCollection;

    public AccessRequestRole() {
    }

    public AccessRequestRole(Integer id) {
        this.id = id;
    }

    public AccessRequestRole(Integer id, String label) {
        this.id = id;
        this.label = label;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @XmlTransient
    public Collection<UserAccessRequest> getUserAccessRequestCollection() {
        return userAccessRequestCollection;
    }

    public void setUserAccessRequestCollection(Collection<UserAccessRequest> userAccessRequestCollection) {
        this.userAccessRequestCollection = userAccessRequestCollection;
    }

    @XmlTransient
    public Collection<OrganisationAccessRequest> getOrganisationAccessRequestCollection() {
        return organisationAccessRequestCollection;
    }

    public void setOrganisationAccessRequestCollection(Collection<OrganisationAccessRequest> organisationAccessRequestCollection) {
        this.organisationAccessRequestCollection = organisationAccessRequestCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccessRequestRole)) {
            return false;
        }
        AccessRequestRole other = (AccessRequestRole) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uk.org.nbn.nbnv.jpa.nbncore.AccessRequestRole[ id=" + id + " ]";
    }
    
}
