import gov.va.vinci.leo.regex.types.RegularExpressionType

/* An arbitrary name for this annotator. Used in the pipeline for the name of this annotation. */
name = "Exclude Terms"

configuration {
    /* All configuration for this annotator. */
    defaults {
        /* Global for all configrations below if a property specified here is not overridden in a section below. */

        outputType = RegularExpressionType.class.canonicalName
        case_sensitive = false
        matchedPatternFeatureName = "pattern"
        concept_feature_name = "concept"
        groupFeatureName = "group"
    }



    "Gleason Value Exclusions"  {
        expressions = [
                // Pulse and reflex
                '\\d\\s*\\+\\s*\\d\\s*\\+\\s*\\d',
                '\\d\\s*\\d\\s*\\+\\s*\\d',
                //2+2+
                '\\d\\s*\\+\\s*\\d\\s*\\+',
                '\\+\\s*\\d\\s*\\+\\s*\\d',
                '\\d\\s*\\+\\s*\\+\\d',
                'pulse:?\\s*\\+\\d',
                //Dates
                '\\d\\d/\\d\\d?/\\d\\d?',
                //Out of range values for Total Score "Gleason 90 (3+4=7)"
                '3\\d',
                '4\\d',
                '5\\d',
                '6\\d',
                '7\\d',
                '8\\d',
                '9\\d',
                //Percentages
                '\\d\\d?(%|percent)',
                //Should never be a decimal
                '\\d\\.\\d',
                //or more than three digits
                '\\d\\d\\d\\d?',
                '\\d\\d\\d\\d/\\d\\d\\d\\d',
                //Common template, excluding when all zeros
                'PERCENTAGE\\s*OF\\s*GLEASON\\s*PATTERN\\s*4:\\s*(0%?|none)\\s*PERCENTAGE\\s*OF\\s*GLEASON\\s*PATTERN\\s*5:\\s*(0%?|none)',
                'PERCENTAGE\\s*OF\\s*GLEASON\\s*PATTERN\\s*4:(0%?|none)',
                'PERCENTAGE\\s*OF\\s*GLEASON\\s*PATTERN\\s*5:\\s*(0%?|none)',
                'Percentage\\s*of\\s*Gleason\\s*5\\s*is\\s*approximately\\s*\\d\\d?\\s*%\\s*of\\s*the\\s*tumor',
                'PERCENTAGE\\s*OF\\s*PATTERN\\s*4\\s*IN\\s*GLEASON\\s*7\\s*CANCER\\s*\\(IF\\s*APPLICABLE\\):\\s*NOT\\s*APPLICABLE',

        ]
        concept_feature_value = "Gleason_value_Errors"
        outputType = "gov.va.vinci.types.Exclude_Gleason_Value"
    }

}









