package com.hateos.test.assembler;

import com.hateos.test.resource.UpdatedFieldsResource;
import org.apache.commons.lang3.builder.Diff;
import org.apache.commons.lang3.builder.DiffResult;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CodeLogAssembler {

  private void addNewUpdatedFields(DiffResult diffResult, List<UpdatedFieldsResource> updatedFields) {
    for (Diff<?> diff : diffResult.getDiffs()) {
      UpdatedFieldsResource updatedField = new UpdatedFieldsResource();
      updatedField.setName(diff.getFieldName() == null ? null : diff.getFieldName());
      updatedField.setOldValue(diff.getLeft() == null ? null : diff.getLeft().toString());
      updatedField.setNewValue(diff.getRight() == null ? null : diff.getRight().toString());
      updatedFields.add(updatedField);
    }    
  }
}
