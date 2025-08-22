package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Neffos device specifications for Android Compose previews.
 *
 * This extension provides Neffos device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Neffos.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Neffos: Any
  get() = object {
      /** DeviceSpec(manufacturer=Neffos, code=A5, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Neffos, code=A5, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val A5 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Neffos, code=C5, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Neffos, code=C5, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val C5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Neffos, code=C5a, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Neffos, code=C5a, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val C5A = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Neffos, code=C5s, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Neffos, code=C5s, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val C5S = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Neffos, code=C5_Max, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Neffos, code=C5_Max, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val C5_MAX = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Neffos, code=C5_Plus, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Neffos, code=C5_Plus, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val C5_PLUS = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Neffos, code=C7, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Neffos, code=C7, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val C7 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Neffos, code=C7A, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Neffos, code=C7A, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val C7A = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Neffos, code=C7s, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Neffos, code=C7s, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val C7S = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Neffos, code=C7_Lite, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Neffos, code=C7_Lite, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val C7_LITE = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Neffos, code=C9, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Neffos, code=C9, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val C9 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Neffos, code=C9A, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Neffos, code=C9A, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val C9A = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Neffos, code=C9s, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Neffos, code=C9s, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val C9S = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Neffos, code=C9_Max, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Neffos, code=C9_Max, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val C9_MAX = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Neffos, code=N1, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Neffos, code=N1, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val N1 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Neffos, code=X1, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Neffos, code=X1, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val X1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Neffos, code=X1_Lite, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Neffos, code=X1_Lite, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val X1_LITE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Neffos, code=X1_Max, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Neffos, code=X1_Max, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val X1_MAX = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Neffos, code=X20, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Neffos, code=X20, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val X20 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Neffos, code=X20_Pro, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Neffos, code=X20_Pro, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val X20_PRO = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Neffos, code=X9, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Neffos, code=X9, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val X9 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Neffos, code=Y5, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Neffos, code=Y5, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Y5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Neffos, code=Y50, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Neffos, code=Y50, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val Y50 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Neffos, code=Y5i, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Neffos, code=Y5i, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Y5I = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Neffos, code=Y5L, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Neffos, code=Y5L, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val Y5L = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Neffos, code=Y5s, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Neffos, code=Y5s, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Y5S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Neffos, code=Y5_Lite, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Neffos, code=Y5_Lite, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val Y5_LITE = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Neffos, code=Y6, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Neffos, code=Y6, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Y6 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Neffos, code=Y7, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Neffos, code=Y7, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Y7 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
