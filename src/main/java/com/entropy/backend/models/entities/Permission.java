package com.entropy.backend.models.entities;

import com.entropy.backend.models.entities.base.Base;
import com.entropy.backend.models.enumerations.PermissionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "ofPermission")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Permission extends Base {
    @Id
    @Column(name = "id")
    private Byte id;

    @Column(name = "name")
    @Enumerated(value = EnumType.STRING)
    private PermissionType name;

    @ManyToMany(mappedBy = "permissions")
    private Set<Role> roles = new HashSet<>();
}
