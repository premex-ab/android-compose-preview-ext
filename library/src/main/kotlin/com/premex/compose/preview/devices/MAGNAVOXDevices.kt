package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MAGNAVOX device specifications for Android Compose previews.
 *
 * This extension provides MAGNAVOX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MAGNAVOX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MAGNAVOX: Any
  get() = object {
      /** MAGNAVOX MMP848 */
      val MMP848 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
