package hello.jdbc.connection;

import static org.assertj.core.api.Assertions.assertThat;

import java.sql.Connection;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class DBConnectionUtilTest {

    @Test
    void connection() throws Exception {
        //given
        Connection connection = DBConnectionUtil.getConnection();

        //when


        //then
        assertThat(connection).isNotNull();
    }
}
