package mytodo

class SubjectCount {
  Site site
  int count
  Date createDate

  static constraints = {
  }

  static mapping = {
    table "subject_count"
    createDate column : "create_date"
  }
}
