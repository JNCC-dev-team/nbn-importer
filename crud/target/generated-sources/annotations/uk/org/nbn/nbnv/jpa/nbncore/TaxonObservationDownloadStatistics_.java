package uk.org.nbn.nbnv.jpa.nbncore;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonDataset;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonObservationDownload;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonObservationDownloadStatisticsPK;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(TaxonObservationDownloadStatistics.class)
public class TaxonObservationDownloadStatistics_ { 

    public static volatile SingularAttribute<TaxonObservationDownloadStatistics, Integer> recordCount;
    public static volatile SingularAttribute<TaxonObservationDownloadStatistics, TaxonDataset> taxonDataset;
    public static volatile SingularAttribute<TaxonObservationDownloadStatistics, TaxonObservationDownload> taxonObservationDownload;
    public static volatile SingularAttribute<TaxonObservationDownloadStatistics, TaxonObservationDownloadStatisticsPK> taxonObservationDownloadStatisticsPK;

}