package uk.org.nbn.nbnv.jpa.nbncore;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.OrganisationAccessRequest;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonObservationDownload;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonObservationFilterElement;
import uk.org.nbn.nbnv.jpa.nbncore.UserAccessRequest;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(TaxonObservationFilter.class)
public class TaxonObservationFilter_ { 

    public static volatile SingularAttribute<TaxonObservationFilter, Integer> id;
    public static volatile SingularAttribute<TaxonObservationFilter, OrganisationAccessRequest> organisationAccessRequest;
    public static volatile SingularAttribute<TaxonObservationFilter, UserAccessRequest> userAccessRequest;
    public static volatile SingularAttribute<TaxonObservationFilter, TaxonObservationDownload> taxonObservationDownload;
    public static volatile SingularAttribute<TaxonObservationFilter, String> filterJSON;
    public static volatile CollectionAttribute<TaxonObservationFilter, TaxonObservationFilterElement> taxonObservationFilterElementCollection;
    public static volatile SingularAttribute<TaxonObservationFilter, String> filterText;

}