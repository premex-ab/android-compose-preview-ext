package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Jambo_Technology device specifications for Android Compose previews.
 *
 * This extension provides Jambo_Technology device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.JamboTechnology.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.JamboTechnology: Any
  get() = object {
      /** DeviceSpec(manufacturer=Jambo_Technology, code=JP1, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Jambo_Technology, code=JP1,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val JP1 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Jambo_Technology, code=JP2, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Jambo_Technology, code=JP2,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val JP2 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
