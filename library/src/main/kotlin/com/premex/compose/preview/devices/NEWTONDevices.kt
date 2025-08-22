package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NEWTON device specifications for Android Compose previews.
 *
 * This extension provides NEWTON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NEWTON.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NEWTON: Any
  get() = object {
      /** NEWTON H1 */
      val H1 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
