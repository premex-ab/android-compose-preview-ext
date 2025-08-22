package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Infinix device specifications for Android Compose previews.
 *
 * This extension provides Infinix device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Infinix.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Infinix: Any
  get() = object {
      /** DeviceSpec(manufacturer=Infinix, code=barking, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=barking, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val BARKING = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=beaudry, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=beaudry, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val BEAUDRY = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Infinix, code=ikebukuro, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=ikebukuro, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val IKEBUKURO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-PR652B, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-PR652B,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val INFINIX_PR652B = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-PR652C, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-PR652C,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val INFINIX_PR652C = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X1101, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X1101,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val INFINIX_X1101 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X1101B, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X1101B,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val INFINIX_X1101B = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X1102, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X1102,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val INFINIX_X1102 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X5010, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X5010,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X5010 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix_X509, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix_X509,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X509 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix_X510_sprout, width=720, height=1280,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix,
      code=Infinix_X510_sprout, width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X510_SPROUT = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X521, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X521,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X521 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X521-Pro, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X521-Pro,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X521_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X522, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X522,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X522 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X5511, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X5511,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X5511 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X5511-13M, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X5511-13M,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X5511_13M = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X5514, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X5514,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X5514 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X5515, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X5515,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X5515 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X5515F, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X5515F,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X5515F = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X5515I, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X5515I,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X5515I = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X5516, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X5516,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X5516 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X5516B, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X5516B,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X5516B = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X5516C, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X5516C,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X5516C = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=INFINIX-X552, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=INFINIX-X552,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X552 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=INFINIX-X552-95M, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=INFINIX-X552-95M,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X552_95M = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X559, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X559,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X559 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X559C, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X559C,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X559C = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X571, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X571,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X571 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X572, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X572,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X572 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X573, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X573,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X573 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X573B, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X573B,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X573B = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=INFINIX-X600-5M, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=INFINIX-X600-5M,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X600_5M = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=INFINIX-X600-H533-5M, width=720, height=1280,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix,
      code=INFINIX-X600-H533-5M, width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X600_H533_5M = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X603, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X603,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X603 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X604_sprout, width=1080, height=2160,
      dpi=480, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix,
      code=Infinix-X604_sprout, width=1080, height=2160, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X604_SPROUT = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X605_sprout, width=1080, height=2160,
      dpi=480, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix,
      code=Infinix-X605_sprout, width=1080, height=2160, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X605_SPROUT = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X606, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X606,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X606 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X606B, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X606B,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X606B = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X606C, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X606C,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X606C = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X606D, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X606D,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X606D = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X608, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X608,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X608 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X609, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X609,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X609 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X609B, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X609B,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X609B = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X610, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X610,
      width=1080, height=2160, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X610 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X612, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X612,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X612 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X612B, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X612B,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X612B = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X620, width=1080, height=2260, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X620,
      width=1080, height=2260, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X620 = "spec:width=1080,height=2260,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X622, width=720, height=1500, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X622,
      width=720, height=1500, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X622 = "spec:width=720,height=1500,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X623, width=720, height=1500, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X623,
      width=720, height=1500, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X623 = "spec:width=720,height=1500,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X624, width=720, height=1500, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X624,
      width=720, height=1500, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X624 = "spec:width=720,height=1500,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X624B, width=720, height=1500, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X624B,
      width=720, height=1500, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X624B = "spec:width=720,height=1500,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X625, width=720, height=1500, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X625,
      width=720, height=1500, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X625 = "spec:width=720,height=1500,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X625C, width=720, height=1500, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X625C,
      width=720, height=1500, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X625C = "spec:width=720,height=1500,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X625D, width=720, height=1500, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X625D,
      width=720, height=1500, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X625D = "spec:width=720,height=1500,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X626, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X626,
      width=720, height=1520, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X626 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X626B, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X626B,
      width=720, height=1520, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X626B = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X626B-LTE, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X626B-LTE,
      width=720, height=1520, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X626B_LTE = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X627STU, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X627STU,
      width=720, height=1520, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X627STU = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X627V, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X627V,
      width=720, height=1520, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X627V = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X650, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X650,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X650 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X650B, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X650B,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X650B = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X650C, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X650C,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X650C = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X650D, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X650D,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X650D = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6511, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6511,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X6511 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6511B, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6511B,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X6511B = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6511E, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6511E,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X6511E = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6511G, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6511G,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X6511G = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6512, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6512,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X6512 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6515, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6515,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X6515 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6516, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6516,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X6516 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6517, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6517,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X6517 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X652, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X652,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X652 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6525, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6525,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X6525 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6525B, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6525B,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X6525B = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6525D, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6525D,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X6525D = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6526, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6526,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X6526 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6528, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6528,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X6528 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6528B, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6528B,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X6528B = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X652A, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X652A,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X652A = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X652B, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X652B,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X652B = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X652C, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X652C,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X652C = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X653, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X653,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X653 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6531, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6531,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X6531 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6531B, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6531B,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X6531B = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6532, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6532,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X6532 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6532C, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6532C,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X6532C = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X653C, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X653C,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X653C = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X655, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X655,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X655 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X655C, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X655C,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X655C = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X655D, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X655D,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X655D = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X655F, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X655F,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X655F = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X656, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X656,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X656 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X657, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X657,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X657 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X657B, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X657B,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X657B = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X657C, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X657C,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X657C = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X658B, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X658B,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X658B = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X658E, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X658E,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X658E = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X659, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X659,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X659 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X659B, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X659B,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X659B = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X660, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X660,
      width=1080, height=2340, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X660 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X660B, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X660B,
      width=1080, height=2340, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X660B = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X660C, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X660C,
      width=1080, height=2340, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X660C = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X662, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X662,
      width=1080, height=2408, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X662 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X662B, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X662B,
      width=1080, height=2408, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X662B = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X663, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X663,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X663 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X663B, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X663B,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X663B = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X663C, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X663C,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X663C = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X665, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X665,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X665 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X665B, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X665B,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X665B = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X665C, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X665C,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X665C = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X665E, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X665E,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X665E = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X666, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X666,
      width=1080, height=2408, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X666 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X668, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X668,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X668 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X668C, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X668C,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X668C = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X669, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X669,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X669 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X669C, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X669C,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X669C = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X669D, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X669D,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X669D = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X670, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X670,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X670 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X671, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X671,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X671 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6710, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6710,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X6710 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6711, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6711,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X6711 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6716, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6716,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X6716 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6716B, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6716B,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X6716B = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X671B, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X671B,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X671B = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X672, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X672,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X672 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6720, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6720,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X6720 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6720B, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6720B,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X6720B = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6725, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6725,
      width=720, height=1600, dpi=280, isGoogleDevice=false).code */
      val INFINIX_X6725 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6725B, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6725B,
      width=720, height=1600, dpi=280, isGoogleDevice=false).code */
      val INFINIX_X6725B = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6725C, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6725C,
      width=720, height=1600, dpi=280, isGoogleDevice=false).code */
      val INFINIX_X6725C = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6725D, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6725D,
      width=720, height=1600, dpi=280, isGoogleDevice=false).code */
      val INFINIX_X6725D = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6728, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6728,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X6728 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6731, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6731,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X6731 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6731B, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6731B,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X6731B = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6739, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6739,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X6739 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X675, width=1080, height=2400, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X675,
      width=1080, height=2400, dpi=400, isGoogleDevice=false).code */
      val INFINIX_X675 = "spec:width=1080,height=2400,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X676B, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X676B,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X676B = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X676C, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X676C,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X676C = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X677, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X677,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X677 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X678B, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X678B,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X678B = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X680, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X680,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X680 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X680B, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X680B,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X680B = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X680C, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X680C,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X680C = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X680D, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X680D,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X680D = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X680F, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X680F,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X680F = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6810, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6810,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X6810 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6811, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6811,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X6811 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6811B, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6811B,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X6811B = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6812, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6812,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X6812 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6812B, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6812B,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X6812B = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6815, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6815,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X6815 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6815B, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6815B,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X6815B = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6815C, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6815C,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X6815C = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6815D, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6815D,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X6815D = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6816C, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6816C,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X6816C = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6816D, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6816D,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X6816D = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6817, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6817,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X6817 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6819, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6819,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X6819 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6820, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6820,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X6820 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6821, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6821,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X6821 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6823, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6823,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X6823 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6823C, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6823C,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X6823C = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6825, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6825,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X6825 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6826, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6826,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X6826 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6826B, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6826B,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X6826B = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6826C, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6826C,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X6826C = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6827, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6827,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X6827 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X682B, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X682B,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X682B = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X682C, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X682C,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X682C = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X683, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X683,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X683 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6832, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6832,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X6832 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6833B, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6833B,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X6833B = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6835, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6835,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X6835 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6835B, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6835B,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X6835B = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6836, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6836,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X6836 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6837, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6837,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X6837 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6838, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6838,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X6838 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X683B, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X683B,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X683B = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6850B, width=1080, height=2436, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6850B,
      width=1080, height=2436, dpi=440, isGoogleDevice=false).code */
      val INFINIX_X6850B = "spec:width=1080,height=2436,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6851, width=1080, height=2436, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6851,
      width=1080, height=2436, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X6851 = "spec:width=1080,height=2436,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6851B, width=1080, height=2436, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6851B,
      width=1080, height=2436, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X6851B = "spec:width=1080,height=2436,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6852, width=1080, height=2436, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6852,
      width=1080, height=2436, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X6852 = "spec:width=1080,height=2436,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6853, width=1080, height=2436, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6853,
      width=1080, height=2436, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X6853 = "spec:width=1080,height=2436,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6855, width=1080, height=2436, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6855,
      width=1080, height=2436, dpi=440, isGoogleDevice=false).code */
      val INFINIX_X6855 = "spec:width=1080,height=2436,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6856, width=1080, height=2436, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6856,
      width=1080, height=2436, dpi=440, isGoogleDevice=false).code */
      val INFINIX_X6856 = "spec:width=1080,height=2436,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6857, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6857,
      width=720, height=1600, dpi=280, isGoogleDevice=false).code */
      val INFINIX_X6857 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6857B, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6857B,
      width=720, height=1600, dpi=280, isGoogleDevice=false).code */
      val INFINIX_X6857B = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6858, width=1080, height=2436, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6858,
      width=1080, height=2436, dpi=440, isGoogleDevice=false).code */
      val INFINIX_X6858 = "spec:width=1080,height=2436,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6860, width=1080, height=2436, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6860,
      width=1080, height=2436, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X6860 = "spec:width=1080,height=2436,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6861, width=1080, height=2436, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6861,
      width=1080, height=2436, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X6861 = "spec:width=1080,height=2436,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X687, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X687,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X687 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6870, width=1080, height=2436, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6870,
      width=1080, height=2436, dpi=440, isGoogleDevice=false).code */
      val INFINIX_X6870 = "spec:width=1080,height=2436,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6871, width=1080, height=2436, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6871,
      width=1080, height=2436, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X6871 = "spec:width=1080,height=2436,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6873, width=1224, height=2720, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6873,
      width=1224, height=2720, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X6873 = "spec:width=1224,height=2720,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6876, width=1224, height=2720, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6876,
      width=1224, height=2720, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X6876 = "spec:width=1224,height=2720,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X687B, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X687B,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X687B = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6881, width=1080, height=2436, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6881,
      width=1080, height=2436, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X6881 = "spec:width=1080,height=2436,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6882, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6882,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X6882 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6882B, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6882B,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X6882B = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6885, width=1080, height=2400, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6885,
      width=1080, height=2400, dpi=420, isGoogleDevice=false).code */
      val INFINIX_X6885 = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6886, width=1080, height=2400, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6886,
      width=1080, height=2400, dpi=420, isGoogleDevice=false).code */
      val INFINIX_X6886 = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X688B, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X688B,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X688B = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X688C, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X688C,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X688C = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X689, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X689,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X689 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X689B, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X689B,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X689B = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X689C, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X689C,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X689C = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X689D, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X689D,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X689D = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X689F, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X689F,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X689F = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X690, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X690,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X690 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X690B, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X690B,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X690B = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X690C, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X690C,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X690C = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X692, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X692,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val INFINIX_X692 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X693, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X693,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X693 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X695, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X695,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X695 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X695C, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X695C,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X695C = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X695D, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X695D,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X695D = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X6962, width=1080, height=2640, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X6962,
      width=1080, height=2640, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X6962 = "spec:width=1080,height=2640,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X697, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X697,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X697 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=Infinix-X698, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=Infinix-X698,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val INFINIX_X698 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=longshan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=longshan, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=samseong, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=samseong, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SAMSEONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=X555, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=X555, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val X555 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=X556, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=X556, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val X556 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=X557, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=X557, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val X557 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=X557-Lite, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=X557-Lite, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val X557_LITE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Infinix, code=X601, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=X601, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val X601 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=X601-LTE, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=X601-LTE, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val X601_LTE = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Infinix, code=X602, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Infinix, code=X602, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val X602 = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
