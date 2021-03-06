import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
 
import javax.sql.DataSource;
 
@Configuration
public class DataConfig{
 
 @Bean
 public DataSource dataSource() {
    final DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setDriverClassName("org.h2.Driver");
    dataSource.setUrl("jdbc:h2:mem:play");
    dataSource.setUsername("root");
    dataSource.setPassword("root");
    return dataSource;
  }
 
}
