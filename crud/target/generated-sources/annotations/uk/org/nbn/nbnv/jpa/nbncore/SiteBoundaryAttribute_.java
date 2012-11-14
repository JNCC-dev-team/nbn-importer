package uk.org.nbn.nbnv.jpa.nbncore;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.Attribute;
import uk.org.nbn.nbnv.jpa.nbncore.SiteBoundary;
import uk.org.nbn.nbnv.jpa.nbncore.SiteBoundaryAttributePK;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(SiteBoundaryAttribute.class)
public class SiteBoundaryAttribute_ { 

    public static volatile SingularAttribute<SiteBoundaryAttribute, SiteBoundaryAttributePK> siteBoundaryAttributePK;
    public static volatile SingularAttribute<SiteBoundaryAttribute, Attribute> attribute;
    public static volatile SingularAttribute<SiteBoundaryAttribute, Integer> enumValue;
    public static volatile SingularAttribute<SiteBoundaryAttribute, Long> decimalValue;
    public static volatile SingularAttribute<SiteBoundaryAttribute, SiteBoundary> siteBoundary;
    public static volatile SingularAttribute<SiteBoundaryAttribute, String> textValue;

}