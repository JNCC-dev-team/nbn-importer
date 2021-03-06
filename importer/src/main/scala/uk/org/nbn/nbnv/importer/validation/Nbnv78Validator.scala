package uk.org.nbn.nbnv.importer.validation

import uk.org.nbn.nbnv.importer.records.NbnRecord
import uk.org.nbn.nbnv.importer.fidelity.{ResultLevel, Result}

class Nbnv78Validator {

  // Record DateType must be one of the following
  def validate(record: NbnRecord) = record.dateType match {
    case "D" | "DD" | "<D" | ">D" | "O" | "OO" | "P" | "Y" | "Y-" | ">Y" | "-Y" | "<Y" | "YY" | "ND" | "U" => {
      new Result {
        def level: ResultLevel.ResultLevel = ResultLevel.DEBUG
        def reference: String = record.dateType
        def message: String = "NBNV-78: Validated: Found a valid date type"
      }
    }
    case _ => {
      new Result {
        def level: ResultLevel.ResultLevel = ResultLevel.ERROR
        def reference: String = record.dateType
        def message: String = "NBNV-78: Unrecognised vague date type"
      }
    }
  }
}
