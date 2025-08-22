package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Trekstor device specifications for Android Compose previews.
 *
 * This extension provides Trekstor device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Trekstor.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Trekstor: Any
  get() = object {
      /** Trekstor TFMTKAW01216 */
      val TFMTKAW01216 = "spec:width=1080,height=1920,unit=px,dpi=213"

      /** Trekstor TFMTKAW01232 */
      val TFMTKAW01232 = "spec:width=1080,height=1920,unit=px,dpi=160"

      /** Trekstor TFMTKAW01332 */
      val TFMTKAW01332 = "spec:width=1080,height=1920,unit=px,dpi=213"

      /** Trekstor THMTKAW01232 */
      val THMTKAW01232 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
