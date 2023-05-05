package entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;


/**
 *
 * @author Plaul
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "roles")
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "role_name", length = 20)
    private String roleName;
    
    @ManyToMany(mappedBy = "roleList")
    private List<User> userList;



    public Role(String roleName) {
        this.roleName = roleName;
    }


}
