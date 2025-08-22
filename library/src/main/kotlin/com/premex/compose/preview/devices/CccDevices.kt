package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ccc device specifications for Android Compose previews.
 *
 * This extension provides ccc device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ccc.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ccc: Any
  get() = object {
      /** ccc ts302 */
      val TS302 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
