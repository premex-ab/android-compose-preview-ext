package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HELLCAT device specifications for Android Compose previews.
 *
 * This extension provides HELLCAT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hellcat.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hellcat: Any
  get() = object {
      /** HELLCAT TAB10_1 */
      val TAB10_1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** HELLCAT TAB8-1 */
      val TAB8_1 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
