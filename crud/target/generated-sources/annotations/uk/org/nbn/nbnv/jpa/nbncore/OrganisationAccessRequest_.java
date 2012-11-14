package uk.org.nbn.nbnv.jpa.nbncore;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.AccessRequestResponseType;
import uk.org.nbn.nbnv.jpa.nbncore.AccessRequestRole;
import uk.org.nbn.nbnv.jpa.nbncore.AccessRequestType;
import uk.org.nbn.nbnv.jpa.nbncore.Organisation;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonObservationFilter;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(OrganisationAccessRequest.class)
public class OrganisationAccessRequest_ { 

    public static volatile SingularAttribute<OrganisationAccessRequest, String> requestReason;
    public static volatile SingularAttribute<OrganisationAccessRequest, Date> responseDate;
    public static volatile SingularAttribute<OrganisationAccessRequest, Integer> filterID;
    public static volatile SingularAttribute<OrganisationAccessRequest, Organisation> organisation;
    public static volatile SingularAttribute<OrganisationAccessRequest, String> responseReason;
    public static volatile SingularAttribute<OrganisationAccessRequest, Date> requestDate;
    public static volatile SingularAttribute<OrganisationAccessRequest, Date> accessExpires;
    public static volatile SingularAttribute<OrganisationAccessRequest, AccessRequestRole> accessRequestRole;
    public static volatile SingularAttribute<OrganisationAccessRequest, AccessRequestResponseType> accessRequestResponseType;
    public static volatile SingularAttribute<OrganisationAccessRequest, TaxonObservationFilter> taxonObservationFilter;
    public static volatile SingularAttribute<OrganisationAccessRequest, AccessRequestType> accessRequestType;

}