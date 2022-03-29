package com.hateos.test.impl;

import org.springframework.core.annotation.AnnotationAwareOrderComparator;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@Service
public class MaskerImpl implements Masker {

  private final List<String> maskers;

  private final String headerMasker;

  public MaskerImpl(List<String> maskers, String headerMasker) {
    Collections.sort(maskers, AnnotationAwareOrderComparator.INSTANCE);
    this.maskers = maskers;
    this.headerMasker = headerMasker;
  }

  @Override
  public String maskContent(String contentType, String content, String messageType) {
    return content;
  }

  @Override
  public Map<String, List<String>> maskHeaders(Map<String, List<String>> headers) {
    return null;
  }

}
