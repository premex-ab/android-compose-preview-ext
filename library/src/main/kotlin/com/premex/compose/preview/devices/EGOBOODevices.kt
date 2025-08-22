package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EGOBOO device specifications for Android Compose previews.
 *
 * This extension provides EGOBOO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EGOBOO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EGOBOO: Any
  get() = object {
      /** EGOBOO EB101 */
      val EB101 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** EGOBOO EB104 */
      val EB104 = "spec:width=1200,height=2000,unit=px,dpi=280"

  }
