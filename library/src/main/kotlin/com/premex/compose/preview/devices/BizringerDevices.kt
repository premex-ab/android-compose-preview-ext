package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Bizringer device specifications for Android Compose previews.
 *
 * This extension provides Bizringer device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bizringer.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bizringer: Any
  get() = object {
      /** Bizringer 8BIZ18 */
      val _8BIZ18 = "spec:width=800,height=1280,unit=px,dpi=240"

  }
