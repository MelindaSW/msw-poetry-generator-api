package se.melindasw.poetrygenerator.acrostic;

import lombok.Data;

@Data
public class Acrostic {
  public String[] acrostic;

  public Acrostic(String[] acrostic) {
    this.acrostic = acrostic;
  }
}
