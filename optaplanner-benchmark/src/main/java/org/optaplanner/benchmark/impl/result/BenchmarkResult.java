/*
 * Copyright 2015 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.optaplanner.benchmark.impl.result;

import java.io.File;

import org.optaplanner.core.api.score.Score;

public interface BenchmarkResult {

    /**
     * @return the name of the directory that holds the benchmark's results
     */
    public String getResultDirectoryName();

    /**
     * @return the benchmark result directory as a file
     */
    public File getResultDirectory();

    /**
     * @return true if there is a failed child benchmark and the variable is initialized
     */
    public boolean hasAnyFailure();

    /**
     * @return true if all child benchmarks were a success and the variable is initialized
     */
    public boolean hasAllSuccess();

    public String getName();

    public Integer getAverageUninitializedVariableCount();

    public Score getAverageScore();

}
