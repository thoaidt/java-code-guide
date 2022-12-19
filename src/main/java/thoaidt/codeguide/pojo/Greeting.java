package thoaidt.codeguide.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author thoaidt
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Greeting {

    private long id;

    private String content;

}
