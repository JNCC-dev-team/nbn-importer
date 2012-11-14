package uk.org.nbn.nbnv.jpa.nbncore;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.Taxon;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(RecordingEntity.class)
public class RecordingEntity_ { 

    public static volatile SingularAttribute<RecordingEntity, String> recordedName;
    public static volatile SingularAttribute<RecordingEntity, Boolean> dangerous;
    public static volatile SingularAttribute<RecordingEntity, Taxon> taxon;

}