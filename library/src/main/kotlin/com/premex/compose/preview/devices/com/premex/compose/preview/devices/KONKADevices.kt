package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KONKA device specifications for Android Compose previews.
 *
 * This extension provides KONKA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KONKA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KONKA: Any
  get() = object {
      /** DeviceSpec(manufacturer=KONKA, code=bandra, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KONKA, code=bandra, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val BANDRA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KONKA, code=capitolhill, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KONKA, code=capitolhill, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val CAPITOLHILL = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=KONKA, code=KC516, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KONKA, code=KC516, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val KC516 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KONKA, code=KC516_Pro, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KONKA, code=KC516_Pro, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val KC516_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KONKA, code=kenton, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KONKA, code=kenton, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KENTON = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KONKA, code=keoneae, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KONKA, code=keoneae, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KEONEAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KONKA, code=KM7012BK, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KONKA, code=KM7012BK, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val KM7012BK = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=KONKA, code=lasalle, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KONKA, code=lasalle, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val LASALLE = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=KONKA, code=M27S, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KONKA, code=M27S, width=1080,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val M27S = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KONKA, code=N15, width=540, height=1200, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KONKA, code=N15, width=540,
      height=1200, dpi=240, isGoogleDevice=false).code */
      val N15 = "spec:width=540,height=1200,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KONKA, code=N17, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KONKA, code=N17, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val N17 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KONKA, code=N7, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KONKA, code=N7, width=600,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val N7 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KONKA, code=RE1, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KONKA, code=RE1, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val RE1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KONKA, code=RU1, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KONKA, code=RU1, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val RU1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KONKA, code=SE1, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KONKA, code=SE1, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val SE1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KONKA, code=SE2, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KONKA, code=SE2, width=600,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val SE2 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KONKA, code=seocho, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KONKA, code=seocho, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SEOCHO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KONKA, code=SP10, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KONKA, code=SP10, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val SP10 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KONKA, code=SP20, width=444, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KONKA, code=SP20, width=444,
      height=960, dpi=240, isGoogleDevice=false).code */
      val SP20 = "spec:width=444,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KONKA, code=SP6, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KONKA, code=SP6, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val SP6 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KONKA, code=SP9, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KONKA, code=SP9, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val SP9 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KONKA, code=sugamo, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KONKA, code=sugamo, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SUGAMO = "spec:width=720,height=1280,unit=px,dpi=213"

  }
