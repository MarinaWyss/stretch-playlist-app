// Controller to expose API endpoint

package javaproject.marinalearnsjava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StretchController {

    @Autowired
    private StretchService stretchService;

    @GetMapping("/stretches/{bodyPart}")
    public List<Stretch> getStretchesByBodyPart(@PathVariable String bodyPart) {
        return stretchService.getStretchesByBodyPart(bodyPart);
    }
}