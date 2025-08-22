package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Qlink device specifications for Android Compose previews.
 *
 * This extension provides Qlink device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Qlink.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Qlink: Any
  get() = object {
      /** Qlink Scepter8 */
      val SCEPTER8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Qlink Scepter8_tablet */
      val SCEPTER8_TABLET = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Qlink Scepter_8 */
      val SCEPTER_8 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
