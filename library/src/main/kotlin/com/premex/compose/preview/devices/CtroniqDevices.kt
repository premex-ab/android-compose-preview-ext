package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CTRONIQ device specifications for Android Compose previews.
 *
 * This extension provides CTRONIQ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ctroniq.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ctroniq: Any
  get() = object {
      /** CTRONIQ CTRONIQ-SNOOK-X10 */
      val CTRONIQ_SNOOK_X10 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** CTRONIQ CTRONIQ-SNOOK-X10L */
      val CTRONIQ_SNOOK_X10L = "spec:width=800,height=1280,unit=px,dpi=240"

      /** CTRONIQ 4G_TABLET */
      val _4G_TABLET = "spec:width=800,height=1280,unit=px,dpi=213"

  }
