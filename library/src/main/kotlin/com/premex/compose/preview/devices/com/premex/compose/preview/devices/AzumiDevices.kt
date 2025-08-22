package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * azumi device specifications for Android Compose previews.
 *
 * This extension provides azumi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Azumi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Azumi: Any
  get() = object {
      /** DeviceSpec(manufacturer=azumi, code=A50LT, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=azumi, code=A50LT, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val A50LT = "spec:width=480,height=854,unit=px,dpi=240"

  }
