package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LUMIO device specifications for Android Compose previews.
 *
 * This extension provides LUMIO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Lumio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Lumio: Any
  get() = object {
      /** LUMIO khardi */
      val KHARDI = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
