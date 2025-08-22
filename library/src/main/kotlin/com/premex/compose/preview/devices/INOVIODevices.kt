package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * INOVIO device specifications for Android Compose previews.
 *
 * This extension provides INOVIO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.INOVIO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.INOVIO: Any
  get() = object {
      /** INOVIO EVO_TAB7 */
      val EVO_TAB7 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
