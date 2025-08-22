package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TCST device specifications for Android Compose previews.
 *
 * This extension provides TCST device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TCST.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TCST: Any
  get() = object {
      /** TCST L7 */
      val L7 = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
