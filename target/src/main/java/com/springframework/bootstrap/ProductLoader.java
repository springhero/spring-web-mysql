package com.springframework.bootstrap;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.springframework.repositories.UserRepository;

@Component
public class ProductLoader implements ApplicationListener<ContextRefreshedEvent> {

    private UserRepository userRepository;

    private Logger log = Logger.getLogger(ProductLoader.class);

    @Autowired
    public void setUserRepository(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
//
//        Product shirt = new Product();
//        shirt.setDescription("Spring Framework Guru Shirt");
//        shirt.setPrice(new BigDecimal("18.95"));
//        shirt.setImageUrl("https://springframework.guru/wp-content/uploads/2015/04/spring_framework_guru_shirt-rf412049699c14ba5b68bb1c09182bfa2_8nax2_512.jpg");
//        shirt.setProductId("235268845711068308");
//        userRepository.save(shirt);
//
//        log.info("Saved Shirt - id: " + shirt.getId());
//
//        Product mug = new Product();
//        mug.setDescription("Spring Framework Guru Mug");
//        mug.setImageUrl("https://springframework.guru/wp-content/uploads/2015/04/spring_framework_guru_coffee_mug-r11e7694903c348e1a667dfd2f1474d95_x7j54_8byvr_512.jpg");
//        mug.setProductId("168639393495335947");
//        mug.setPrice(new BigDecimal("11.95"));
//        userRepository.save(mug);
//
//        log.info("Saved Mug - id:" + mug.getId());
    }
}
