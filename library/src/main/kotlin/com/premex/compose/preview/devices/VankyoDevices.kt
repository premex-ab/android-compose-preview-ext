package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Vankyo device specifications for Android Compose previews.
 *
 * This extension provides Vankyo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vankyo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vankyo: Any
  get() = object {
      /** Vankyo P40 */
      val P40 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Vankyo Z10 */
      val Z10 = "spec:width=1200,height=1920,unit=px,dpi=213"

  }
