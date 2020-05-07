package se.melindasw.poetrygenerator.services;

import org.springframework.stereotype.Service;
import se.melindasw.poetrygenerator.acrostic.Acrostic;
import se.melindasw.poetrygenerator.exceptions.AcrosticGeneratorException;

public interface AcrosticGeneratorService {
    Acrostic generateAcrosticPoem(String text, String word) throws AcrosticGeneratorException;
}
