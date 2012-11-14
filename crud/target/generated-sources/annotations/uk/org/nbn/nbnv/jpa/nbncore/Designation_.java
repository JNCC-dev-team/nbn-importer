package uk.org.nbn.nbnv.jpa.nbncore;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.DesignationCategory;
import uk.org.nbn.nbnv.jpa.nbncore.Feature;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonDesignation;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(Designation.class)
public class Designation_ { 

    public static volatile SingularAttribute<Designation, Integer> id;
    public static volatile SingularAttribute<Designation, DesignationCategory> designationCategory;
    public static volatile SingularAttribute<Designation, String> description;
    public static volatile SingularAttribute<Designation, String> name;
    public static volatile SingularAttribute<Designation, String> geographicalConstraint;
    public static volatile SingularAttribute<Designation, String> label;
    public static volatile SingularAttribute<Designation, Feature> feature;
    public static volatile SingularAttribute<Designation, String> code;
    public static volatile CollectionAttribute<Designation, TaxonDesignation> taxonDesignationCollection;

}