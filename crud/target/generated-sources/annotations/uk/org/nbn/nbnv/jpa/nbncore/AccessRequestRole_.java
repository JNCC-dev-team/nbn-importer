package uk.org.nbn.nbnv.jpa.nbncore;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.OrganisationAccessRequest;
import uk.org.nbn.nbnv.jpa.nbncore.UserAccessRequest;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(AccessRequestRole.class)
public class AccessRequestRole_ { 

    public static volatile SingularAttribute<AccessRequestRole, Integer> id;
    public static volatile CollectionAttribute<AccessRequestRole, UserAccessRequest> userAccessRequestCollection;
    public static volatile SingularAttribute<AccessRequestRole, String> label;
    public static volatile CollectionAttribute<AccessRequestRole, OrganisationAccessRequest> organisationAccessRequestCollection;

}