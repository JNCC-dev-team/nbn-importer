package uk.org.nbn.nbnv.jpa.nbncore;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.Dataset;
import uk.org.nbn.nbnv.jpa.nbncore.OrganisationAccessRequest;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonObservation;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonObservationDownload;
import uk.org.nbn.nbnv.jpa.nbncore.UserOrganisationMembership;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(Organisation.class)
public class Organisation_ { 

    public static volatile SingularAttribute<Organisation, String> summary;
    public static volatile SingularAttribute<Organisation, byte[]> logo;
    public static volatile SingularAttribute<Organisation, String> phone;
    public static volatile CollectionAttribute<Organisation, TaxonObservation> taxonObservationCollection;
    public static volatile CollectionAttribute<Organisation, TaxonObservationDownload> taxonObservationDownloadCollection;
    public static volatile SingularAttribute<Organisation, String> website;
    public static volatile SingularAttribute<Organisation, String> contactEmail;
    public static volatile SingularAttribute<Organisation, byte[]> logoSmall;
    public static volatile SingularAttribute<Organisation, String> abbreviation;
    public static volatile SingularAttribute<Organisation, String> postcode;
    public static volatile SingularAttribute<Organisation, Boolean> allowPublicRegistration;
    public static volatile CollectionAttribute<Organisation, Dataset> datasetCollection;
    public static volatile SingularAttribute<Organisation, Integer> id;
    public static volatile CollectionAttribute<Organisation, UserOrganisationMembership> userOrganisationMembershipCollection;
    public static volatile SingularAttribute<Organisation, String> address;
    public static volatile SingularAttribute<Organisation, String> contactName;
    public static volatile SingularAttribute<Organisation, String> name;
    public static volatile CollectionAttribute<Organisation, OrganisationAccessRequest> organisationAccessRequestCollection;

}