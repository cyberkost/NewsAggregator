package bot.newsaggregator.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Data
@Entity(name = "usersDataTable")
public class User {
    @Id
    private Long chatId;
    @Column(name = "first_name", length = 50)
    private String firstName;
    @Column(name = "last_name", length = 50)
    private String lastName;
    @Column(name = "user_name", length = 50)
    private String userName;
    @CreationTimestamp
    @Column(name = "registered_at", nullable = false, updatable = false, columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Timestamp registeredAt;
}
