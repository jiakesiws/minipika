package components.jdbc;

/*
 * Copyright (C) 2020 tiansheng All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * Creates on 2020/6/8.
 */

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.jiakesiws.minipika.components.jdbc.QueryResultSet;
import org.jiakesiws.minipika.components.jdbc.NativeJdbc;
import org.jiakesiws.minipika.framework.configuration.XMLConfigBuilder;
import org.jiakesiws.minipika.framework.factory.Factorys;

/**
 * @author tiansheng
 */
public class NativeJdbcTest {

  @Test
  public void testSQLExecutor(){
    XMLConfigBuilder builder = new XMLConfigBuilder("minipika.xml");
    builder.initialize();
    NativeJdbc executor = Factorys.forClass(NativeJdbc.class);
    QueryResultSet resultSet = executor.select("select * from sys_config");
    System.out.println(JSON.toJSONString(resultSet));
  }

}
