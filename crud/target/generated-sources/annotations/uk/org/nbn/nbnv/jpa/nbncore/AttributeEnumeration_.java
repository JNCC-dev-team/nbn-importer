package uk.org.nbn.nbnv.jpa.nbncore;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.Attribute;
import uk.org.nbn.nbnv.jpa.nbncore.AttributeEnumerationPK;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(AttributeEnumeration.class)
public class AttributeEnumeration_ { 

    public static volatile SingularAttribute<AttributeEnumeration, AttributeEnumerationPK> attributeEnumerationPK;
    public static volatile SingularAttribute<AttributeEnumeration, String> description;
    public static volatile SingularAttribute<AttributeEnumeration, Attribute> attribute;
    public static volatile SingularAttribute<AttributeEnumeration, String> label;

}