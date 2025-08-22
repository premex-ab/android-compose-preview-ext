package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ZAITH device specifications for Android Compose previews.
 *
 * This extension provides ZAITH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Zaith.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Zaith: Any
  get() = object {
      /** ZAITH Z3211G */
      val Z3211G = "spec:width=800,height=1280,unit=px,dpi=160"

  }
