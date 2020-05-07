package se.melindasw.poetrygenerator.controllers;

import javassist.expr.NewArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.melindasw.poetrygenerator.acrostic.Acrostic;
import se.melindasw.poetrygenerator.acrostic.AcrosticRequestModel;
import se.melindasw.poetrygenerator.exceptions.AcrosticGeneratorException;
import se.melindasw.poetrygenerator.exceptions.HaikuGeneratorException;
import se.melindasw.poetrygenerator.haiku.Haiku;
import se.melindasw.poetrygenerator.haiku.HaikuRequestModel;
import se.melindasw.poetrygenerator.services.AcrosticGeneratorService;
import se.melindasw.poetrygenerator.services.HaikuGeneratorService;

@RestController("/poetrygenerator")
public class PoetryController {

    private final HaikuGeneratorService haikuService;
    private final AcrosticGeneratorService acrosticService;

    @Autowired
    public PoetryController(HaikuGeneratorService haikuService, AcrosticGeneratorService acrosticService) {
        this.haikuService = haikuService;
        this.acrosticService = acrosticService;
    }

    @PostMapping("/generatehaiku")
    public ResponseEntity generateHaikuFromText(@RequestBody final HaikuRequestModel model) {
        Haiku generatedHaiku = null;
        try {
            generatedHaiku = haikuService.generateHaiku(model.getText());
        } catch (HaikuGeneratorException e) {
            e.printStackTrace();
            return new ResponseEntity(new HaikuGeneratorException(e.getMessage(), e.getErrorHaiku()), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(generatedHaiku, HttpStatus.ACCEPTED);
    }

    @PostMapping("/generateacrostic")
    public ResponseEntity generateAcrostic(@RequestBody final AcrosticRequestModel model) {
//        Acrostic generatedAcrostic = null;
//        try {
//            generatedAcrostic = acrosticService.generateAcrosticPoem("Test text", "T");
//        } catch (AcrosticGeneratorException e) {
//            e.printStackTrace();
//            return new ResponseEntity(new AcrosticGeneratorException(e.getMessage(), e.getAcrosticError()), HttpStatus.BAD_REQUEST);
//        }
//        return new ResponseEntity(generatedAcrostic, HttpStatus.ACCEPTED);
        return new ResponseEntity("Feature in progress", HttpStatus.OK);
    }

}