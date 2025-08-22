package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * koobee device specifications for Android Compose previews.
 *
 * This extension provides koobee device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Koobee.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Koobee: Any
  get() = object {
      /** DeviceSpec(manufacturer=koobee, code=koobee_F2, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=koobee, code=koobee_F2, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val KOOBEE_F2 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=koobee, code=koobee_F2_Plus, width=1080, height=2246, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=koobee, code=koobee_F2_Plus,
      width=1080, height=2246, dpi=480, isGoogleDevice=false).code */
      val KOOBEE_F2_PLUS = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=koobee, code=koobee_K10, width=720, height=1500, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=koobee, code=koobee_K10, width=720,
      height=1500, dpi=320, isGoogleDevice=false).code */
      val KOOBEE_K10 = "spec:width=720,height=1500,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=koobee, code=koobee_K20, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=koobee, code=koobee_K20, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val KOOBEE_K20 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=koobee, code=koobee_S12, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=koobee, code=koobee_S12, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val KOOBEE_S12 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=koobee, code=koobee_S16, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=koobee, code=koobee_S16, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val KOOBEE_S16 = "spec:width=720,height=1560,unit=px,dpi=320"

  }
