package com.jardelbarbosa.course.entities;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class User {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String password;

}
