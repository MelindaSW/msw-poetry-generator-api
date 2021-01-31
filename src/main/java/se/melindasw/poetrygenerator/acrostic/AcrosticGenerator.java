package se.melindasw.poetrygenerator.acrostic;

import org.springframework.stereotype.Service;
import se.melindasw.poetrygenerator.services.AcrosticGeneratorService;

@Service
public class AcrosticGenerator implements AcrosticGeneratorService {
  @Override
  public Acrostic generateAcrosticPoem(String text, String word) {
    return null;
  }
}
