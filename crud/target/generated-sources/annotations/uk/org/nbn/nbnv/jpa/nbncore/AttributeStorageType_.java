package uk.org.nbn.nbnv.jpa.nbncore;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.Attribute;
import uk.org.nbn.nbnv.jpa.nbncore.GatewayAttribute;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(AttributeStorageType.class)
public class AttributeStorageType_ { 

    public static volatile SingularAttribute<AttributeStorageType, Integer> id;
    public static volatile CollectionAttribute<AttributeStorageType, GatewayAttribute> gatewayAttributeCollection;
    public static volatile CollectionAttribute<AttributeStorageType, Attribute> attributeCollection;
    public static volatile SingularAttribute<AttributeStorageType, String> label;

}