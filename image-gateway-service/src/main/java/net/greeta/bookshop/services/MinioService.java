package net.greeta.bookshop.services;

import net.greeta.bookshop.models.ImageUploadRequest;
import net.greeta.bookshop.models.ImageUploadResponse;

public interface MinioService {
  ImageUploadResponse uploadImage(ImageUploadRequest request);
  void deleteImage(String name);
}
