package javaproject.marinalearnsjava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StretchService {

    @Autowired
    private StretchRepo stretchRepo;

    public List<Stretch> getStretchesByBodyPart(String bodyPart) {
        return stretchRepo.findByBodyPart(bodyPart);
    }
}
