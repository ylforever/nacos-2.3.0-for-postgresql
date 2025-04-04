/*
 * Copyright 1999-2022 Alibaba Group Holding Ltd.
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

package com.alibaba.nacos.plugin.auth.impl.constant;

/**
 * Auth plugin page constant.
 *
 * @author huangKeming
 **/

public class AuthPageConstant {
    
    public static final String OFFSET = "OFFSET";
    
    public static final String OFFSET_ROWS = "OFFSET ? ROWS";
    
    public static final String FETCH_NEXT = "FETCH NEXT ? ROWS ONLY";
    
    public static final String LIMIT = "LIMIT";
    
    public static final String LIMIT_SIZE = "LIMIT ?,?";

    /**
     * add by neo
     */
    public static final String OFFSET_LIMIT = "OFFSET ? LIMIT ?";
    
}
