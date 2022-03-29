package com.hateos.test.impl;

import java.util.List;
import java.util.Map;

public interface Masker {

  String maskContent(String contentType, String content);

  Map<String, List<String>> maskHeaders(Map<String, List<String>> headers);

}
