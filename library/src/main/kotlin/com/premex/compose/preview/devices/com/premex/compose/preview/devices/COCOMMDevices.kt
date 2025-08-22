package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * COCOMM device specifications for Android Compose previews.
 *
 * This extension provides COCOMM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.COCOMM.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.COCOMM: Any
  get() = object {
      /** DeviceSpec(manufacturer=COCOMM, code=F900N0101, width=600, height=1024, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COCOMM, code=F900N0101, width=600,
      height=1024, dpi=240, isGoogleDevice=false).code */
      val F900N0101 = "spec:width=600,height=1024,unit=px,dpi=240"

  }
