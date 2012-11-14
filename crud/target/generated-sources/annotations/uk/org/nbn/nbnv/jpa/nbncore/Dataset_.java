package uk.org.nbn.nbnv.jpa.nbncore;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.DatasetAttribute;
import uk.org.nbn.nbnv.jpa.nbncore.DatasetKeyword;
import uk.org.nbn.nbnv.jpa.nbncore.DatasetType;
import uk.org.nbn.nbnv.jpa.nbncore.DatasetUpdateFrequency;
import uk.org.nbn.nbnv.jpa.nbncore.HabitatDataset;
import uk.org.nbn.nbnv.jpa.nbncore.Organisation;
import uk.org.nbn.nbnv.jpa.nbncore.Site;
import uk.org.nbn.nbnv.jpa.nbncore.SiteBoundaryDataset;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonDataset;
import uk.org.nbn.nbnv.jpa.nbncore.User;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(Dataset.class)
public class Dataset_ { 

    public static volatile SingularAttribute<Dataset, DatasetUpdateFrequency> datasetUpdateFrequency;
    public static volatile SingularAttribute<Dataset, DatasetType> datasetType;
    public static volatile SingularAttribute<Dataset, String> providerKey;
    public static volatile SingularAttribute<Dataset, Organisation> organisation;
    public static volatile CollectionAttribute<Dataset, Site> siteCollection;
    public static volatile SingularAttribute<Dataset, String> useConstraints;
    public static volatile SingularAttribute<Dataset, String> purpose;
    public static volatile CollectionAttribute<Dataset, DatasetKeyword> datasetKeywordCollection;
    public static volatile SingularAttribute<Dataset, Date> metadataLastEdited;
    public static volatile SingularAttribute<Dataset, String> dataCaptureMethod;
    public static volatile CollectionAttribute<Dataset, User> userCollection;
    public static volatile SingularAttribute<Dataset, HabitatDataset> habitatDataset;
    public static volatile SingularAttribute<Dataset, String> title;
    public static volatile CollectionAttribute<Dataset, DatasetAttribute> datasetAttributeCollection;
    public static volatile SingularAttribute<Dataset, TaxonDataset> taxonDataset;
    public static volatile SingularAttribute<Dataset, String> geographicalCoverage;
    public static volatile SingularAttribute<Dataset, String> description;
    public static volatile SingularAttribute<Dataset, String> temporalCoverage;
    public static volatile SingularAttribute<Dataset, SiteBoundaryDataset> siteBoundaryDataset;
    public static volatile SingularAttribute<Dataset, String> additionalInformation;
    public static volatile SingularAttribute<Dataset, Date> dateUploaded;
    public static volatile SingularAttribute<Dataset, String> dataQuality;
    public static volatile SingularAttribute<Dataset, String> accessConstraints;
    public static volatile SingularAttribute<Dataset, String> key;

}