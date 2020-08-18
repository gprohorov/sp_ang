package pro.edu.sp_ang;

import org.apache.logging.log4j.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class MyRestController {

    private static final Logger logger = LogManager.getLogger(MyRestController.class);
    private List<Item> list = new ArrayList<>(

            Arrays.asList(
                    new Item("1", "POETRY","PoetryPoetryPoetry"),
                    new Item("2", "FICTION","Fiction"),
                    new Item("3", "DOCUMENTAL","Docs")
            )
    );

    @RequestMapping("/hello")
    public String showHello(){

        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");

        return "<h1> Hello </h1>";
    }

    @RequestMapping("/item/get/all")
    public List<Item>  showGenres(){
        return list;
    }

    @RequestMapping("/item/delete/{id}l")
    public void  deleteGenre(@PathVariable("id") String id){
        System.out.println(" Genre " + id + " was deleted");
    }



}
