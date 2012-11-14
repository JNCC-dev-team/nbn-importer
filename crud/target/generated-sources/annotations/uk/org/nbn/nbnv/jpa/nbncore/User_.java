package uk.org.nbn.nbnv.jpa.nbncore;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.Dataset;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonObservation;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonObservationDownload;
import uk.org.nbn.nbnv.jpa.nbncore.UserAccessRequest;
import uk.org.nbn.nbnv.jpa.nbncore.UserOrganisationMembership;
import uk.org.nbn.nbnv.jpa.nbncore.UserType;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, Date> lastLoggedIn;
    public static volatile SingularAttribute<User, Boolean> subscribedToAdminMails;
    public static volatile SingularAttribute<User, String> phone;
    public static volatile CollectionAttribute<User, UserAccessRequest> userAccessRequestCollection;
    public static volatile SingularAttribute<User, String> forename;
    public static volatile CollectionAttribute<User, TaxonObservation> taxonObservationCollection;
    public static volatile SingularAttribute<User, Boolean> bannedFromValidation;
    public static volatile CollectionAttribute<User, TaxonObservationDownload> taxonObservationDownloadCollection;
    public static volatile SingularAttribute<User, Boolean> englishNameOrder;
    public static volatile SingularAttribute<User, byte[]> passwordSha1;
    public static volatile SingularAttribute<User, String> surname;
    public static volatile CollectionAttribute<User, Dataset> datasetCollection;
    public static volatile SingularAttribute<User, UserType> userType;
    public static volatile SingularAttribute<User, Boolean> allowEmailAlerts;
    public static volatile SingularAttribute<User, Integer> id;
    public static volatile SingularAttribute<User, String> activationKey;
    public static volatile SingularAttribute<User, String> username;
    public static volatile CollectionAttribute<User, UserOrganisationMembership> userOrganisationMembershipCollection;
    public static volatile SingularAttribute<User, Date> registrationDate;
    public static volatile SingularAttribute<User, byte[]> passwordMd5Sha1;
    public static volatile SingularAttribute<User, String> email;
    public static volatile SingularAttribute<User, Boolean> subscribedToNBNMarketting;
    public static volatile SingularAttribute<User, Boolean> active;
    public static volatile SingularAttribute<User, Boolean> invalidEmail;

}