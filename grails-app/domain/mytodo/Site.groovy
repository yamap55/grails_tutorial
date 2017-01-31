package mytodo

class Site {
  String name
  String originalSiteId

  static constraints = {
  }

  static mapping = {
    table "site"
    originalSiteId column : "original_site_id"
  }
}
