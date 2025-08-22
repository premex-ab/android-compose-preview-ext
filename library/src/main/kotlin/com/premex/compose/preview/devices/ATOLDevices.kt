package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ATOL device specifications for Android Compose previews.
 *
 * This extension provides ATOL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ATOL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ATOL: Any
  get() = object {
      /** ATOL t150 */
      val T150 = "spec:width=480,height=800,unit=px,dpi=240"

      /** ATOL t50p */
      val T50P = "spec:width=480,height=800,unit=px,dpi=240"

  }
