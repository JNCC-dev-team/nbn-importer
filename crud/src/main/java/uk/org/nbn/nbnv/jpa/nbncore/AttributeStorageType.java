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
@Table(name = "AttributeStorageType")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AttributeStorageType.findAll", query = "SELECT a FROM AttributeStorageType a"),
    @NamedQuery(name = "AttributeStorageType.findById", query = "SELECT a FROM AttributeStorageType a WHERE a.id = :id"),
    @NamedQuery(name = "AttributeStorageType.findByLabel", query = "SELECT a FROM AttributeStorageType a WHERE a.label = :label")})
public class AttributeStorageType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "label")
    private String label;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "attributeStorageType")
    private Collection<GatewayAttribute> gatewayAttributeCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "attributeStorageType")
    private Collection<Attribute> attributeCollection;

    public AttributeStorageType() {
    }

    public AttributeStorageType(Integer id) {
        this.id = id;
    }

    public AttributeStorageType(Integer id, String label) {
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
    public Collection<GatewayAttribute> getGatewayAttributeCollection() {
        return gatewayAttributeCollection;
    }

    public void setGatewayAttributeCollection(Collection<GatewayAttribute> gatewayAttributeCollection) {
        this.gatewayAttributeCollection = gatewayAttributeCollection;
    }

    @XmlTransient
    public Collection<Attribute> getAttributeCollection() {
        return attributeCollection;
    }

    public void setAttributeCollection(Collection<Attribute> attributeCollection) {
        this.attributeCollection = attributeCollection;
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
        if (!(object instanceof AttributeStorageType)) {
            return false;
        }
        AttributeStorageType other = (AttributeStorageType) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uk.org.nbn.nbnv.jpa.nbncore.AttributeStorageType[ id=" + id + " ]";
    }
    
}
