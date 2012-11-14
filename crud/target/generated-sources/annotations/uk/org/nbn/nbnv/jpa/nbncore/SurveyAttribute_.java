package uk.org.nbn.nbnv.jpa.nbncore;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.Attribute;
import uk.org.nbn.nbnv.jpa.nbncore.Survey;
import uk.org.nbn.nbnv.jpa.nbncore.SurveyAttributePK;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(SurveyAttribute.class)
public class SurveyAttribute_ { 

    public static volatile SingularAttribute<SurveyAttribute, Survey> survey;
    public static volatile SingularAttribute<SurveyAttribute, Attribute> attribute;
    public static volatile SingularAttribute<SurveyAttribute, Integer> enumValue;
    public static volatile SingularAttribute<SurveyAttribute, SurveyAttributePK> surveyAttributePK;
    public static volatile SingularAttribute<SurveyAttribute, Long> decimalValue;
    public static volatile SingularAttribute<SurveyAttribute, String> textValue;

}