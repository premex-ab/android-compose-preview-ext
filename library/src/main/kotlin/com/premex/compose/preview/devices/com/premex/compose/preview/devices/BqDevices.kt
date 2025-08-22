package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * bq device specifications for Android Compose previews.
 *
 * This extension provides bq device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bq.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bq: Any
  get() = object {
      /** DeviceSpec(manufacturer=bq, code=Aquaris_A45_sprout, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=bq, code=Aquaris_A45_sprout,
      width=540, height=960, dpi=240, isGoogleDevice=false).code */
      val AQUARIS_A45_SPROUT = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=bq, code=Aquaris_E10, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=bq, code=Aquaris_E10, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val AQUARIS_E10 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=bq, code=Aquaris_E10_3G, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=bq, code=Aquaris_E10_3G,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val AQUARIS_E10_3G = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=bq, code=Aquaris_E4, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=bq, code=Aquaris_E4, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val AQUARIS_E4 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=bq, code=Aquaris_E45, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=bq, code=Aquaris_E45, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val AQUARIS_E45 = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=bq, code=Aquaris_E5, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=bq, code=Aquaris_E5, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val AQUARIS_E5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=bq, code=Aquaris_E5_HD, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=bq, code=Aquaris_E5_HD, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val AQUARIS_E5_HD = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=bq, code=Aquaris_M10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=bq, code=Aquaris_M10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val AQUARIS_M10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=bq, code=Aquaris_M10_FHD, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=bq, code=Aquaris_M10_FHD,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val AQUARIS_M10_FHD = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=bq, code=Aquaris_M45, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=bq, code=Aquaris_M45, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val AQUARIS_M45 = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=bq, code=Aquaris_M5, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=bq, code=Aquaris_M5, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val AQUARIS_M5 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=bq, code=Aquaris_M55, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=bq, code=Aquaris_M55, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val AQUARIS_M55 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=bq, code=Aquaris_M8, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=bq, code=Aquaris_M8, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val AQUARIS_M8 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=bq, code=Aquaris_X5, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=bq, code=Aquaris_X5, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val AQUARIS_X5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=bq, code=Aquaris_X5_Plus, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=bq, code=Aquaris_X5_Plus,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val AQUARIS_X5_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=bq, code=bardock, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=bq, code=bardock, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val BARDOCK = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=bq, code=bardock-pro, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=bq, code=bardock-pro, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val BARDOCK_PRO = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=bq, code=chaozu, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=bq, code=chaozu, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val CHAOZU = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=bq, code=chaozulite, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=bq, code=chaozulite, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val CHAOZULITE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=bq, code=Edison_3, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=bq, code=Edison_3, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val EDISON_3 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=bq, code=Edison_3_3G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=bq, code=Edison_3_3G, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val EDISON_3_3G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=bq, code=Edison_3_mini, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=bq, code=Edison_3_mini, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val EDISON_3_MINI = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=bq, code=FREEZERLTE, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=bq, code=FREEZERLTE, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val FREEZERLTE = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=bq, code=jeice, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=bq, code=jeice, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val JEICE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=bq, code=nappa, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=bq, code=nappa, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val NAPPA = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=bq, code=nappa_s, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=bq, code=nappa_s, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val NAPPA_S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=bq, code=raditz, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=bq, code=raditz, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val RADITZ = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=bq, code=raditz_s, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=bq, code=raditz_s, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val RADITZ_S = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=bq, code=tenshi, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=bq, code=tenshi, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val TENSHI = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=bq, code=yamcha, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=bq, code=yamcha, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val YAMCHA = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=bq, code=yamchalite, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=bq, code=yamchalite, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val YAMCHALITE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=bq, code=zangyapro_sprout, width=1080, height=2160, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=bq, code=zangyapro_sprout,
      width=1080, height=2160, dpi=420, isGoogleDevice=false).code */
      val ZANGYAPRO_SPROUT = "spec:width=1080,height=2160,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=bq, code=zangya_sprout, width=1080, height=2160, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=bq, code=zangya_sprout, width=1080,
      height=2160, dpi=420, isGoogleDevice=false).code */
      val ZANGYA_SPROUT = "spec:width=1080,height=2160,unit=px,dpi=420"

  }
