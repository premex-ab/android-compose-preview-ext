package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * vernee device specifications for Android Compose previews.
 *
 * This extension provides vernee device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vernee.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vernee: Any
  get() = object {
      /** DeviceSpec(manufacturer=vernee, code=M2, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vernee, code=M2, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val M2 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vernee, code=M2_PRO, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vernee, code=M2_PRO, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val M2_PRO = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vernee, code=M3, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vernee, code=M3, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val M3 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vernee, code=M6, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vernee, code=M6, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val M6 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vernee, code=M7_EEA, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vernee, code=M7_EEA, width=600,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val M7_EEA = "spec:width=600,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=vernee, code=M8_Pro, width=1080, height=2246, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vernee, code=M8_Pro, width=1080,
      height=2246, dpi=480, isGoogleDevice=false).code */
      val M8_PRO = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vernee, code=T3_Pro, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vernee, code=T3_Pro, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val T3_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vernee, code=Thor_E, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vernee, code=Thor_E, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val THOR_E = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vernee, code=Thor_Plus, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vernee, code=Thor_Plus, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val THOR_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vernee, code=V1, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vernee, code=V1, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val V1 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vernee, code=V2_Pro, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vernee, code=V2_Pro, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val V2_PRO = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=vernee, code=vernee_M5, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vernee, code=vernee_M5, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val VERNEE_M5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vernee, code=X1, width=1080, height=2160, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vernee, code=X1, width=1080,
      height=2160, dpi=400, isGoogleDevice=false).code */
      val X1 = "spec:width=1080,height=2160,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=vernee, code=X1_PRO, width=1080, height=2160, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vernee, code=X1_PRO, width=1080,
      height=2160, dpi=400, isGoogleDevice=false).code */
      val X1_PRO = "spec:width=1080,height=2160,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=vernee, code=X2_euro, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vernee, code=X2_euro, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val X2_EURO = "spec:width=720,height=1440,unit=px,dpi=320"

  }
