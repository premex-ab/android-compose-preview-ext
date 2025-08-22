package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Coby device specifications for Android Compose previews.
 *
 * This extension provides Coby device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Coby.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Coby: Any
  get() = object {
      /** Coby Dorado */
      val DORADO = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** Coby MID-CBY1108 */
      val MID_CBY1108 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
