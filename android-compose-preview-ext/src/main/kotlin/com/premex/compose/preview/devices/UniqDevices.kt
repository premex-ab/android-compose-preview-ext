package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * UNIQ device specifications for Android Compose previews.
 *
 * This extension provides UNIQ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Uniq.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Uniq: Any
  get() = object {
      /** UNIQ D10 */
      val D10 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** UNIQ D7 */
      val D7 = "spec:width=600,height=1024,unit=px,dpi=180"

  }
