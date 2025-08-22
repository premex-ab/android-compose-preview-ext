package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BLUEDIGIT device specifications for Android Compose previews.
 *
 * This extension provides BLUEDIGIT device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BLUEDIGIT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BLUEDIGIT: Any
  get() = object {
      /** DeviceSpec(manufacturer=BLUEDIGIT, code=RAVOZ_R4, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLUEDIGIT, code=RAVOZ_R4,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val RAVOZ_R4 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLUEDIGIT, code=RAVOZ_R7, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLUEDIGIT, code=RAVOZ_R7,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val RAVOZ_R7 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLUEDIGIT, code=RAVOZ_R8, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLUEDIGIT, code=RAVOZ_R8,
      width=1080, height=2160, dpi=480, isGoogleDevice=false).code */
      val RAVOZ_R8 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BLUEDIGIT, code=RAVOZ_R9, width=1080, height=2246, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLUEDIGIT, code=RAVOZ_R9,
      width=1080, height=2246, dpi=480, isGoogleDevice=false).code */
      val RAVOZ_R9 = "spec:width=1080,height=2246,unit=px,dpi=480"

  }
