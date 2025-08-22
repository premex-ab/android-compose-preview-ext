package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BATMAN device specifications for Android Compose previews.
 *
 * This extension provides BATMAN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Batman.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Batman: Any
  get() = object {
      /** BATMAN TM-MID1065BT */
      val TM_MID1065BT = "spec:width=800,height=1280,unit=px,dpi=160"

  }
