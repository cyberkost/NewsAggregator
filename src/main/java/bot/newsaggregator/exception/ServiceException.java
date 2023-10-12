package bot.newsaggregator.exception;

import lombok.AllArgsConstructor;
public class ServiceException extends Exception{
    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
