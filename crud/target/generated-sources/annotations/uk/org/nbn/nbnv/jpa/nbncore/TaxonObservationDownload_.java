package uk.org.nbn.nbnv.jpa.nbncore;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.Organisation;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonObservationDownloadPurpose;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonObservationDownloadStatistics;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonObservationFilter;
import uk.org.nbn.nbnv.jpa.nbncore.User;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(TaxonObservationDownload.class)
public class TaxonObservationDownload_ { 

    public static volatile CollectionAttribute<TaxonObservationDownload, TaxonObservationDownloadStatistics> taxonObservationDownloadStatisticsCollection;
    public static volatile SingularAttribute<TaxonObservationDownload, String> reason;
    public static volatile SingularAttribute<TaxonObservationDownload, Integer> filterID;
    public static volatile SingularAttribute<TaxonObservationDownload, Date> downloadTime;
    public static volatile SingularAttribute<TaxonObservationDownload, Organisation> organisation;
    public static volatile SingularAttribute<TaxonObservationDownload, String> userForOrganisation;
    public static volatile SingularAttribute<TaxonObservationDownload, User> user;
    public static volatile SingularAttribute<TaxonObservationDownload, TaxonObservationFilter> taxonObservationFilter;
    public static volatile SingularAttribute<TaxonObservationDownload, TaxonObservationDownloadPurpose> taxonObservationDownloadPurpose;

}