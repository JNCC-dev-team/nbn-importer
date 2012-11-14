package uk.org.nbn.nbnv.jpa.nbncore;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.GatewayAttribute;
import uk.org.nbn.nbnv.jpa.nbncore.GatewayAttributeEnumerationPK;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(GatewayAttributeEnumeration.class)
public class GatewayAttributeEnumeration_ { 

    public static volatile SingularAttribute<GatewayAttributeEnumeration, String> description;
    public static volatile SingularAttribute<GatewayAttributeEnumeration, String> label;
    public static volatile SingularAttribute<GatewayAttributeEnumeration, GatewayAttribute> gatewayAttribute;
    public static volatile SingularAttribute<GatewayAttributeEnumeration, GatewayAttributeEnumerationPK> gatewayAttributeEnumerationPK;

}