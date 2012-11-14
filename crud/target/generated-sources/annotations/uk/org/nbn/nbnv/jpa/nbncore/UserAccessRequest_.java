package uk.org.nbn.nbnv.jpa.nbncore;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.AccessRequestResponseType;
import uk.org.nbn.nbnv.jpa.nbncore.AccessRequestRole;
import uk.org.nbn.nbnv.jpa.nbncore.AccessRequestType;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonObservationFilter;
import uk.org.nbn.nbnv.jpa.nbncore.User;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(UserAccessRequest.class)
public class UserAccessRequest_ { 

    public static volatile SingularAttribute<UserAccessRequest, String> requestReason;
    public static volatile SingularAttribute<UserAccessRequest, Date> responseDate;
    public static volatile SingularAttribute<UserAccessRequest, Integer> filterID;
    public static volatile SingularAttribute<UserAccessRequest, String> responseReason;
    public static volatile SingularAttribute<UserAccessRequest, Date> requestDate;
    public static volatile SingularAttribute<UserAccessRequest, Date> accessExpires;
    public static volatile SingularAttribute<UserAccessRequest, AccessRequestRole> accessRequestRole;
    public static volatile SingularAttribute<UserAccessRequest, AccessRequestResponseType> accessRequestResponseType;
    public static volatile SingularAttribute<UserAccessRequest, User> user;
    public static volatile SingularAttribute<UserAccessRequest, TaxonObservationFilter> taxonObservationFilter;
    public static volatile SingularAttribute<UserAccessRequest, AccessRequestType> accessRequestType;

}