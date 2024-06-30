package com.cloud.image.config;

import com.cloudinary.Cloudinary;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class Config {


  @Bean
    public Cloudinary cloudinaryInit(){

      Map  map = new HashMap();
      map.put("cloud_name","dnsvo6gpd");
      map.put("api_key","527792358932252");
      map.put("api_secret","OmUr0_0QMr7enpOZdGIJIrOZIZ8");
      map.put("secured", true);

      return new Cloudinary(map);
  }

}
