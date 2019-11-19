package co.ga.bookstore;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource
public interface BookRepository extends CrudRepository<Book, Long> {

    @RestResource(path = "byTitle")
    @ApiOperation("find all books that contain the string q in their title, ignoring case")
    @ApiResponses(value = {
            @ApiResponse(code = 404, message = "Not found.") })
    List<Book> findByTitleIgnoreCaseContaining(@Param("q") String q);




}

