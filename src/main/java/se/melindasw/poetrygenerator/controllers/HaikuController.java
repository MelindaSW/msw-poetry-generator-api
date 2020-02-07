package se.melindasw.poetrygenerator.controllers;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.melindasw.poetrygenerator.exceptions.HaikuGeneratorException;
import se.melindasw.poetrygenerator.haikufeature.Haiku;
import se.melindasw.poetrygenerator.haikufeature.HaikuRequestModel;
import se.melindasw.poetrygenerator.services.HaikuGeneratorService;

@RestController("/poetrygenerator")
public class HaikuController {

    @Autowired
    private HaikuGeneratorService haikuService;

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

}