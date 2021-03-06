/* Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.api.codegen.viewmodel;

import com.google.auto.value.AutoValue;

/** A view model for methods samples. */
@AutoValue
public abstract class MethodSampleView {

  /** The value set used in this sample */
  public abstract SampleValueSetView valueSet();

  /** The id of the calling form used in this sample */
  public abstract String callingFormId();

  /** The initialization code constructed from this samples value set and calling form */
  public abstract InitCodeView initCode();

  public static Builder newBuilder() {
    return new AutoValue_MethodSampleView.Builder();
  }

  @AutoValue.Builder
  public abstract static class Builder {
    public abstract Builder valueSet(SampleValueSetView val);

    public abstract Builder callingFormId(String val);

    public abstract Builder initCode(InitCodeView val);

    public abstract MethodSampleView build();
  }
}
