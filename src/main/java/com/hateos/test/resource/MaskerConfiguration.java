package com.hateos.test.resource;

import com.hateos.test.impl.Masker;
import com.hateos.test.impl.MaskerImpl;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.util.List;

@EnableConfigurationProperties(MaskerProperties.class)
public class MaskerConfiguration {

  @Bean
  Masker externalMasker(List<String> maskers, String headerMasker) {
    return new MaskerImpl(maskers, headerMasker);
  }

}
