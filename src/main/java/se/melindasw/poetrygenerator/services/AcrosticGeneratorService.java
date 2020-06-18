package se.melindasw.poetrygenerator.services;

import se.melindasw.poetrygenerator.acrostic.Acrostic;
import se.melindasw.poetrygenerator.exceptions.AcrosticGeneratorException;

public interface AcrosticGeneratorService {
  Acrostic generateAcrosticPoem(String text, String word) throws AcrosticGeneratorException;
}
