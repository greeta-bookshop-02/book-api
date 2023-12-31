package net.greeta.bookshop.controllers;

import net.greeta.bookshop.models.ImageUploadRequest;
import net.greeta.bookshop.models.ImageUploadResponse;
import net.greeta.bookshop.services.MinioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class FileUploadController {

  private final MinioService minioService;

  @PostMapping("/images/upload")
  public ResponseEntity<ImageUploadResponse> uploadFile(
      @RequestBody byte[] file,
      @RequestParam("fileName") String fileName,
      @RequestHeader(HttpHeaders.CONTENT_TYPE) String contentType
  ) {
    final var response = minioService.uploadImage(new ImageUploadRequest(fileName, contentType, file));
    return ResponseEntity.status(HttpStatus.CREATED).body(response);
  }

}
