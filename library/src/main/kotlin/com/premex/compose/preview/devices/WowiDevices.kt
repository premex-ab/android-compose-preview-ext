package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * wowi device specifications for Android Compose previews.
 *
 * This extension provides wowi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Wowi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Wowi: Any
  get() = object {
      /** wowi SQ788Extreme */
      val SQ788EXTREME = "spec:width=480,height=854,unit=px,dpi=240"

  }
