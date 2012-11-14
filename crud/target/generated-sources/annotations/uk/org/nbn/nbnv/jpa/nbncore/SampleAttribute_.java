package uk.org.nbn.nbnv.jpa.nbncore;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.Attribute;
import uk.org.nbn.nbnv.jpa.nbncore.Sample;
import uk.org.nbn.nbnv.jpa.nbncore.SampleAttributePK;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(SampleAttribute.class)
public class SampleAttribute_ { 

    public static volatile SingularAttribute<SampleAttribute, SampleAttributePK> sampleAttributePK;
    public static volatile SingularAttribute<SampleAttribute, Attribute> attribute;
    public static volatile SingularAttribute<SampleAttribute, Integer> enumValue;
    public static volatile SingularAttribute<SampleAttribute, Long> decimalValue;
    public static volatile SingularAttribute<SampleAttribute, String> textValue;
    public static volatile SingularAttribute<SampleAttribute, Sample> sample;

}