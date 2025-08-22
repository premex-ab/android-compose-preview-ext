package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Gtel device specifications for Android Compose previews.
 *
 * This extension provides Gtel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Gtel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Gtel: Any
  get() = object {
      /** DeviceSpec(manufacturer=Gtel, code=A737_XploraZ, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gtel, code=A737_XploraZ, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val A737_XPLORAZ = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Gtel, code=Gtel_Delta_16, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gtel, code=Gtel_Delta_16,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val GTEL_DELTA_16 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Gtel, code=Gtel_Infinity_8s, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gtel, code=Gtel_Infinity_8s,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val GTEL_INFINITY_8S = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Gtel, code=Gtel_Infinity_9, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gtel, code=Gtel_Infinity_9,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val GTEL_INFINITY_9 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Gtel, code=Gtel_Infinity_X, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gtel, code=Gtel_Infinity_X,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val GTEL_INFINITY_X = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Gtel, code=Gtel_X5, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gtel, code=Gtel_X5, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val GTEL_X5 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Gtel, code=Gtel_X5plus, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gtel, code=Gtel_X5plus, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val GTEL_X5PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Gtel, code=Gtel_X6mini, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gtel, code=Gtel_X6mini, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val GTEL_X6MINI = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Gtel, code=Gtel_X6plus, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gtel, code=Gtel_X6plus, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val GTEL_X6PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Gtel, code=Gtel_X6pro, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gtel, code=Gtel_X6pro, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val GTEL_X6PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Gtel, code=Gtel_X6s, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gtel, code=Gtel_X6s, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val GTEL_X6S = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Gtel, code=Gtel_X7plus, width=1080, height=2246, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gtel, code=Gtel_X7plus, width=1080,
      height=2246, dpi=480, isGoogleDevice=false).code */
      val GTEL_X7PLUS = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Gtel, code=Gtel_X7pro, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gtel, code=Gtel_X7pro, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val GTEL_X7PRO = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Gtel, code=Gtel_X7s, width=720, height=1500, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gtel, code=Gtel_X7s, width=720,
      height=1500, dpi=320, isGoogleDevice=false).code */
      val GTEL_X7S = "spec:width=720,height=1500,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Gtel, code=Infinity7Plus, width=720, height=1528, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gtel, code=Infinity7Plus,
      width=720, height=1528, dpi=280, isGoogleDevice=false).code */
      val INFINITY7PLUS = "spec:width=720,height=1528,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Gtel, code=Infinity7Pro, width=720, height=1528, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gtel, code=Infinity7Pro, width=720,
      height=1528, dpi=280, isGoogleDevice=false).code */
      val INFINITY7PRO = "spec:width=720,height=1528,unit=px,dpi=280"

  }
