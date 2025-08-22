package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AFRICELL device specifications for Android Compose previews.
 *
 * This extension provides AFRICELL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AFRICELL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AFRICELL: Any
  get() = object {
      /** DeviceSpec(manufacturer=AFRICELL, code=S10, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AFRICELL, code=S10, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val S10 = "spec:width=480,height=960,unit=px,dpi=200"

  }
