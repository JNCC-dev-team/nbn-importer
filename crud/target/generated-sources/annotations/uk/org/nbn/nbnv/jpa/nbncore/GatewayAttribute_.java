package uk.org.nbn.nbnv.jpa.nbncore;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.Attribute;
import uk.org.nbn.nbnv.jpa.nbncore.AttributeStorageType;
import uk.org.nbn.nbnv.jpa.nbncore.GatewayAttributeEnumeration;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(GatewayAttribute.class)
public class GatewayAttribute_ { 

    public static volatile SingularAttribute<GatewayAttribute, Integer> id;
    public static volatile CollectionAttribute<GatewayAttribute, Attribute> attributeCollection;
    public static volatile SingularAttribute<GatewayAttribute, String> description;
    public static volatile SingularAttribute<GatewayAttribute, AttributeStorageType> attributeStorageType;
    public static volatile SingularAttribute<GatewayAttribute, String> label;
    public static volatile CollectionAttribute<GatewayAttribute, GatewayAttributeEnumeration> gatewayAttributeEnumerationCollection;

}