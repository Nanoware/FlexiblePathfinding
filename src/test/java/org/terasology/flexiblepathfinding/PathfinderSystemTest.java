/*
 * Copyright 2018 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.flexiblepathfinding;

import org.junit.Assert;
import org.junit.Test;
import org.terasology.entitySystem.entity.EntityManager;
import org.terasology.entitySystem.entity.EntityRef;
import org.terasology.entitySystem.entity.internal.PojoEntityManager;
import org.terasology.math.geom.Vector3i;

public class PathfinderSystemTest {
    @Test
    public void exclusion() {
        PathfinderSystem pathfinderSystem = new PathfinderSystem();
        EntityManager entityManager = new PojoEntityManager();
        EntityRef entity = entityManager.create();

        JPSConfig config = new JPSConfig(Vector3i.zero(), Vector3i.north());
        config.requester = entity;

        Assert.assertEquals(pathfinderSystem.requestPath(config, null), 0);
        Assert.assertEquals(pathfinderSystem.requestPath(config, null), -1);
    }
}
