package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Allview device specifications for Android Compose previews.
 *
 * This extension provides Allview device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Allview.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Allview: Any
  get() = object {
      /** Allview shinagawa */
      val SHINAGAWA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Allview Viva_Play_804 */
      val VIVA_PLAY_804 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
