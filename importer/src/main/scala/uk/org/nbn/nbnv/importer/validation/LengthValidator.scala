package uk.org.nbn.nbnv.importer.validation

import uk.org.nbn.nbnv.importer.fidelity.{Result, ResultLevel}

class LengthValidator {
  def validate(code: String, ref: String, term: String, value: String, maxLength: Int, minLength:Int = 0) =  {
    if (value == null || value.length <= maxLength) {
      new Result {
        def level = ResultLevel.DEBUG
        def message = "%s: Validated: '%s' has a valid length.".format(code, term)
        def reference = ref
      }
    }
    else {
      new Result {
        def level = ResultLevel.ERROR
        def message = "%s: '%s' is greater then the maximum length of %s".format(code, term, maxLength)
        def reference = ref
      }
    }
  }



}
