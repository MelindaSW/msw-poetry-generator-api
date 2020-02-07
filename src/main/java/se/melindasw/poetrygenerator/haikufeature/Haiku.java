package se.melindasw.poetrygenerator.haikufeature;

import lombok.Data;

@Data
public class Haiku {
    public String[] haiku;
    public Haiku(String[] haiku) {
        this.haiku = haiku;
    }
}
