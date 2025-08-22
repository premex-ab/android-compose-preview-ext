package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LEAGOO device specifications for Android Compose previews.
 *
 * This extension provides LEAGOO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LEAGOO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LEAGOO: Any
  get() = object {
      /** DeviceSpec(manufacturer=LEAGOO, code=KIICAA_MIX, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LEAGOO, code=KIICAA_MIX,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val KIICAA_MIX = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=LEAGOO, code=KIICAA_POWER, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LEAGOO, code=KIICAA_POWER,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val KIICAA_POWER = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LEAGOO, code=LeaPad_X, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LEAGOO, code=LeaPad_X, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val LEAPAD_X = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LEAGOO, code=M11, width=480, height=996, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LEAGOO, code=M11, width=480,
      height=996, dpi=240, isGoogleDevice=false).code */
      val M11 = "spec:width=480,height=996,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LEAGOO, code=M12, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LEAGOO, code=M12, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val M12 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LEAGOO, code=M12A, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LEAGOO, code=M12A, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val M12A = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LEAGOO, code=M13, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LEAGOO, code=M13, width=600,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val M13 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LEAGOO, code=M9, width=640, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LEAGOO, code=M9, width=640,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val M9 = "spec:width=640,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LEAGOO, code=M9_Pro, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LEAGOO, code=M9_Pro, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val M9_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LEAGOO, code=P1, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LEAGOO, code=P1, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LEAGOO, code=P1_Pro, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LEAGOO, code=P1_Pro, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P1_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LEAGOO, code=Power_2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LEAGOO, code=Power_2, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val POWER_2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LEAGOO, code=Power_2_Pro, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LEAGOO, code=Power_2_Pro,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val POWER_2_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LEAGOO, code=Power_5, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LEAGOO, code=Power_5, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val POWER_5 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=LEAGOO, code=S11, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LEAGOO, code=S11, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val S11 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LEAGOO, code=S8, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LEAGOO, code=S8, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val S8 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LEAGOO, code=S8Pro, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LEAGOO, code=S8Pro, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val S8PRO = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=LEAGOO, code=S9, width=720, height=1512, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LEAGOO, code=S9, width=720,
      height=1512, dpi=320, isGoogleDevice=false).code */
      val S9 = "spec:width=720,height=1512,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LEAGOO, code=T5, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LEAGOO, code=T5, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val T5 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=LEAGOO, code=T5c, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LEAGOO, code=T5c, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val T5C = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=LEAGOO, code=T8, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LEAGOO, code=T8, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val T8 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=LEAGOO, code=T8s, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LEAGOO, code=T8s, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val T8S = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=LEAGOO, code=XRover, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LEAGOO, code=XRover, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val XROVER = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LEAGOO, code=XRover_C, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LEAGOO, code=XRover_C, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val XROVER_C = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LEAGOO, code=Z10, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LEAGOO, code=Z10, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val Z10 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LEAGOO, code=Z9, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LEAGOO, code=Z9, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val Z9 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LEAGOO, code=Z9A, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LEAGOO, code=Z9A, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val Z9A = "spec:width=480,height=854,unit=px,dpi=240"

  }
