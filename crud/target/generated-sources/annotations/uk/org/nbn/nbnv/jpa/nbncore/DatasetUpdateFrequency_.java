package uk.org.nbn.nbnv.jpa.nbncore;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.Dataset;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(DatasetUpdateFrequency.class)
public class DatasetUpdateFrequency_ { 

    public static volatile SingularAttribute<DatasetUpdateFrequency, String> label;
    public static volatile SingularAttribute<DatasetUpdateFrequency, String> code;
    public static volatile CollectionAttribute<DatasetUpdateFrequency, Dataset> datasetCollection;

}