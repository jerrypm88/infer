/*
 * Copyright (c) 2019-present, Facebook, Inc.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class Resources {

  public static void cat() throws IOException {
    FileInputStream fis = null;
    FileOutputStream fos = null;
    try {
      fis = new FileInputStream(new File("infile.txt"));
      fos = new FileOutputStream(new File("outfile.txt"));
      fos.write(fis.read());
    } finally {
      if (fis != null) fis.close();
      if (fos != null) fos.close();
    }
  }
}
