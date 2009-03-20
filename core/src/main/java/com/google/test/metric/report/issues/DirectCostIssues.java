/*
 * Copyright 2009 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.test.metric.report.issues;

import com.google.test.metric.report.issues.DirectCostIssues.DirectCostType;
import static com.google.test.metric.report.issues.DirectCostIssues.DirectCostType.CYCLOMATIC;

import java.util.List;
import java.util.Map;

/**
 * Issues that arise from high complexity in the class under analysis.
 * @author alexeagle@google.com (Alex Eagle)
 */
public class DirectCostIssues extends IssuesCategory<DirectCostType> {
  public DirectCostIssues(Map<DirectCostType, List<Issue>> issues) {
    super(issues);
  }

  public DirectCostIssues() {
    super();
  }

  @Override
  Class<DirectCostType> getTypeLiteral() {
    return DirectCostType.class;
  }

  @Override
  public String getName() {
    return "DirectCost";
  }

  public List<Issue> getComplexityIssues() {
    return issues.get(CYCLOMATIC);
  }

  public void add(Issue issue) {
    issues.get(CYCLOMATIC).add(issue);
  }

  public enum DirectCostType {
    CYCLOMATIC
  }
}
