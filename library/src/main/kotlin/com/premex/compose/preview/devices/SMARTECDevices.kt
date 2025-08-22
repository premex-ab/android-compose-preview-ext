package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SMARTEC device specifications for Android Compose previews.
 *
 * This extension provides SMARTEC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SMARTEC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SMARTEC: Any
  get() = object {
      /** SMARTEC SmartabS4 */
      val SMARTABS4 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
