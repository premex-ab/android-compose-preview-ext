package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VIDA device specifications for Android Compose previews.
 *
 * This extension provides VIDA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VIDA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VIDA: Any
  get() = object {
      /** VIDA S63Plus */
      val S63PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

      /** VIDA VIDA_i501 */
      val VIDA_I501 = "spec:width=720,height=1280,unit=px,dpi=300"

  }
