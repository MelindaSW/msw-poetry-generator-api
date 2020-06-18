package se.melindasw.poetrygenerator.haiku;

import lombok.Data;

@Data
public class Haiku {
  public String[] haiku;

  public Haiku(String[] haiku) {
    this.haiku = haiku;
  }
}
