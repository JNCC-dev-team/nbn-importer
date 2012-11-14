package uk.org.nbn.nbnv.jpa.nbncore;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.Attribute;
import uk.org.nbn.nbnv.jpa.nbncore.Dataset;
import uk.org.nbn.nbnv.jpa.nbncore.DatasetAttributePK;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(DatasetAttribute.class)
public class DatasetAttribute_ { 

    public static volatile SingularAttribute<DatasetAttribute, Dataset> dataset;
    public static volatile SingularAttribute<DatasetAttribute, Attribute> attribute;
    public static volatile SingularAttribute<DatasetAttribute, DatasetAttributePK> datasetAttributePK;
    public static volatile SingularAttribute<DatasetAttribute, Integer> enumValue;
    public static volatile SingularAttribute<DatasetAttribute, Long> decimalValue;
    public static volatile SingularAttribute<DatasetAttribute, String> textValue;

}