package uk.org.nbn.nbnv.jpa.nbncore;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.Designation;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(DesignationCategory.class)
public class DesignationCategory_ { 

    public static volatile SingularAttribute<DesignationCategory, Integer> id;
    public static volatile SingularAttribute<DesignationCategory, String> description;
    public static volatile SingularAttribute<DesignationCategory, Integer> sortOrder;
    public static volatile CollectionAttribute<DesignationCategory, Designation> designationCollection;
    public static volatile SingularAttribute<DesignationCategory, String> label;

}