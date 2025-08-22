package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * A1_Smart_Box device specifications for Android Compose previews.
 *
 * This extension provides A1_Smart_Box device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.A1SmartBox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.A1SmartBox: Any
  get() = object {
      /** DeviceSpec(manufacturer=A1_Smart_Box, code=A1_B866V2F02, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=A1_Smart_Box, code=A1_B866V2F02,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val A1_B866V2F02 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
