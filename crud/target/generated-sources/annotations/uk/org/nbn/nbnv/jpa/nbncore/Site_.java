package uk.org.nbn.nbnv.jpa.nbncore;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.Dataset;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonObservation;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonObservationPublic;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(Site.class)
public class Site_ { 

    public static volatile SingularAttribute<Site, Integer> id;
    public static volatile CollectionAttribute<Site, TaxonObservationPublic> taxonObservationPublicCollection;
    public static volatile CollectionAttribute<Site, TaxonObservation> taxonObservationCollection;
    public static volatile SingularAttribute<Site, Dataset> dataset;
    public static volatile SingularAttribute<Site, String> providerKey;
    public static volatile SingularAttribute<Site, String> name;

}