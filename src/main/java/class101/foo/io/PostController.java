package class101.foo.io;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostRepository postRepository;

    // 1. 글을 작성한다.
    @PostMapping("/post")
    public Post createPost(@RequestBody Post post) {
        return postRepository.save(post);
    }

    // 2-1. 글 목록을 조회한다.
    @GetMapping("/posts")
    public List<Post> getPostList() {
        return postRepository.findAll();
    }
    
    // 2-2 글 목록을 페이징하여 반환
    
    // 3. 글 번호로 조회
    
    // 4. 글 내용으로 검색 -> 해당 내용이 포함된 모든 글

}
