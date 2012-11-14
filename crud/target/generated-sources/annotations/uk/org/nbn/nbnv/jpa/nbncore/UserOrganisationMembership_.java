package uk.org.nbn.nbnv.jpa.nbncore;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.Organisation;
import uk.org.nbn.nbnv.jpa.nbncore.User;
import uk.org.nbn.nbnv.jpa.nbncore.UserOrganisationMembershipPK;
import uk.org.nbn.nbnv.jpa.nbncore.UserOrganisationRole;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(UserOrganisationMembership.class)
public class UserOrganisationMembership_ { 

    public static volatile SingularAttribute<UserOrganisationMembership, UserOrganisationRole> userOrganisationRole;
    public static volatile SingularAttribute<UserOrganisationMembership, UserOrganisationMembershipPK> userOrganisationMembershipPK;
    public static volatile SingularAttribute<UserOrganisationMembership, Organisation> organisation;
    public static volatile SingularAttribute<UserOrganisationMembership, User> user;

}