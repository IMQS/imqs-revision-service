package za.co.imqs.revision;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by BradleyM on 2016-03-01.
 */

@RestController
public class RevisionService {

    @Autowired
    private RevisionRepository revisionRepository;

    @RequestMapping("/revision")
    public Revision getRevision(@RequestParam(value = "host") String hostname){
        return revisionRepository.findByHost(hostname);
    }
}
