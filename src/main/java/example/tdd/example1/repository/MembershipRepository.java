package example.tdd.example1.repository;

import example.tdd.example1.repository.entity.Membership;
import example.tdd.example1.enums.MembershipType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MembershipRepository extends JpaRepository<Membership, Long> {
    Membership findByUserIdAndMembershipType(final String userId, final MembershipType membershipType);

    List<Membership> findAllByUserId(String userId);
}
