package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FLNET device specifications for Android Compose previews.
 *
 * This extension provides FLNET device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FLNET.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FLNET: Any
  get() = object {
      /** FLNET ba101 */
      val BA101 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** FLNET ba201 */
      val BA201 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
