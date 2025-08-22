package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Rhino device specifications for Android Compose previews.
 *
 * This extension provides Rhino device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Rhino.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Rhino: Any
  get() = object {
      /** Rhino pace */
      val PACE = "spec:width=480,height=960,unit=px,dpi=213"

      /** Rhino portal */
      val PORTAL = "spec:width=480,height=960,unit=px,dpi=213"

      /** Rhino Rhino_M10p */
      val RHINO_M10P = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Rhino Rhino_T8 */
      val RHINO_T8 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
