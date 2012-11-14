package uk.org.nbn.nbnv.jpa.nbncore;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.Dataset;
import uk.org.nbn.nbnv.jpa.nbncore.HabitatCategory;
import uk.org.nbn.nbnv.jpa.nbncore.HabitatFeature;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(HabitatDataset.class)
public class HabitatDataset_ { 

    public static volatile SingularAttribute<HabitatDataset, HabitatCategory> habitatCategory;
    public static volatile SingularAttribute<HabitatDataset, Dataset> dataset;
    public static volatile SingularAttribute<HabitatDataset, String> datasetKey;
    public static volatile CollectionAttribute<HabitatDataset, HabitatFeature> habitatFeatureCollection;

}