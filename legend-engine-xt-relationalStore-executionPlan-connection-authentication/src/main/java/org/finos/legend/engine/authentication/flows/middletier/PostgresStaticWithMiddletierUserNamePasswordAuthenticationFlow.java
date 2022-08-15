// Copyright 2021 Goldman Sachs
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.finos.legend.engine.authentication.flows.middletier;

import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.store.relational.connection.DatabaseType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PostgresStaticWithMiddletierUserNamePasswordAuthenticationFlow extends AbstractMiddleTierUserNamePasswordAuthenticationFlow
{
    private static final Logger LOGGER = LoggerFactory.getLogger(PostgresStaticWithMiddletierUserNamePasswordAuthenticationFlow.class);

    @Override
    public DatabaseType getDatabaseType()
    {
        return DatabaseType.Postgres;
    }
}