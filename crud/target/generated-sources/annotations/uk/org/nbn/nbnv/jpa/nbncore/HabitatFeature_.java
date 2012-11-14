package uk.org.nbn.nbnv.jpa.nbncore;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.HabitatDataset;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(HabitatFeature.class)
public class HabitatFeature_ { 

    public static volatile SingularAttribute<HabitatFeature, HabitatDataset> habitatDataset;
    public static volatile SingularAttribute<HabitatFeature, byte[]> originalGeom;
    public static volatile SingularAttribute<HabitatFeature, String> providerKey;
    public static volatile SingularAttribute<HabitatFeature, Integer> featureID;
    public static volatile SingularAttribute<HabitatFeature, Date> uploadDate;

}