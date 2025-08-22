package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Do device specifications for Android Compose previews.
 *
 * This extension provides Do device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Do.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Do: Any
  get() = object {
      /** Do Mate6_Pro */
      val MATE6_PRO = "spec:width=720,height=1612,unit=px,dpi=320"

  }
