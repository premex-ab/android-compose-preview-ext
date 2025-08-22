package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * IMUZ device specifications for Android Compose previews.
 *
 * This extension provides IMUZ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Imuz.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Imuz: Any
  get() = object {
      /** IMUZ G10 */
      val G10 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** IMUZ RA10 */
      val RA10 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
