public class CourseId implements Serializable {
    private final UUID value;

    public CourseId(UUID value) {
        this.value = value;
    }

    public UUID getValue() {
        return value;
    }

    // Additional methods based on your business requirements
}

// Aggregate Root: Course
@Entity
public class Course {
    @EmbeddedId
    private CourseId courseId;

    private String name;

    // Other course-related properties and methods

    public Course(CourseId courseId, String name) {
        this.courseId = courseId;
        this.name = name;
        // Other initialization logic
    }

    // Other domain logic and methods

    // Getters and setters
}

// Repository: CourseRepository
public interface CourseRepository extends JpaRepository<Course, CourseId> {
    // Additional query methods can be added based on your requirements
}

// Service: CourseService
@Service
public class CourseService {
    private final CourseRepository courseRepository;

    @Autowired
    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    // Methods for business logic related to courses
}

// Controller: CourseController
@RestController
@RequestMapping("/courses")
public class CourseController {
    private final CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    // REST API endpoints for course-related operations
}

// Bounded Contexts
// Course Creator Role
// Controller: CourseCreatorController
@RestController
@RequestMapping("/course-creator")
public class CourseCreatorController {
    private final CourseService courseService;

    @Autowired
    public CourseCreatorController(CourseService courseService) {
        this.courseService = courseService;
    }

    // Methods specific to the Course Creator role
}

// Teacher Role
// Controller: TeacherController
@RestController
@RequestMapping("/teacher")
public class TeacherController {
    private final CourseService courseService;

    @Autowired
    public TeacherController(CourseService courseService) {
        this.courseService = courseService;
    }

    // Methods specific to the Teacher role
}

// Student Role
// Controller: StudentController
@RestController
@RequestMapping("/student")
public class StudentController {
    private final CourseService courseService;

    @Autowired
    public StudentController(CourseService courseService) {
        this.courseService = courseService;
    }

    // Methods specific to the Student role
}