package uk.org.nbn.nbnv.jpa.nbncore;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.Feature;
import uk.org.nbn.nbnv.jpa.nbncore.Projection;
import uk.org.nbn.nbnv.jpa.nbncore.SiteBoundaryAttribute;
import uk.org.nbn.nbnv.jpa.nbncore.SiteBoundaryDataset;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonObservationFilterElement;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(SiteBoundary.class)
public class SiteBoundary_ { 

    public static volatile SingularAttribute<SiteBoundary, byte[]> originalGeom;
    public static volatile SingularAttribute<SiteBoundary, String> description;
    public static volatile SingularAttribute<SiteBoundary, String> providerKey;
    public static volatile SingularAttribute<SiteBoundary, String> name;
    public static volatile SingularAttribute<SiteBoundary, SiteBoundaryDataset> siteBoundaryDataset;
    public static volatile SingularAttribute<SiteBoundary, Projection> projection;
    public static volatile CollectionAttribute<SiteBoundary, TaxonObservationFilterElement> taxonObservationFilterElementCollection;
    public static volatile SingularAttribute<SiteBoundary, Integer> featureID;
    public static volatile SingularAttribute<SiteBoundary, Feature> feature;
    public static volatile SingularAttribute<SiteBoundary, Date> uploadDate;
    public static volatile CollectionAttribute<SiteBoundary, SiteBoundaryAttribute> siteBoundaryAttributeCollection;

}