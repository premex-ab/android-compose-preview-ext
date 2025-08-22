package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MINDEO device specifications for Android Compose previews.
 *
 * This extension provides MINDEO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MINDEO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MINDEO: Any
  get() = object {
      /** DeviceSpec(manufacturer=MINDEO, code=MS8389, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MINDEO, code=MS8389, width=1200,
      height=2000, dpi=320, isGoogleDevice=false).code */
      val MS8389 = "spec:width=1200,height=2000,unit=px,dpi=320"

  }
