package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FiestaDuo device specifications for Android Compose previews.
 *
 * This extension provides FiestaDuo device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FiestaDuo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FiestaDuo: Any
  get() = object {
      /** DeviceSpec(manufacturer=FiestaDuo, code=iX, width=720, height=1498, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FiestaDuo, code=iX, width=720,
      height=1498, dpi=320, isGoogleDevice=false).code */
      val IX = "spec:width=720,height=1498,unit=px,dpi=320"

  }
