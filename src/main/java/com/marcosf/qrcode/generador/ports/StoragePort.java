package com.marcosf.qrcode.generador.ports;

public interface StoragePort {
    String save(byte[] fileData, String fileName, String contentType);

    String uploadFile(byte[] fileData, String fileName, String contentType);
}
