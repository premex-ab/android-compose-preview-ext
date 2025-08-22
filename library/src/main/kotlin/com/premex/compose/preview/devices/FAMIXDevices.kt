package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FAMIX device specifications for Android Compose previews.
 *
 * This extension provides FAMIX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FAMIX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FAMIX: Any
  get() = object {
      /** FAMIX F10L */
      val F10L = "spec:width=800,height=1280,unit=px,dpi=160"

      /** FAMIX F11 */
      val F11 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
