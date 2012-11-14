package uk.org.nbn.nbnv.jpa.nbncore;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.SiteBoundaryDataset;
import uk.org.nbn.nbnv.jpa.nbncore.SiteBoundaryType;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(SiteBoundaryType.class)
public class SiteBoundaryType_ { 

    public static volatile SingularAttribute<SiteBoundaryType, Integer> id;
    public static volatile CollectionAttribute<SiteBoundaryType, SiteBoundaryDataset> siteBoundaryDatasetCollection;
    public static volatile CollectionAttribute<SiteBoundaryType, SiteBoundaryType> siteBoundaryTypeCollection;
    public static volatile SingularAttribute<SiteBoundaryType, String> siteTypeCode;
    public static volatile SingularAttribute<SiteBoundaryType, String> siteTypeName;
    public static volatile SingularAttribute<SiteBoundaryType, String> xmlEnumValue;
    public static volatile SingularAttribute<SiteBoundaryType, SiteBoundaryType> siteBoundaryType;

}