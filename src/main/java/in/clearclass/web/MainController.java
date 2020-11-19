package in.clearclass.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.clearclass.dao.MessageDAO;
import in.clearclass.entity.Message;

@RestController
@RequestMapping("/message")
public class MainController {
   private static final Logger logger = LoggerFactory.getLogger(MainController.class);

   @Autowired
   MessageDAO dao;
   
   @PostMapping
   public Message addMessage(@RequestBody Message msg) {
      logger.info("msg received: " + msg);
      dao.save(msg);
      return msg;
   }
}
