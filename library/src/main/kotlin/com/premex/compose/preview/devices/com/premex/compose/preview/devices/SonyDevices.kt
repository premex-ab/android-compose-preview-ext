package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Sony device specifications for Android Compose previews.
 *
 * This extension provides Sony device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sony.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sony: Any
  get() = object {
      /** DeviceSpec(manufacturer=Sony, code=A001SO, width=1080, height=2520, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=A001SO, width=1080,
      height=2520, dpi=420, isGoogleDevice=false).code */
      val A001SO = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=A002SO, width=1080, height=2520, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=A002SO, width=1080,
      height=2520, dpi=420, isGoogleDevice=false).code */
      val A002SO = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=A101SO, width=1096, height=2560, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=A101SO, width=1096,
      height=2560, dpi=420, isGoogleDevice=false).code */
      val A101SO = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=A102SO, width=1080, height=2520, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=A102SO, width=1080,
      height=2520, dpi=420, isGoogleDevice=false).code */
      val A102SO = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=A103SO, width=1080, height=2520, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=A103SO, width=1080,
      height=2520, dpi=420, isGoogleDevice=false).code */
      val A103SO = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=A201SO, width=1096, height=2560, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=A201SO, width=1096,
      height=2560, dpi=420, isGoogleDevice=false).code */
      val A201SO = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=A202SO, width=1080, height=2520, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=A202SO, width=1080,
      height=2520, dpi=420, isGoogleDevice=false).code */
      val A202SO = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=A203SO, width=720, height=1496, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=A203SO, width=720,
      height=1496, dpi=300, isGoogleDevice=false).code */
      val A203SO = "spec:width=720,height=1496,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=Sony, code=A204SO, width=1080, height=2520, dpi=450,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=A204SO, width=1080,
      height=2520, dpi=450, isGoogleDevice=false).code */
      val A204SO = "spec:width=1080,height=2520,unit=px,dpi=450"

      /** DeviceSpec(manufacturer=Sony, code=A301SO, width=1096, height=2560, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=A301SO, width=1096,
      height=2560, dpi=420, isGoogleDevice=false).code */
      val A301SO = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=A302SO, width=1080, height=2520, dpi=450,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=A302SO, width=1080,
      height=2520, dpi=450, isGoogleDevice=false).code */
      val A302SO = "spec:width=1080,height=2520,unit=px,dpi=450"

      /** DeviceSpec(manufacturer=Sony, code=A401SO, width=1080, height=2340, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=A401SO, width=1080,
      height=2340, dpi=400, isGoogleDevice=false).code */
      val A401SO = "spec:width=1080,height=2340,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=Sony, code=A402SO, width=1080, height=2520, dpi=450,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=A402SO, width=1080,
      height=2520, dpi=450, isGoogleDevice=false).code */
      val A402SO = "spec:width=1080,height=2520,unit=px,dpi=450"

      /** DeviceSpec(manufacturer=Sony, code=BRAVIA_AE2, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=BRAVIA_AE2, width=2160,
      height=3840, dpi=320, isGoogleDevice=false).code */
      val BRAVIA_AE2 = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=BRAVIA_AE_M6L, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=BRAVIA_AE_M6L,
      width=2160, height=3840, dpi=320, isGoogleDevice=false).code */
      val BRAVIA_AE_M6L = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=BRAVIA_ATV2, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=BRAVIA_ATV2, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val BRAVIA_ATV2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=BRAVIA_ATV3_2K, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=BRAVIA_ATV3_2K,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val BRAVIA_ATV3_2K = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=BRAVIA_ATV3_4K, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=BRAVIA_ATV3_4K,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val BRAVIA_ATV3_4K = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=BRAVIA_BF1, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=BRAVIA_BF1, width=2160,
      height=3840, dpi=320, isGoogleDevice=false).code */
      val BRAVIA_BF1 = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=BRAVIA_UR1_4K, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=BRAVIA_UR1_4K,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val BRAVIA_UR1_4K = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=BRAVIA_UR2_4K, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=BRAVIA_UR2_4K,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val BRAVIA_UR2_4K = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=BRAVIA_UR3, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=BRAVIA_UR3, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val BRAVIA_UR3 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=BRAVIA_VH1, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=BRAVIA_VH1, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val BRAVIA_VH1 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=BRAVIA_VH2, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=BRAVIA_VH2, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val BRAVIA_VH2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=BRAVIA_VH21, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=BRAVIA_VH21, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val BRAVIA_VH21 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=BRAVIA_VH22, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=BRAVIA_VH22, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val BRAVIA_VH22 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=BRAVIA_VU1, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=BRAVIA_VU1, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val BRAVIA_VU1 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=BRAVIA_VU1_2K, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=BRAVIA_VU1_2K,
      width=720, height=1280, dpi=213, isGoogleDevice=false).code */
      val BRAVIA_VU1_2K = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Sony, code=BRAVIA_VU1_4K, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=BRAVIA_VU1_4K,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val BRAVIA_VU1_4K = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=BRAVIA_VU31_2K, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=BRAVIA_VU31_2K,
      width=720, height=1280, dpi=213, isGoogleDevice=false).code */
      val BRAVIA_VU31_2K = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Sony, code=BRAVIA_VU31_4K, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=BRAVIA_VU31_4K,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val BRAVIA_VU31_4K = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=BRAVIA_VU3_2K, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=BRAVIA_VU3_2K,
      width=720, height=1280, dpi=213, isGoogleDevice=false).code */
      val BRAVIA_VU3_2K = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Sony, code=BRAVIA_VU3_4K, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=BRAVIA_VU3_4K,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val BRAVIA_VU3_4K = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=C1504, width=320, height=480, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=C1504, width=320,
      height=480, dpi=160, isGoogleDevice=false).code */
      val C1504 = "spec:width=320,height=480,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Sony, code=C1505, width=320, height=480, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=C1505, width=320,
      height=480, dpi=160, isGoogleDevice=false).code */
      val C1505 = "spec:width=320,height=480,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Sony, code=C1604, width=320, height=480, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=C1604, width=320,
      height=480, dpi=160, isGoogleDevice=false).code */
      val C1604 = "spec:width=320,height=480,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Sony, code=C1605, width=320, height=480, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=C1605, width=320,
      height=480, dpi=160, isGoogleDevice=false).code */
      val C1605 = "spec:width=320,height=480,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Sony, code=C1904, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=C1904, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val C1904 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=C1905, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=C1905, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val C1905 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=C2004, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=C2004, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val C2004 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=C2005, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=C2005, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val C2005 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=C2104, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=C2104, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val C2104 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=C2105, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=C2105, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val C2105 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=C2304, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=C2304, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val C2304 = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=C2305, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=C2305, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val C2305 = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=C5302, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=C5302, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val C5302 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=C5303, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=C5303, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val C5303 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=C5306, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=C5306, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val C5306 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=C5502, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=C5502, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val C5502 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=C5503, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=C5503, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val C5503 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=C6502, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=C6502, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val C6502 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=C6503, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=C6503, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val C6503 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=C6506, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=C6506, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val C6506 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=C6602, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=C6602, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val C6602 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=C6603, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=C6603, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val C6603 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=C6606, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=C6606, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val C6606 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=C6616, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=C6616, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val C6616 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=C6802, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=C6802, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val C6802 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=C6806, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=C6806, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val C6806 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=C6833, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=C6833, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val C6833 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=C6843, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=C6843, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val C6843 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=C6902, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=C6902, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val C6902 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=C6903, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=C6903, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val C6903 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=C6906, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=C6906, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val C6906 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=C6916, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=C6916, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val C6916 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=C6943, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=C6943, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val C6943 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=D2004, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=D2004, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val D2004 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=D2005, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=D2005, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val D2005 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=D2105, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=D2105, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val D2105 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=D2114, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=D2114, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val D2114 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=D2202, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=D2202, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val D2202 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=D2203, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=D2203, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val D2203 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=D2206, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=D2206, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val D2206 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=D2212, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=D2212, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val D2212 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=D2243, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=D2243, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val D2243 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=D2302, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=D2302, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val D2302 = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=D2303, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=D2303, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val D2303 = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=D2305, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=D2305, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val D2305 = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=D2306, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=D2306, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val D2306 = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=D2403, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=D2403, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val D2403 = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=D2406, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=D2406, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val D2406 = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=D2502, width=720, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=D2502, width=720,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val D2502 = "spec:width=720,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=D2533, width=720, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=D2533, width=720,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val D2533 = "spec:width=720,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=D5103, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=D5103, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val D5103 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=D5106, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=D5106, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val D5106 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=D5303, width=720, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=D5303, width=720,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val D5303 = "spec:width=720,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=D5306, width=720, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=D5306, width=720,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val D5306 = "spec:width=720,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=D5316, width=720, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=D5316, width=720,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val D5316 = "spec:width=720,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=D5322, width=720, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=D5322, width=720,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val D5322 = "spec:width=720,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=D5503, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=D5503, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val D5503 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=D5788, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=D5788, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val D5788 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=D5803, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=D5803, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val D5803 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=D5833, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=D5833, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val D5833 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=D6502, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=D6502, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val D6502 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=D6503, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=D6503, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val D6503 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=D6543, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=D6543, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val D6543 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=D6563, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=D6563, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val D6563 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=D6603, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=D6603, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val D6603 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=D6616, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=D6616, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val D6616 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=D6633, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=D6633, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val D6633 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=D6643, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=D6643, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val D6643 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=D6646, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=D6646, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val D6646 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=D6653, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=D6653, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val D6653 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=D6683, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=D6683, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val D6683 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=E2003, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=E2003, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val E2003 = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=E2006, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=E2006, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val E2006 = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=E2033, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=E2033, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val E2033 = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=E2053, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=E2053, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val E2053 = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=E2104, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=E2104, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val E2104 = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=E2105, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=E2105, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val E2105 = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=E2115, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=E2115, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val E2115 = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=E2124, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=E2124, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val E2124 = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=E2303, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=E2303, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val E2303 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=E2306, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=E2306, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val E2306 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=E2312, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=E2312, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val E2312 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=E2333, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=E2333, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val E2333 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=E2353, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=E2353, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val E2353 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=E2363, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=E2363, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val E2363 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=E5303, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=E5303, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val E5303 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=E5306, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=E5306, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val E5306 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=E5333, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=E5333, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val E5333 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=E5343, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=E5343, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val E5343 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=E5353, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=E5353, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val E5353 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=E5363, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=E5363, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val E5363 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=E5506, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=E5506, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val E5506 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=E5533, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=E5533, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val E5533 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=E5553, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=E5553, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val E5553 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=E5563, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=E5563, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val E5563 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=E5603, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=E5603, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val E5603 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=E5606, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=E5606, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val E5606 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=E5633, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=E5633, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val E5633 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=E5653, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=E5653, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val E5653 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=E5663, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=E5663, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val E5663 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=E5803, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=E5803, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val E5803 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=E5823, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=E5823, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val E5823 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=E6533, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=E6533, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val E6533 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=E6553, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=E6553, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val E6553 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=E6603, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=E6603, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val E6603 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=E6633, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=E6633, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val E6633 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=E6653, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=E6653, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val E6653 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=E6683, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=E6683, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val E6683 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=E6833, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=E6833, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val E6833 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=E6853, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=E6853, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val E6853 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=E6883, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=E6883, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val E6883 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=F3111, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=F3111, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val F3111 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=F3112, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=F3112, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val F3112 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=F3113, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=F3113, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val F3113 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=F3115, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=F3115, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val F3115 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=F3116, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=F3116, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val F3116 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=F3211, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=F3211, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val F3211 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=F3212, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=F3212, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val F3212 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=F3213, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=F3213, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val F3213 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=F3215, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=F3215, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val F3215 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=F3216, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=F3216, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val F3216 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=F3311, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=F3311, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val F3311 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=F3313, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=F3313, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val F3313 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=F5121, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=F5121, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val F5121 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=F5122, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=F5122, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val F5122 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=F5321, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=F5321, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val F5321 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=F8131, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=F8131, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val F8131 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=F8132, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=F8132, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val F8132 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=F8331, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=F8331, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val F8331 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=F8332, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=F8332, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val F8332 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=G1109, width=768, height=1366, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=G1109, width=768,
      height=1366, dpi=160, isGoogleDevice=false).code */
      val G1109 = "spec:width=768,height=1366,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Sony, code=G2199, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=G2199, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val G2199 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=G2299, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=G2299, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val G2299 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=G3112, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=G3112, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val G3112 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=G3116, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=G3116, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val G3116 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=G3121, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=G3121, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val G3121 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=G3123, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=G3123, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val G3123 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=G3125, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=G3125, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val G3125 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=G3212, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=G3212, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val G3212 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=G3221, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=G3221, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val G3221 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=G3223, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=G3223, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val G3223 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=G3226, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=G3226, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val G3226 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=G3311, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=G3311, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val G3311 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=G3312, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=G3312, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val G3312 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=G3313, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=G3313, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val G3313 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=G3412, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=G3412, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val G3412 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=G3416, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=G3416, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val G3416 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=G3421, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=G3421, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val G3421 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=G3423, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=G3423, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val G3423 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=G3426, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=G3426, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val G3426 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=G8141, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=G8141, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val G8141 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=G8142, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=G8142, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val G8142 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=G8188, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=G8188, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val G8188 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=G8231, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=G8231, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val G8231 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=G8232, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=G8232, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val G8232 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=G8341, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=G8341, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val G8341 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=G8342, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=G8342, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val G8342 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=G8343, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=G8343, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val G8343 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=G8441, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=G8441, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val G8441 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=H3113, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=H3113, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val H3113 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=H3123, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=H3123, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val H3123 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=H3133, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=H3133, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val H3133 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=H3213, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=H3213, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val H3213 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=H3223, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=H3223, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val H3223 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=H3311, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=H3311, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val H3311 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=H3321, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=H3321, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val H3321 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=H3413, width=1080, height=2160, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=H3413, width=1080,
      height=2160, dpi=420, isGoogleDevice=false).code */
      val H3413 = "spec:width=1080,height=2160,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=H4113, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=H4113, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val H4113 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=H4133, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=H4133, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val H4133 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=H4213, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=H4213, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val H4213 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=H4233, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=H4233, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val H4233 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=H4311, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=H4311, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val H4311 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=H4331, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=H4331, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val H4331 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=H4413, width=1080, height=2160, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=H4413, width=1080,
      height=2160, dpi=420, isGoogleDevice=false).code */
      val H4413 = "spec:width=1080,height=2160,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=H4493, width=1080, height=2160, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=H4493, width=1080,
      height=2160, dpi=420, isGoogleDevice=false).code */
      val H4493 = "spec:width=1080,height=2160,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=H8116, width=1080, height=1920, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=H8116, width=1080,
      height=1920, dpi=420, isGoogleDevice=false).code */
      val H8116 = "spec:width=1080,height=1920,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=H8166, width=1080, height=1920, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=H8166, width=1080,
      height=1920, dpi=420, isGoogleDevice=false).code */
      val H8166 = "spec:width=1080,height=1920,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=H8216, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=H8216, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val H8216 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=H8266, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=H8266, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val H8266 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=H8276, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=H8276, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val H8276 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=H8296, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=H8296, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val H8296 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=H8314, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=H8314, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val H8314 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=H8324, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=H8324, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val H8324 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=H8416, width=1440, height=2880, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=H8416, width=1440,
      height=2880, dpi=560, isGoogleDevice=false).code */
      val H8416 = "spec:width=1440,height=2880,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=Sony, code=H9436, width=1440, height=2880, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=H9436, width=1440,
      height=2880, dpi=560, isGoogleDevice=false).code */
      val H9436 = "spec:width=1440,height=2880,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=Sony, code=H9493, width=1440, height=2880, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=H9493, width=1440,
      height=2880, dpi=560, isGoogleDevice=false).code */
      val H9493 = "spec:width=1440,height=2880,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=Sony, code=I3113, width=1080, height=2520, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=I3113, width=1080,
      height=2520, dpi=480, isGoogleDevice=false).code */
      val I3113 = "spec:width=1080,height=2520,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=I3123, width=1080, height=2520, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=I3123, width=1080,
      height=2520, dpi=480, isGoogleDevice=false).code */
      val I3123 = "spec:width=1080,height=2520,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=I3213, width=1080, height=2520, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=I3213, width=1080,
      height=2520, dpi=420, isGoogleDevice=false).code */
      val I3213 = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=I3223, width=1080, height=2520, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=I3223, width=1080,
      height=2520, dpi=420, isGoogleDevice=false).code */
      val I3223 = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=I3312, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=I3312, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val I3312 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=I4113, width=1080, height=2520, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=I4113, width=1080,
      height=2520, dpi=480, isGoogleDevice=false).code */
      val I4113 = "spec:width=1080,height=2520,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=I4193, width=1080, height=2520, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=I4193, width=1080,
      height=2520, dpi=480, isGoogleDevice=false).code */
      val I4193 = "spec:width=1080,height=2520,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=I4213, width=1080, height=2520, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=I4213, width=1080,
      height=2520, dpi=420, isGoogleDevice=false).code */
      val I4213 = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=I4293, width=1080, height=2520, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=I4293, width=1080,
      height=2520, dpi=420, isGoogleDevice=false).code */
      val I4293 = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=I4312, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=I4312, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val I4312 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=I4332, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=I4332, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val I4332 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=icx1237, width=480, height=782, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=icx1237, width=480,
      height=782, dpi=240, isGoogleDevice=false).code */
      val ICX1237 = "spec:width=480,height=782,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=icx1240, width=480, height=782, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=icx1240, width=480,
      height=782, dpi=240, isGoogleDevice=false).code */
      val ICX1240 = "spec:width=480,height=782,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=icx1265, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=icx1265, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val ICX1265 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=J3173, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=J3173, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val J3173 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=J3273, width=1080, height=2520, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=J3273, width=1080,
      height=2520, dpi=420, isGoogleDevice=false).code */
      val J3273 = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=J8110, width=1096, height=2560, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=J8110, width=1096,
      height=2560, dpi=420, isGoogleDevice=false).code */
      val J8110 = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=J8170, width=1096, height=2560, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=J8170, width=1096,
      height=2560, dpi=420, isGoogleDevice=false).code */
      val J8170 = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=J8210, width=1080, height=2520, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=J8210, width=1080,
      height=2520, dpi=420, isGoogleDevice=false).code */
      val J8210 = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=J8270, width=1080, height=2520, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=J8270, width=1080,
      height=2520, dpi=420, isGoogleDevice=false).code */
      val J8270 = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=J9110, width=1096, height=2560, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=J9110, width=1096,
      height=2560, dpi=420, isGoogleDevice=false).code */
      val J9110 = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=J9150, width=1096, height=2560, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=J9150, width=1096,
      height=2560, dpi=420, isGoogleDevice=false).code */
      val J9150 = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=J9210, width=1080, height=2520, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=J9210, width=1080,
      height=2520, dpi=420, isGoogleDevice=false).code */
      val J9210 = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=J9260, width=1080, height=2520, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=J9260, width=1080,
      height=2520, dpi=420, isGoogleDevice=false).code */
      val J9260 = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=L39h, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=L39h, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val L39H = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=L39t, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=L39t, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val L39T = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=L39u, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=L39u, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val L39U = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=LT25i, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=LT25i, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val LT25I = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=LT29i, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=LT29i, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val LT29I = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=LT30p, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=LT30p, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val LT30P = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=PDT-FP1, width=1080, height=2520, dpi=450,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=PDT-FP1, width=1080,
      height=2520, dpi=450, isGoogleDevice=false).code */
      val PDT_FP1 = "spec:width=1080,height=2520,unit=px,dpi=450"

      /** DeviceSpec(manufacturer=Sony, code=SGP311, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=SGP311, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val SGP311 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=SGP312, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=SGP312, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val SGP312 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=SGP321, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=SGP321, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val SGP321 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=SGP351, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=SGP351, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val SGP351 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=SGP412, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=SGP412, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SGP412 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=SGP511, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=SGP511, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val SGP511 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=SGP512, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=SGP512, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val SGP512 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=SGP521, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=SGP521, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val SGP521 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=SGP551, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=SGP551, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val SGP551 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=SGP611, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=SGP611, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SGP611 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=SGP612, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=SGP612, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SGP612 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=SGP621, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=SGP621, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SGP621 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=SGP641, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=SGP641, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SGP641 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=SGP712, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=SGP712, width=1600,
      height=2560, dpi=320, isGoogleDevice=false).code */
      val SGP712 = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=SGP771, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=SGP771, width=1600,
      height=2560, dpi=320, isGoogleDevice=false).code */
      val SGP771 = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=SOV42-u, width=1080, height=2520, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=SOV42-u, width=1080,
      height=2520, dpi=420, isGoogleDevice=false).code */
      val SOV42_U = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=ST26a, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=ST26a, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val ST26A = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=ST26i, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=ST26i, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val ST26I = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sony, code=SVP-DTV15, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=SVP-DTV15, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SVP_DTV15 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sony, code=txs03, width=752, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=txs03, width=752,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TXS03 = "spec:width=752,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Sony, code=XL39h, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XL39h, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val XL39H = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=XQ-AD51, width=720, height=1680, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-AD51, width=720,
      height=1680, dpi=300, isGoogleDevice=false).code */
      val XQ_AD51 = "spec:width=720,height=1680,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=Sony, code=XQ-AD52, width=720, height=1680, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-AD52, width=720,
      height=1680, dpi=300, isGoogleDevice=false).code */
      val XQ_AD52 = "spec:width=720,height=1680,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=Sony, code=XQ-AQ52, width=1096, height=2560, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-AQ52, width=1096,
      height=2560, dpi=420, isGoogleDevice=false).code */
      val XQ_AQ52 = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=XQ-AQ62, width=1096, height=2560, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-AQ62, width=1096,
      height=2560, dpi=420, isGoogleDevice=false).code */
      val XQ_AQ62 = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=XQ-AS42, width=1080, height=2520, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-AS42, width=1080,
      height=2520, dpi=420, isGoogleDevice=false).code */
      val XQ_AS42 = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=XQ-AS52, width=1080, height=2520, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-AS52, width=1080,
      height=2520, dpi=420, isGoogleDevice=false).code */
      val XQ_AS52 = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=XQ-AS62, width=1080, height=2520, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-AS62, width=1080,
      height=2520, dpi=420, isGoogleDevice=false).code */
      val XQ_AS62 = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=XQ-AS72, width=1080, height=2520, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-AS72, width=1080,
      height=2520, dpi=420, isGoogleDevice=false).code */
      val XQ_AS72 = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=XQ-AT42, width=1096, height=2560, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-AT42, width=1096,
      height=2560, dpi=420, isGoogleDevice=false).code */
      val XQ_AT42 = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=XQ-AT51, width=1096, height=2560, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-AT51, width=1096,
      height=2560, dpi=420, isGoogleDevice=false).code */
      val XQ_AT51 = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=XQ-AT52, width=1096, height=2560, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-AT52, width=1096,
      height=2560, dpi=420, isGoogleDevice=false).code */
      val XQ_AT52 = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=XQ-AT72, width=1096, height=2560, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-AT72, width=1096,
      height=2560, dpi=420, isGoogleDevice=false).code */
      val XQ_AT72 = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=XQ-AU42, width=1080, height=2520, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-AU42, width=1080,
      height=2520, dpi=420, isGoogleDevice=false).code */
      val XQ_AU42 = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=XQ-AU51, width=1080, height=2520, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-AU51, width=1080,
      height=2520, dpi=420, isGoogleDevice=false).code */
      val XQ_AU51 = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=XQ-AU52, width=1080, height=2520, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-AU52, width=1080,
      height=2520, dpi=420, isGoogleDevice=false).code */
      val XQ_AU52 = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=XQ-BC42, width=1096, height=2560, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-BC42, width=1096,
      height=2560, dpi=420, isGoogleDevice=false).code */
      val XQ_BC42 = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=XQ-BC52, width=1096, height=2560, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-BC52, width=1096,
      height=2560, dpi=420, isGoogleDevice=false).code */
      val XQ_BC52 = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=XQ-BC62, width=1096, height=2560, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-BC62, width=1096,
      height=2560, dpi=420, isGoogleDevice=false).code */
      val XQ_BC62 = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=XQ-BC72, width=1096, height=2560, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-BC72, width=1096,
      height=2560, dpi=420, isGoogleDevice=false).code */
      val XQ_BC72 = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=XQ-BE42, width=1096, height=2560, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-BE42, width=1096,
      height=2560, dpi=420, isGoogleDevice=false).code */
      val XQ_BE42 = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=XQ-BE52, width=1096, height=2560, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-BE52, width=1096,
      height=2560, dpi=420, isGoogleDevice=false).code */
      val XQ_BE52 = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=XQ-BE62, width=1096, height=2560, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-BE62, width=1096,
      height=2560, dpi=420, isGoogleDevice=false).code */
      val XQ_BE62 = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=XQ-BE72, width=1096, height=2560, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-BE72, width=1096,
      height=2560, dpi=420, isGoogleDevice=false).code */
      val XQ_BE72 = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=XQ-BQ42, width=1080, height=2520, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-BQ42, width=1080,
      height=2520, dpi=420, isGoogleDevice=false).code */
      val XQ_BQ42 = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=XQ-BQ52, width=1080, height=2520, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-BQ52, width=1080,
      height=2520, dpi=420, isGoogleDevice=false).code */
      val XQ_BQ52 = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=XQ-BQ62, width=1080, height=2520, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-BQ62, width=1080,
      height=2520, dpi=420, isGoogleDevice=false).code */
      val XQ_BQ62 = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=XQ-BQ72, width=1080, height=2520, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-BQ72, width=1080,
      height=2520, dpi=420, isGoogleDevice=false).code */
      val XQ_BQ72 = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=XQ-BT44, width=1080, height=2520, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-BT44, width=1080,
      height=2520, dpi=420, isGoogleDevice=false).code */
      val XQ_BT44 = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=XQ-BT52, width=1080, height=2520, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-BT52, width=1080,
      height=2520, dpi=420, isGoogleDevice=false).code */
      val XQ_BT52 = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=XQ-CC44, width=1080, height=2520, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-CC44, width=1080,
      height=2520, dpi=420, isGoogleDevice=false).code */
      val XQ_CC44 = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=XQ-CC54, width=1080, height=2520, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-CC54, width=1080,
      height=2520, dpi=420, isGoogleDevice=false).code */
      val XQ_CC54 = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=XQ-CC72, width=1080, height=2520, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-CC72, width=1080,
      height=2520, dpi=420, isGoogleDevice=false).code */
      val XQ_CC72 = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=XQ-CQ44, width=1080, height=2520, dpi=450,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-CQ44, width=1080,
      height=2520, dpi=450, isGoogleDevice=false).code */
      val XQ_CQ44 = "spec:width=1080,height=2520,unit=px,dpi=450"

      /** DeviceSpec(manufacturer=Sony, code=XQ-CQ54, width=1080, height=2520, dpi=450,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-CQ54, width=1080,
      height=2520, dpi=450, isGoogleDevice=false).code */
      val XQ_CQ54 = "spec:width=1080,height=2520,unit=px,dpi=450"

      /** DeviceSpec(manufacturer=Sony, code=XQ-CQ62, width=1080, height=2520, dpi=450,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-CQ62, width=1080,
      height=2520, dpi=450, isGoogleDevice=false).code */
      val XQ_CQ62 = "spec:width=1080,height=2520,unit=px,dpi=450"

      /** DeviceSpec(manufacturer=Sony, code=XQ-CQ72, width=1080, height=2520, dpi=450,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-CQ72, width=1080,
      height=2520, dpi=450, isGoogleDevice=false).code */
      val XQ_CQ72 = "spec:width=1080,height=2520,unit=px,dpi=450"

      /** DeviceSpec(manufacturer=Sony, code=XQ-CT44, width=1096, height=2560, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-CT44, width=1096,
      height=2560, dpi=420, isGoogleDevice=false).code */
      val XQ_CT44 = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=XQ-CT54, width=1096, height=2560, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-CT54, width=1096,
      height=2560, dpi=420, isGoogleDevice=false).code */
      val XQ_CT54 = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=XQ-CT62, width=1096, height=2560, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-CT62, width=1096,
      height=2560, dpi=420, isGoogleDevice=false).code */
      val XQ_CT62 = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=XQ-CT72, width=1096, height=2560, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-CT72, width=1096,
      height=2560, dpi=420, isGoogleDevice=false).code */
      val XQ_CT72 = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=XQ-DC44, width=1080, height=2520, dpi=450,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-DC44, width=1080,
      height=2520, dpi=450, isGoogleDevice=false).code */
      val XQ_DC44 = "spec:width=1080,height=2520,unit=px,dpi=450"

      /** DeviceSpec(manufacturer=Sony, code=XQ-DC54, width=1080, height=2520, dpi=450,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-DC54, width=1080,
      height=2520, dpi=450, isGoogleDevice=false).code */
      val XQ_DC54 = "spec:width=1080,height=2520,unit=px,dpi=450"

      /** DeviceSpec(manufacturer=Sony, code=XQ-DC72, width=1080, height=2520, dpi=450,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-DC72, width=1080,
      height=2520, dpi=450, isGoogleDevice=false).code */
      val XQ_DC72 = "spec:width=1080,height=2520,unit=px,dpi=450"

      /** DeviceSpec(manufacturer=Sony, code=XQ-DE44, width=1080, height=2520, dpi=450,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-DE44, width=1080,
      height=2520, dpi=450, isGoogleDevice=false).code */
      val XQ_DE44 = "spec:width=1080,height=2520,unit=px,dpi=450"

      /** DeviceSpec(manufacturer=Sony, code=XQ-DE54, width=1080, height=2520, dpi=450,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-DE54, width=1080,
      height=2520, dpi=450, isGoogleDevice=false).code */
      val XQ_DE54 = "spec:width=1080,height=2520,unit=px,dpi=450"

      /** DeviceSpec(manufacturer=Sony, code=XQ-DE72, width=1080, height=2520, dpi=450,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-DE72, width=1080,
      height=2520, dpi=450, isGoogleDevice=false).code */
      val XQ_DE72 = "spec:width=1080,height=2520,unit=px,dpi=450"

      /** DeviceSpec(manufacturer=Sony, code=XQ-DQ44, width=1096, height=2560, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-DQ44, width=1096,
      height=2560, dpi=420, isGoogleDevice=false).code */
      val XQ_DQ44 = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=XQ-DQ54, width=1096, height=2560, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-DQ54, width=1096,
      height=2560, dpi=420, isGoogleDevice=false).code */
      val XQ_DQ54 = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=XQ-DQ62, width=1096, height=2560, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-DQ62, width=1096,
      height=2560, dpi=420, isGoogleDevice=false).code */
      val XQ_DQ62 = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=XQ-DQ72, width=1096, height=2560, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-DQ72, width=1096,
      height=2560, dpi=420, isGoogleDevice=false).code */
      val XQ_DQ72 = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=XQ-EC44, width=1080, height=2340, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-EC44, width=1080,
      height=2340, dpi=400, isGoogleDevice=false).code */
      val XQ_EC44 = "spec:width=1080,height=2340,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=Sony, code=XQ-EC54, width=1080, height=2340, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-EC54, width=1080,
      height=2340, dpi=400, isGoogleDevice=false).code */
      val XQ_EC54 = "spec:width=1080,height=2340,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=Sony, code=XQ-EC72, width=1080, height=2340, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-EC72, width=1080,
      height=2340, dpi=400, isGoogleDevice=false).code */
      val XQ_EC72 = "spec:width=1080,height=2340,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=Sony, code=XQ-ES44, width=1080, height=2520, dpi=450,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-ES44, width=1080,
      height=2520, dpi=450, isGoogleDevice=false).code */
      val XQ_ES44 = "spec:width=1080,height=2520,unit=px,dpi=450"

      /** DeviceSpec(manufacturer=Sony, code=XQ-ES54, width=1080, height=2520, dpi=450,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-ES54, width=1080,
      height=2520, dpi=450, isGoogleDevice=false).code */
      val XQ_ES54 = "spec:width=1080,height=2520,unit=px,dpi=450"

      /** DeviceSpec(manufacturer=Sony, code=XQ-ES72, width=1080, height=2520, dpi=450,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-ES72, width=1080,
      height=2520, dpi=450, isGoogleDevice=false).code */
      val XQ_ES72 = "spec:width=1080,height=2520,unit=px,dpi=450"

      /** DeviceSpec(manufacturer=Sony, code=XQ-FS, width=1080, height=2340, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=XQ-FS, width=1080,
      height=2340, dpi=400, isGoogleDevice=false).code */
      val XQ_FS = "spec:width=1080,height=2340,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=Sony, code=402SO, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=402SO, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val _402SO = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=501SO, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=501SO, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val _501SO = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=502SO, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=502SO, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val _502SO = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=601SO, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=601SO, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val _601SO = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=602SO, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=602SO, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val _602SO = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=701SO, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=701SO, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val _701SO = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=702SO, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=702SO, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val _702SO = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sony, code=801SO, width=1440, height=2880, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=801SO, width=1440,
      height=2880, dpi=560, isGoogleDevice=false).code */
      val _801SO = "spec:width=1440,height=2880,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=Sony, code=802SO, width=1096, height=2560, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=802SO, width=1096,
      height=2560, dpi=420, isGoogleDevice=false).code */
      val _802SO = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=901SO, width=1080, height=2520, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=901SO, width=1080,
      height=2520, dpi=420, isGoogleDevice=false).code */
      val _901SO = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Sony, code=902SO, width=1080, height=2520, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sony, code=902SO, width=1080,
      height=2520, dpi=420, isGoogleDevice=false).code */
      val _902SO = "spec:width=1080,height=2520,unit=px,dpi=420"

  }
