package uk.org.nbn.nbnv.jpa.nbncore;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.UserOrganisationMembership;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(UserOrganisationRole.class)
public class UserOrganisationRole_ { 

    public static volatile SingularAttribute<UserOrganisationRole, Integer> id;
    public static volatile CollectionAttribute<UserOrganisationRole, UserOrganisationMembership> userOrganisationMembershipCollection;
    public static volatile SingularAttribute<UserOrganisationRole, String> label;

}