package uk.org.nbn.nbnv.jpa.nbncore;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.AttributeEnumeration;
import uk.org.nbn.nbnv.jpa.nbncore.AttributeStorageLevel;
import uk.org.nbn.nbnv.jpa.nbncore.AttributeStorageType;
import uk.org.nbn.nbnv.jpa.nbncore.DatasetAttribute;
import uk.org.nbn.nbnv.jpa.nbncore.GatewayAttribute;
import uk.org.nbn.nbnv.jpa.nbncore.SampleAttribute;
import uk.org.nbn.nbnv.jpa.nbncore.SiteBoundaryAttribute;
import uk.org.nbn.nbnv.jpa.nbncore.SurveyAttribute;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonAttribute;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonObservationAttribute;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(Attribute.class)
public class Attribute_ { 

    public static volatile CollectionAttribute<Attribute, TaxonAttribute> taxonAttributeCollection;
    public static volatile CollectionAttribute<Attribute, AttributeEnumeration> attributeEnumerationCollection;
    public static volatile SingularAttribute<Attribute, AttributeStorageType> attributeStorageType;
    public static volatile SingularAttribute<Attribute, String> label;
    public static volatile CollectionAttribute<Attribute, TaxonObservationAttribute> taxonObservationAttributeCollection;
    public static volatile CollectionAttribute<Attribute, SampleAttribute> sampleAttributeCollection;
    public static volatile SingularAttribute<Attribute, Integer> id;
    public static volatile CollectionAttribute<Attribute, SurveyAttribute> surveyAttributeCollection;
    public static volatile CollectionAttribute<Attribute, DatasetAttribute> datasetAttributeCollection;
    public static volatile SingularAttribute<Attribute, String> description;
    public static volatile SingularAttribute<Attribute, AttributeStorageLevel> attributeStorageLevel;
    public static volatile SingularAttribute<Attribute, GatewayAttribute> gatewayAttribute;
    public static volatile CollectionAttribute<Attribute, SiteBoundaryAttribute> siteBoundaryAttributeCollection;

}